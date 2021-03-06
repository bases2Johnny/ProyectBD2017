/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerLista;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Estrategia;
import model.classes.RemoteBat;
import model.classes.RenderButton;

/**
 *
 * @author casca
 */
public class ListaEstrategias extends javax.swing.JFrame implements Observer {

    /**
     * Creates new form ListaEstrategias
     *
     * @param nameServer
     */
    public ListaEstrategias(String nameServer, ServidoresConectados sc) {
        initComponents();

        this.cl = new ControllerLista();
        this.nameServer = nameServer;
        this.sc = sc;
        this.ip = cl.getIp(nameServer);
        init();

    }

    public void setNameServer(String nameServer) {
        this.nameServer = nameServer;
    }

    public void init() {
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.cl.registrarObservador(this);
        this.createTab();
    }

    public void createTab() {
        String[] columnNames = {"Nombre",
            "Dias",
            "Hora",
            "Estado",
            "Ejecutado",
            "Estrategia"
        };
        Object[][] data = {};
        System.out.println(this.nameServer);
        ArrayList<Estrategia> list = cl.getEstrategias(this.nameServer);
        //System.out.println("Hola estoy aqui!!");
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        //this.tableE.setModel(model);
        RenderButton buttonColumn;
        int i = 1;
        for (Estrategia est : list) {
            Object[] array = est.toString().split("-");
            if (!array[3].equals("0")) {
                array[3] = "Activo";
                array[4] = (array[4].equals("0") ? "No ejecutado" : "Ejecutado");
                model.addRow(array);
                this.tableE.setModel(model);
                this.editarLaVara(new JButton("Ejecutar"), i, est);
                i++;
            }
        }
        this.tableE.setRowHeight(32);
        this.tableE.setModel(model);
        this.tableE.getColumnModel().getColumn(5).setPreferredWidth(400);
        this.tableE.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
    }

    GridBagConstraints gridBagConstraints = new GridBagConstraints();

    public void editarLaVara(JButton btn, int row, Estrategia est) {
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = row;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        btn.addActionListener((ActionEvent ae) -> {
//            System.out.println(est.getEstrategia());
            RemoteBat rb = new RemoteBat(this.ip, est.getEstrategia());
            rb.startSender();
            if(cl.EstrategiaEjecutada(est.getEstrategia(), this.nameServer)){
                this.createTab();
                update(this.cl.getModel(),this.tableE);
            }
        });
        
        jPanel1.add(btn, gridBagConstraints);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        titleServidores = new javax.swing.JLabel();
        panelEstrategias = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableE = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(822, 342));
        setMinimumSize(new java.awt.Dimension(822, 342));
        setPreferredSize(new java.awt.Dimension(822, 342));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        titleServidores.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        titleServidores.setText("Estrategias ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(titleServidores, gridBagConstraints);

        panelEstrategias.setLayout(new java.awt.GridBagLayout());

        tableE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Estrategia", "Dias", "Hora", "Estado", "Ejecutado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableE);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.1;
        panelEstrategias.add(jScrollPane1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(panelEstrategias, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Ejecutar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        jPanel1.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        getContentPane().add(jPanel1, gridBagConstraints);

        jButton1.setText("Atras");
        jButton1.setActionCommand("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(jButton1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        this.sc.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelEstrategias;
    private javax.swing.JTable tableE;
    private javax.swing.JLabel titleServidores;
    // End of variables declaration//GEN-END:variables
    private String nameServer;
    private String ip;
    private ControllerLista cl;
    private ServidoresConectados sc;

    @Override
    public void update(Observable o, Object o1) {
         getContentPane().repaint();
    }
}

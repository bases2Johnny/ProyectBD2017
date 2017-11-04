/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.AddServerController;
import controller.ControllerServCon;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import model.CNS;
import model.models.AddServerModel;
import model.models.ModelServCon;

/**
 *
 * @author casca
 */
public class ServidoresConectados extends JFrame {

    /**
     * Creates new form ServidoresConectados
     *
     * @param control
     * @param modelo
     */
    private ControllerServCon control;

    public ServidoresConectados(ControllerServCon control) {
        this.control = control;
        initComponents();
        initComponentsMe();
        insertValues();
    }
    private void initComponentsMe() {
        GridLayout layout = new GridLayout(0, 5);
        this.bodyPanel.setLayout(layout);
        this.bodyPanel.add(this.nombreCNServ);
        this.bodyPanel.add(this.estadoCNServ);
        this.bodyPanel.add(this.inpecCNServ);
        this.bodyPanel.add(this.editCNServ);
        this.bodyPanel.add(this.seleccionarCNServ);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
    }

    private void insertValues() {
        CNS cns = this.control.getCNS();
        cns.getRows().stream().forEach(cn -> {
            this.bodyPanel.add(cn.getNombre());
            this.bodyPanel.add(cn.getEstado());
            this.bodyPanel.add(cn.getInspeccionar());
            this.bodyPanel.add(cn.getEditar());
            cn.getRadioButton().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    name=e.getActionCommand();
                    System.out.println(e.getActionCommand());
                    btnCreate.setEnabled(true);
                }
            });
            this.RadioButtonConectar.add(cn.getRadioButton());
            this.bodyPanel.add(cn.getRadioButton());
        });
    }
    
    public String getServerName(){
        return this.name;
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

        RadioButtonConectar = new javax.swing.ButtonGroup();
        head = new javax.swing.JPanel();
        titleServidores = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        body = new javax.swing.JPanel();
        palenContainTable = new javax.swing.JPanel();
        headerNames = new javax.swing.JPanel();
        nombreCNServ = new javax.swing.JLabel();
        estadoCNServ = new javax.swing.JLabel();
        inpecCNServ = new javax.swing.JLabel();
        editCNServ = new javax.swing.JLabel();
        seleccionarCNServ = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnCreate = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(629, 371));
        setMinimumSize(new java.awt.Dimension(629, 371));
        setPreferredSize(new java.awt.Dimension(629, 371));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        head.setLayout(new java.awt.GridBagLayout());

        titleServidores.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        titleServidores.setText("Servidores");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        head.add(titleServidores, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(head, gridBagConstraints);

        body.setLayout(new java.awt.GridBagLayout());

        palenContainTable.setLayout(new java.awt.GridBagLayout());

        headerNames.setLayout(new java.awt.GridBagLayout());

        nombreCNServ.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        nombreCNServ.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nombreCNServ.setText("Nombre");
        nombreCNServ.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        nombreCNServ.setMaximumSize(new java.awt.Dimension(100, 14));
        nombreCNServ.setMinimumSize(new java.awt.Dimension(100, 14));
        nombreCNServ.setPreferredSize(new java.awt.Dimension(100, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        headerNames.add(nombreCNServ, gridBagConstraints);

        estadoCNServ.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        estadoCNServ.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        estadoCNServ.setText("Estado");
        estadoCNServ.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        estadoCNServ.setMaximumSize(new java.awt.Dimension(100, 14));
        estadoCNServ.setMinimumSize(new java.awt.Dimension(100, 14));
        estadoCNServ.setPreferredSize(new java.awt.Dimension(100, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        headerNames.add(estadoCNServ, gridBagConstraints);

        inpecCNServ.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        inpecCNServ.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        inpecCNServ.setText("Inspeccionar");
        inpecCNServ.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        inpecCNServ.setMaximumSize(new java.awt.Dimension(100, 14));
        inpecCNServ.setMinimumSize(new java.awt.Dimension(100, 14));
        inpecCNServ.setPreferredSize(new java.awt.Dimension(100, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        headerNames.add(inpecCNServ, gridBagConstraints);

        editCNServ.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        editCNServ.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        editCNServ.setText("Editar");
        editCNServ.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        editCNServ.setMaximumSize(new java.awt.Dimension(100, 14));
        editCNServ.setMinimumSize(new java.awt.Dimension(100, 14));
        editCNServ.setPreferredSize(new java.awt.Dimension(100, 14));
        headerNames.add(editCNServ, new java.awt.GridBagConstraints());

        seleccionarCNServ.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        seleccionarCNServ.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        seleccionarCNServ.setText("Seleccionar");
        seleccionarCNServ.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        seleccionarCNServ.setMaximumSize(new java.awt.Dimension(100, 14));
        seleccionarCNServ.setMinimumSize(new java.awt.Dimension(100, 14));
        seleccionarCNServ.setPreferredSize(new java.awt.Dimension(100, 14));
        headerNames.add(seleccionarCNServ, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        palenContainTable.add(headerNames, gridBagConstraints);

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        palenContainTable.add(bodyPanel, gridBagConstraints);

        body.add(palenContainTable, new java.awt.GridBagConstraints());

        jScrollPane1.setViewportView(body);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(jScrollPane1, gridBagConstraints);

        btnCreate.setText("Crear Estrategia");
        btnCreate.setEnabled(false);
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnCreate)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnCreate)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        getContentPane().add(jPanel1, gridBagConstraints);

        btnAgregar.setText("Agregar Servidor");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        getContentPane().add(btnAgregar, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        ventana = new Estategias();
        ventana.setVisible(true);
        ventana.setServerName(this.name);
        ventana.setVentana(this);
        ventana.paintTablespaces();
        this.setVisible(false);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        this.ventana2 = new AddServers(new AddServerController(new AddServerModel()));
        this.ventana2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAgregarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ServidoresConectados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServidoresConectados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServidoresConectados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServidoresConectados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ControllerServCon c = new ControllerServCon(new ModelServCon());
                new ServidoresConectados(c).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup RadioButtonConectar;
    private javax.swing.JPanel body;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel editCNServ;
    private javax.swing.JLabel estadoCNServ;
    private javax.swing.JPanel head;
    private javax.swing.JPanel headerNames;
    private javax.swing.JLabel inpecCNServ;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombreCNServ;
    private javax.swing.JPanel palenContainTable;
    private javax.swing.JLabel seleccionarCNServ;
    private javax.swing.JLabel titleServidores;
    // End of variables declaration//GEN-END:variables
    private String name;
    Estategias ventana;
    AddServers ventana2;
}

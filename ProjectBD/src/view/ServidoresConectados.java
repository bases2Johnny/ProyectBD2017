/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.GridLayout;

/**
 *
 * @author casca
 */
public class ServidoresConectados extends javax.swing.JFrame {

    /**
     * Creates new form ServidoresConectados
     */
    public ServidoresConectados() {
        initComponents();
        initComponentsMe();
    }
    private void initComponentsMe(){
        GridLayout layout = new GridLayout(0,2);
        this.bodyPanel.setLayout(layout);
    }
    
    private void insertValues(){
        
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

        head = new javax.swing.JPanel();
        titleServidores = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        palenContainTable = new javax.swing.JPanel();
        headerNames = new javax.swing.JPanel();
        nombreCNServ = new javax.swing.JLabel();
        estadoCNServ = new javax.swing.JLabel();
        inpecCNServ = new javax.swing.JLabel();
        editCNServ = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(head, gridBagConstraints);

        body.setLayout(new java.awt.GridBagLayout());

        palenContainTable.setLayout(new java.awt.GridBagLayout());

        headerNames.setLayout(new java.awt.GridBagLayout());

        nombreCNServ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreCNServ.setText("Nombre");
        nombreCNServ.setMaximumSize(new java.awt.Dimension(100, 14));
        nombreCNServ.setMinimumSize(new java.awt.Dimension(100, 14));
        nombreCNServ.setPreferredSize(new java.awt.Dimension(100, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        headerNames.add(nombreCNServ, gridBagConstraints);

        estadoCNServ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estadoCNServ.setText("Estado");
        estadoCNServ.setMaximumSize(new java.awt.Dimension(100, 14));
        estadoCNServ.setMinimumSize(new java.awt.Dimension(100, 14));
        estadoCNServ.setPreferredSize(new java.awt.Dimension(100, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        headerNames.add(estadoCNServ, gridBagConstraints);

        inpecCNServ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inpecCNServ.setText("Inspeccionar");
        inpecCNServ.setMaximumSize(new java.awt.Dimension(100, 14));
        inpecCNServ.setMinimumSize(new java.awt.Dimension(100, 14));
        inpecCNServ.setPreferredSize(new java.awt.Dimension(100, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        headerNames.add(inpecCNServ, gridBagConstraints);

        editCNServ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editCNServ.setText("Editar");
        editCNServ.setMaximumSize(new java.awt.Dimension(100, 14));
        editCNServ.setMinimumSize(new java.awt.Dimension(100, 14));
        editCNServ.setPreferredSize(new java.awt.Dimension(100, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        headerNames.add(editCNServ, gridBagConstraints);

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
        palenContainTable.add(bodyPanel, gridBagConstraints);

        body.add(palenContainTable, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(body, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                new ServidoresConectados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JLabel editCNServ;
    private javax.swing.JLabel estadoCNServ;
    private javax.swing.JPanel head;
    private javax.swing.JPanel headerNames;
    private javax.swing.JLabel inpecCNServ;
    private javax.swing.JLabel nombreCNServ;
    private javax.swing.JPanel palenContainTable;
    private javax.swing.JLabel titleServidores;
    // End of variables declaration//GEN-END:variables
}
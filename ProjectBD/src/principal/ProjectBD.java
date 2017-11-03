/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import controller.AddServerController;
import controller.ControllerServCon;
import controller.MenuPrincipalController;
import model.models.AddServerModel;
import model.models.ModelServCon;
import view.AddServers;
import view.Estategias;
import view.MenuPrincipal;
import view.ServidoresConectados;

/**
 *
 * @author jimen
 */
public class ProjectBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        MenuPrincipalController c
                = new MenuPrincipalController(
                        new ServidoresConectados(new ControllerServCon(new ModelServCon())),
                        new Estategias(),
                        new AddServers(new AddServerController(new AddServerModel())));
        new MenuPrincipal(c).setVisible(true);
    }

}

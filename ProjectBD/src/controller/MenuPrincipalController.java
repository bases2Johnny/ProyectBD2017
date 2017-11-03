/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.AddServers;
import view.Estategias;
import view.ServidoresConectados;

/**
 *
 * @author jimen
 */
public class MenuPrincipalController {

    public MenuPrincipalController(ServidoresConectados servCon, Estategias estrategiasView, AddServers addSerView) {
        this.servCon = servCon;
        this.estrategiasView = estrategiasView;
        this.addSerView = addSerView;
    }
    
    public void goToAddServers(){
        this.addSerView.setVisible(true);
    }
    
    private final ServidoresConectados servCon;
    private final Estategias estrategiasView;
    private final AddServers addSerView;
}

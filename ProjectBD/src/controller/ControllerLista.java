/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Estrategia;
import java.util.ArrayList;
import model.ModelLista;

/**
 *
 * @author casca
 */
public class ControllerLista {

    public ControllerLista() {
        this.model= new ModelLista();
    }
    
    public ArrayList<Estrategia> getEstrategias(String name){
        return model.getEstrategias(name);
    }
    private ModelLista model; 
}

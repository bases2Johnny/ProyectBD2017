/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Estrategia;
import java.util.ArrayList;
import java.util.Observer;
import model.ModelLista;

/**
 *
 * @author casca
 */
public class ControllerLista {

    public ControllerLista() {
        this.model = new ModelLista();
    }

    public ArrayList<Estrategia> getEstrategias(String name) {
        return model.getEstrategias(name);
    }

    public Boolean EstrategiaEjecutada(String est, String name) {
        return model.EstrategiaEjecutada(est, name);
    }

    public ModelLista getModel() {
        return model;
    }
    
    

    public String getIp(String name) {
        return model.getIp(name);
    }

    private ModelLista model;

    public void registrarObservador(Observer obs) {
        model.addObserver(obs);
    }

}

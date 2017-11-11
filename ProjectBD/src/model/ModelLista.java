/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import database.Conection;
import database.DataHandler;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author casca
 */
public class ModelLista extends Observable {

    public ModelLista() {
        this.dh = new DataHandler(new Conection());
    }

    public ArrayList<Estrategia> getEstrategias(String name) {
        return dh.getEstrategias1(name);
    }

    public Boolean EstrategiaEjecutada(String est, String name) {
        return dh.EstrategiaEjecutada(est, name);
    }

    public String getIp(String name) {
        return dh.getIp(name);
    }

    @Override
    public synchronized void addObserver(Observer obsrvr) {
        super.addObserver(obsrvr);
        setChanged();
        notifyObservers();
    }

    DataHandler dh;

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.models;

import database.Conection;
import database.DataHandler;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import model.CNS;
import model.RowCNS;

/**
 *
 * @author jimen
 */
public class ModelServCon extends Observable {

    public ModelServCon() {
        this.dbH = new DataHandler(new Conection());
    }

    public ArrayList<RowCNS> getCNS() {
        return this.dbH.getCNS();
    }

    public DataHandler getDbH() {
        return dbH;
    }

    private CNS cns;
    private DataHandler dbH;
    private CNS conecs;

    @Override
    public void addObserver(Observer obs) {
        super.addObserver(obs);
        setChanged();
        notifyObservers();
    }
}

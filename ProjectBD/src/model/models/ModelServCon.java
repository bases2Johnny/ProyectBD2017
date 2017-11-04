/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.models;

import controller.ControllerServCon;
import database.Conection;
import database.DataHandler;
import model.CNS;

/**
 *
 * @author jimen
 */
public class ModelServCon {

    public ModelServCon() {
        this.dbH = new DataHandler(new Conection());
    }
    public CNS getCNS(){
        return this.dbH.getCNS();
    }
    
    private CNS cns;
    private DataHandler dbH;
    private CNS conecs;
}

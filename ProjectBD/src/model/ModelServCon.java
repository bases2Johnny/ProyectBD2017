/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import database.Conection;
import database.DataHandler;
import java.util.ArrayList;

/**
 *
 * @author jimen
 */
public class ModelServCon {

    public ModelServCon() {
        this.dbH = new DataHandler(new Conection());
    }
    public ArrayList<RowCNS>  getCNS(){
        return this.dbH.getCNS();
    }
   
    private CNS cns;
    private DataHandler dbH;
    private CNS conecs;
}

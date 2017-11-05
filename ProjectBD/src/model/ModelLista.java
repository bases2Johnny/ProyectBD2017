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
 * @author casca
 */
public class ModelLista {

    public ModelLista() {
        this.dh= new DataHandler(new Conection());
    }
    public ArrayList<Estrategia> getEstrategias(String name){
        return dh.getEstrategias1(name);
    }
    DataHandler dh ;
}

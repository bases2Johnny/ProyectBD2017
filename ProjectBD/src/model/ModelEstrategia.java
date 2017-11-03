/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import File.File;
import database.Conection;
import database.DataHandler;
import java.util.ArrayList;

/**
 *
 * @author maiko
 */
public class ModelEstrategia {

    public ModelEstrategia() {
        this.dbH = new DataHandler(new Conection());
    }

    public ArrayList<String> getTablespaces() {
        return dbH.getTablespaces();
    }

    public void write(String texto,String name,String dir) {
        file = new File();
        file.write(texto,name,dir);
    }
    public void insert(String sql){
        dbH.insertEstrategia(sql);
    }
    public int getTam(){
        return dbH.getEstrategias();
    }
    
    private DataHandler dbH;
    private File file;
}

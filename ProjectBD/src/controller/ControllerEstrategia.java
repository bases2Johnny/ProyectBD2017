
package controller;

import java.util.ArrayList;
import model.ModelEstrategia;

public class ControllerEstrategia {
     public ControllerEstrategia(ModelEstrategia modelo) {
        this.modelo = modelo;
    }
    public ArrayList<String> getTablespaces(String name){
        return modelo.getTablespaces(name);
    }
    public void write(String texto,String name,String dir){
        modelo.write(texto,name,dir);
    }
    public void insert(String sql, String name){
        modelo.insert(sql,name);
    }
    public int getTam(String name){
        return modelo.getTam(name);
    }
    
    ModelEstrategia modelo;
}

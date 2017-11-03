
package controller;

import java.util.ArrayList;
import model.ModelEstrategia;

public class ControllerEstrategia {
     public ControllerEstrategia(ModelEstrategia modelo) {
        this.modelo = modelo;
    }
    public ArrayList<String> getTablespaces(){
        return modelo.getTablespaces();
    }
    public void write(String texto,String name,String dir){
        modelo.write(texto,name,dir);
    }
    public void insert(String sql){
        modelo.insert(sql);
    }
    public int getTam(){
        return modelo.getTam();
    }
    
    ModelEstrategia modelo;
}

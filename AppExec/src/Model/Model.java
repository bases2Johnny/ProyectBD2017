package Model;

import Database.Conection;
import Database.DataHandler;
import File.Ejecutar;
import File.File;
import java.util.ArrayList;

public class Model {

    public Model() {
        this.dh = new DataHandler(new Conection());
        file= new File();
        exec = new Ejecutar();
    }
    
    public ArrayList<Estrategia> getEstrategias(){
        return dh.getEstrategias();
    }
    
    public void write(String texto,String name,String dir){
        file.write(texto, name, dir);
    }
    public void execute(String comando){
        exec.cargarBat(comando);
    }
    public void update(String name){
        dh.update(name);
    }
    
    private DataHandler dh;
    private File file;
    private Ejecutar exec;
}

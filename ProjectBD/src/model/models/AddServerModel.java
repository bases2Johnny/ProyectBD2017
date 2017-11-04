package model.models;

import database.Conection;
import database.DataHandler;
import java.util.ArrayList;
import model.Servidor;

public class AddServerModel {

    public AddServerModel() {
        this.dbH = new DataHandler(new Conection());
    }
    public ArrayList<Object> createNewServer(Servidor server){
        return dbH.AddServer(server);
    }
    
    public ArrayList<String> getValues(String nombre) {
        return dbH.getDatabaseLinkValues(nombre);
    }
    
    public ArrayList<Object> editServer(Servidor server) {
        return dbH.editServer(server);
    }
    
    private final DataHandler dbH;


}

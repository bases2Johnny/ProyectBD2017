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
    private final DataHandler dbH;
}

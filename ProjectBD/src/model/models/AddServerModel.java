package model.models;

import database.Conection;
import database.DataHandler;
import model.Servidor;

public class AddServerModel {

    public AddServerModel() {
        this.dbH = new DataHandler(new Conection());
    }
    public Boolean createNewServer(Servidor server){
        String query = "";
        return dbH.addServer(query);
    }
    private final DataHandler dbH;
}

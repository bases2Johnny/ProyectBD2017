package controller;

import java.util.ArrayList;
import model.Servidor;
import model.models.AddServerModel;

public class AddServerController {

    public AddServerController(AddServerModel model) {
        this.model = model;
    }
    
    public ArrayList<Object> addServer(Servidor server){
        return model.createNewServer(server);
    }
    
    private final AddServerModel model;
}

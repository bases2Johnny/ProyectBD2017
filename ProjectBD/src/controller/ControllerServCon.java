package controller;

import java.util.ArrayList;
import model.CNS;
import model.models.ModelServCon;
import model.RowCNS;

public class ControllerServCon {

    public ControllerServCon(ModelServCon modelo) {
        this.modelo = modelo;
    }

    public CNS getCNS() {      
        CNS c = new CNS(this.modelo.getCNS());
        return c;
    }
    
    
    

    private ModelServCon modelo;
}

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
        RowCNS cn0 = new RowCNS();
        RowCNS cn1 = new RowCNS();
        RowCNS cn2 = new RowCNS();
        ArrayList<RowCNS> cons = new ArrayList();
        cons.add(cn0);
        cons.add(cn1);
        cons.add(cn2);
        CNS c = new CNS(cons);
        return c;
    }
    
    
    

    private ModelServCon modelo;
}

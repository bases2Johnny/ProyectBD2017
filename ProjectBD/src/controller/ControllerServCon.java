package controller;

import java.util.Observer;
import model.CNS;
import model.models.ModelServCon;

public class ControllerServCon {

    public ControllerServCon(ModelServCon modelo) {
        this.modelo = modelo;
    }

    public CNS getCNS() {      
        CNS c = new CNS(this.modelo.getCNS());
        return c;
    }

    public void regitraObserver(Observer obs){
        modelo.addObserver(obs);
    }
    
    private ModelServCon modelo;

    public ModelServCon getModelo() {
        return modelo;
    }
}

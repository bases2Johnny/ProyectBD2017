/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Controller;

/**
 *
 * @author jimen
 */
public class Model {

    public Model(Controller control) {
        this.control = control;
    }
    
    private Controller control;
    private CNS conecs;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.ModelAddServers;

/**
 *
 * @author usuario
 */
public class ControllerAddServers {
    public ControllerAddServers(ModelAddServers modelo) {
        this.modelo = modelo;
    }

    public void write(String texto,String name,String dir){
        modelo.addServer();
    }
    ModelAddServers modelo;
    
    
}

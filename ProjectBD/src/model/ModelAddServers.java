/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import File.File;
import database.Conection;
import database.DataHandler;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class ModelAddServers {
    public ModelAddServers() {
        this.dbH = new DataHandler(new Conection());
    }

    public void addServer() {
        dbH.AddServer();
    }

    private DataHandler dbH;
}

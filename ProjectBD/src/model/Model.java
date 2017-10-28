/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author jimen
 */
public class Model {

    public Model() {
        this.logsPanels = new ArrayList();
    }

    public Model(ArrayList<JPanel> logsPanels) {
        this.logsPanels = logsPanels;
    }

    public ArrayList<JPanel> getLogsPanels() {
        return logsPanels;
    }

    public void setLogsPanels(ArrayList<JPanel> logsPanels) {
        this.logsPanels = logsPanels;
    }

    private ArrayList<JPanel> logsPanels;
}

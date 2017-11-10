/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author casca
 */
public class RowCNS {

    public RowCNS(String nombreText) {
        this.nombreText = nombreText;
        this.estadoText = "Correcto";
        this.info = null;

        /*---- Create Components ------*/
        this.nombre = new JLabel(this.nombreText);
        this.estado = new JLabel(this.estadoText);
        this.inspeccionar = new JButton(this.inspeccionarText);
        this.editar = new JButton(this.editarText);
        this.radioButton = new JRadioButton();
        this.radioButton.setActionCommand(nombreText);
    }

    public RowCNS(String nombreText, String estadoText, InformacionCN info) {
        this.nombreText = nombreText;
        this.estadoText = estadoText;
        this.info = info;

        /*---- Create Components ------*/
        this.nombre = new JLabel(this.nombreText);
        this.estado = new JLabel(this.estadoText);
        this.inspeccionar = new JButton(this.inspeccionarText);
        this.editar = new JButton(this.editarText);
        setComponents();
    }

    private void setComponents() {
        this.nombre.setPreferredSize(new Dimension(100, 14));
        this.estado.setPreferredSize(new Dimension(100, 14));
        this.inspeccionar.setPreferredSize(new Dimension(100, 14));
        this.editar.setPreferredSize(new Dimension(100, 14));
    }

    public JLabel getNombre() {
        return nombre;
    }

    public JLabel getEstado() {
        return estado;
    }

    public JButton getInspeccionar() {
        return inspeccionar;
    }

    public JButton getEditar() {
        return editar;
    }

    public InformacionCN getInfo() {
        return info;
    }
    
    public JRadioButton getRadioButton(){
        return this.radioButton;
    }
    
    /*---------  Text of the components ----------*/
    private String nombreText;
    private String estadoText;
    private final String inspeccionarText = "Ver";
    private final String editarText = "Editar";
    /*---------  Components  -------------*/
    private JLabel nombre;
    private JLabel estado;
    private JButton inspeccionar;
    private JButton editar;
    private JRadioButton radioButton;
    private InformacionCN info;
}

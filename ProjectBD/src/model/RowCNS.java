/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author casca
 */
public class RowCNS {

    public RowCNS(String nombreText, String estadoText, InformacionCN info) {
        this.nombreText = nombreText;
        this.estadoText = estadoText;
        this.info = info;
        
        /*---- Create Components ------*/
        
        this.nombre = new JLabel(this.nombreText);
        this.estado = new JLabel(this.estadoText);
        this.inspeccionar = new JButton(this.inspeccionarText);
        this.editar = new JButton(this.editarText);
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
    private InformacionCN info;
}

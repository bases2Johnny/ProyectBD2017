/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author casca
 */
public class TipoEstrategia {

    public TipoEstrategia(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "TipoEstrategia{" + "nombre=" + nombre + '}';
    }
    
    String nombre;
}

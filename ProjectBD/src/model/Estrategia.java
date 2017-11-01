/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author casca
 */
public class Estrategia {

    public Estrategia(TipoEstrategia tipo, String nombre, ArrayList<String> dias, String hora) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.dias = dias;
        this.hora = hora;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.tipo);
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.dias);
        hash = 97 * hash + Objects.hashCode(this.hora);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estrategia other = (Estrategia) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.hora, other.hora)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.dias, other.dias)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Estrategia{" + "tipo=" + tipo + ", nombre=" + nombre + ", dias=" + dias + ", hora=" + hora + '}';
    }

    public TipoEstrategia getTipo() {
        return tipo;
    }

    public void setTipo(TipoEstrategia tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getDias() {
        return dias;
    }

    public void setDias(ArrayList<String> dias) {
        this.dias = dias;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    
    private TipoEstrategia tipo;
    private String nombre;
    private ArrayList<String> dias;
    private String hora;
}

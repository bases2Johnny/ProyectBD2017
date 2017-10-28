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
public class InformacionCN {

    public InformacionCN(Servidor servidor, Estrategia estrategia) {
        this.servidor = servidor;
        this.estrategia = estrategia;
    }

    public Servidor getServidor() {
        return servidor;
    }

    public void setServidor(Servidor servidor) {
        this.servidor = servidor;
    }

    public Estrategia getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }

    @Override
    public String toString() {
        return "InformacionCN{" + "servidor=" + servidor + ", estrategia=" + estrategia + '}';
    }
    
    private Servidor servidor;
    private Estrategia estrategia;
}

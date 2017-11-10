package model;

public class Estrategia {

    public Estrategia(String name, String estrategia, String dias, String hora, String estado, String ejecutado) {
        this.name = name;
        this.dias = dias;
        this.hora = hora;
        this.estrategia = estrategia;
        this.estado = estado;
        this.ejecutado = ejecutado;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEjecutado() {
        return ejecutado;
    }

    public void setEjecutado(String ejecutado) {
        this.ejecutado = ejecutado;
    }

    @Override
    public String toString() {
        return name + "-" + dias + "-" + hora + "-" + estado + "-" + ejecutado+  "-" + estrategia ;
    }

    private String name;
    private String dias;
    private String hora;
    private String estrategia;
    private String estado;
    private String ejecutado;
}

package br.com.model;

public class City{
    private String name;
    private String estado;

    public City(String name, String estado){
        this.name = name;
        this.estado = estado;
    }

    public String getName() {
        return name;
    }

    public String getEstado() {
        return estado;
    }

    public City setName(String name) {
        this.name = name;
        return this;
    }

    public City setEstado(String estado) {
        this.estado = estado;
        return this;
    }
}
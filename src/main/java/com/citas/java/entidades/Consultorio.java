package com.citas.java.entidades;

public class Consultorio {
    public Integer id;
    public String direccion;
    public Integer numero;

    public Consultorio(Integer id, String direccion, Integer numero) {
        this.id = id;
        this.direccion = direccion;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Consultorio [id=" + id + ", direccion=" + direccion + ", numero=" + numero + "]";
    }
    
    
    
}

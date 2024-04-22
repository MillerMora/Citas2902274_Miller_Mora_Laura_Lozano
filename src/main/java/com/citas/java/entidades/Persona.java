package com.citas.java.entidades;

import com.citas.java.enumeraciones.TipoDocumento;

public abstract class Persona {
    private Integer id;
    private String nombres;
    private String apellidos;
    private TipoDocumento tipoDocumento; 
    private Integer numerodeDocumento;

    public Persona(Integer id, String nombres, String apellidos, TipoDocumento tipoDocumento, Integer numerodeDocumento) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoDocumento = tipoDocumento;
        this.numerodeDocumento = numerodeDocumento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Integer getNumerodeDocumento() {
        return numerodeDocumento;
    }

    public void setNumerodeDocumento(Integer numerodeDocumento) {
        this.numerodeDocumento = numerodeDocumento;
    }

    
    

}

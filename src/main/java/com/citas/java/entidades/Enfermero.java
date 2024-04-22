package com.citas.java.entidades;

import com.citas.java.enumeraciones.TipoDocumento;

public class Enfermero extends Persona {
    public Enfermero(Integer id, String nombres, String apellidos, TipoDocumento tipoDocumento, Integer numerodeDocumento) {
        super(id, nombres, apellidos, tipoDocumento, numerodeDocumento);
}

    @Override
    public String toString() {
        return "Enfermero []";
    }

    
}
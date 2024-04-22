package com.citas.java.entidades;

import com.citas.java.enumeraciones.Especialidad;
import com.citas.java.enumeraciones.TipoDocumento;

public class Medico extends Persona{
    private Integer registroMedico;
    private Especialidad especialidad;
    
    public Medico(Integer id, String nombres, String apellidos, TipoDocumento tipoDocumento, Integer numerodeDocumento,
            Integer registroMedico, Especialidad especialidad) {
        super(id, nombres, apellidos, tipoDocumento, numerodeDocumento);
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

    public Integer getRegistroMedico() {
        return registroMedico;
    }

    public void setRegistroMedico(Integer registroMedico) {
        this.registroMedico = registroMedico;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Medico [especialidad=" + especialidad + ", Nombres()=" + getNombres() + ", Apellidos()="
                + getApellidos() + "]";
    }

  
    
    
    
}

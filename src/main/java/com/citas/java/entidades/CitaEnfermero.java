package com.citas.java.entidades;

import java.time.LocalDateTime;

import com.citas.java.enumeraciones.ProcedimientosEnfermeria;

public class CitaEnfermero extends Cita implements IAgendamiento{
    private ProcedimientosEnfermeria procedimientos;
    private Enfermero enfermero;

    public CitaEnfermero(Integer id, LocalDateTime fecha, Paciente paciente, ProcedimientosEnfermeria procedimientos,
            Enfermero enfermero) {
        super(id, fecha, paciente);
        this.procedimientos = procedimientos;
        this.enfermero = enfermero;
    }
    public ProcedimientosEnfermeria getProcedimientos() {
        return procedimientos;
    }
    public void setProcedimientos(ProcedimientosEnfermeria procedimientos) {
        this.procedimientos = procedimientos;
    }
    public Enfermero getEnfermero() {
        return enfermero;
    }
    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }
    @Override
    public void agendarCita(LocalDateTime fechaCita) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agendarCita'");
    }
    @Override
    public void cancelarCita() {
        System.out.println("Cita para procedimiento:" + this.procedimientos + "Cancelada");
    }
    @Override
    public void reagendarCita(LocalDateTime fechaCita) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reagendarCita'");
    }
    @Override
    public String toString() {
        return "CitaEnfermero [procedimientos=" + procedimientos + ", enfermero=" + enfermero + ", getProcedimientos()="
                + getProcedimientos() + "]";
    }


    
}

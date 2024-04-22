package com.citas.java.entidades;


import java.time.LocalDateTime;


import com.citas.java.enumeraciones.Estado;

//Implements: Unicamente para "heredar" comportamientos
//pero solo con interfaces

public class CitaMedico extends Cita implements IAgendamiento{
    private String motivodeConsulta;
    private Medico medico;
    private Estado estado;
   
    public CitaMedico(Integer id, LocalDateTime fecha, Paciente paciente, String motivodeConsulta, Medico medico
            ) {
        super(id, fecha, paciente);
        this.motivodeConsulta = motivodeConsulta;
        this.medico = medico;
        this.estado = Estado.Agendada;
    }

    public String getMotivodeConsulta() {
        return motivodeConsulta;
    }

    public void setMotivodeConsulta(String motivodeConsulta) {
        this.motivodeConsulta = motivodeConsulta;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public void agendarCita(LocalDateTime fechaCita) {
        this.setEstado(Estado.Agendada);
        this.setFecha(fechaCita);

    }

    @Override
    public void cancelarCita() {
       this.estado = Estado.Agendada;
       System.out.println("Cita con medico:" + medico.getNombres() + "Cancelada");
    }

    @Override
    public void reagendarCita(LocalDateTime fechaCita) {
       this.setFecha(fechaCita);
    }

    @Override
    public String toString() {
        return "CitaMedico [paciente=" + paciente + ", medico=" + medico + ", getFecha()=" + getFecha() + "]";
    }


    

}

package com.citas.java.entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface IAgendamiento {
    //Deficiones de metodos
    //solo se ponen las firmas del metodo
    //porque la implementacion 
    //corren por cuenta de las clases
public void agendarCita(LocalDateTime fechaCita);
public void cancelarCita();
public void reagendarCita(LocalDateTime fechaCita);
}

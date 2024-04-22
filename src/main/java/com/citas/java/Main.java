package com.citas.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

import javax.sound.sampled.SourceDataLine;

import com.citas.java.entidades.CitaEnfermero;
import com.citas.java.entidades.CitaMedico;
import com.citas.java.entidades.Consultorio;
import com.citas.java.entidades.Enfermero;
import com.citas.java.entidades.Medico;
import com.citas.java.entidades.Paciente;
import com.citas.java.enumeraciones.Especialidad;
import com.citas.java.enumeraciones.Estado;
import com.citas.java.enumeraciones.ProcedimientosEnfermeria;
import com.citas.java.enumeraciones.TipoDocumento;
import com.citas.java.enumeraciones.TipoSangre;

public class Main {
    public static void main(String[] args) {
        
        Medico m = new Medico(3, 
        "Valentina", 
        "Lozano", 
        TipoDocumento.TI, 
        446466, 
        12, 
        Especialidad.ODONTOLOGIA);

        m.setNombres("Laura");
        System.out.println(m.toString());

        Paciente p = new Paciente(4, 
                                "Miller", 
                                "Gonzales", 
                                TipoDocumento.PPT, 
                                376355,
                                "example@gmail.com",
                                315238665, 
                                LocalDate.of(2024, 07, 05), 
                                1.84, 
                                56.0, 
                                TipoSangre.A, 
                                '+');

        System.out.println(p.toString());

        Consultorio c = new Consultorio(2354, 
                                        "Calle 52", 
                                        31786855);
                                        System.out.println(c.toString());

        Enfermero e = new Enfermero(23, "Dani", "Goméz", TipoDocumento.CM, 19473535);
        System.out.println(e.toString());

        Medico m2 = new Medico(2, 
                                "Edibrando",
                                "Gonzalez", 
                                TipoDocumento.TI,
                                13302192,
                                 14,  
                                 Especialidad.PEDIATRIA);
                                
        Paciente p2 = new Paciente(5, 
        "Felipe", 
        "Perez", 
        TipoDocumento.CC, 
        1032460803, 
        "felipez123@", 
        1455678234, LocalDate.of(2009, Month.FEBRUARY, 23), 
        1.59, 
        85.0, 
        TipoSangre.O, 
        '+');

        Paciente p3 = new Paciente(9, 
        "Andrés", 
        "Ochoa", 
        TipoDocumento.CC, 
        1032460803, 
        "andrez123@", 
        1455678234, LocalDate.of(2009, Month.FEBRUARY, 23), 
        1.59, 
        85.0, 
        TipoSangre.O, 
        '+');


        Paciente p4 = new Paciente(10, 
        "Jacson", 
        "Andrew", 
        TipoDocumento.CC, 
        1032460803, 
        "jacs123@", 
        1455678234, LocalDate.of(2009, Month.FEBRUARY, 23), 
        1.59, 
        85.0, 
        TipoSangre.O, 
        '+');

        Paciente p5 = new Paciente(15, 
        "Nickson", 
        "Butter", 
        TipoDocumento.CC, 
        1032460803, 
        "Nick123@", 
        1455678234, LocalDate.of(2009, Month.FEBRUARY, 23), 
        1.59, 
        85.0, 
        TipoSangre.O, 
        '+');
    
        Enfermero e2 = new Enfermero(29, "Dani", "Goméz", TipoDocumento.CM, 19473535);
        Enfermero e3 = new Enfermero(33, "Dani", "Goméz", TipoDocumento.CM, 19473535);

    
        CitaMedico cm1 = new CitaMedico(2, LocalDateTime.of(2024, 
                                                Month.JANUARY, 
                                                24,
                                                13,
                                                30,
                                                50), 
                                        p5, 
                        "Gripa", 
                                        m2);
    
    
                                        
        //System.out.println("Estado de la cita: "+ cm1.getEstado());
        System.out.println(cm1);
      
        CitaMedico cm2 = new CitaMedico(1, LocalDateTime.of(2024,
                                                        Month.AUGUST,
                                                        24,
                                                        07,
                                                        30,
                                                        20),

                                        p4, 
                        "Escopolamina", 
                                        m);
         //System.out.println("Estado de la cita: "+ cm2.getEstado());
         System.out.println(cm2);

        CitaEnfermero ce1 = new CitaEnfermero(3,
                                             LocalDateTime.of(2024,  
                                             Month.DECEMBER,
                                             12,
                                             06, 
                                             07), 
                                             p2, 
                                             ProcedimientosEnfermeria.VACUNACION, 
                                             e2);
        //System.out.println("PRUEBA: " + ce1);

        CitaEnfermero ce2 = new CitaEnfermero(4, 
                                            LocalDateTime.of(2024,
                                            Month.FEBRUARY,
                                            14,
                                            07, 
                                            50),
                                            p3, 
                                            ProcedimientosEnfermeria.AMBULATORIO, 
                                            e2);
System.out.println("Estado de la cita al: " + ce2);
ce2.cancelarCita();




    }


}       


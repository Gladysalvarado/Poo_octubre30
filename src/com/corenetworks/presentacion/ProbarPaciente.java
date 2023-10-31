package com.corenetworks.presentacion;

import com.corenetworks.modelo.Paciente;

public class ProbarPaciente {
    public static void main(String[] args) {

        Paciente p1 = new Paciente();
        p1. setIdPaciente(1);
        p1.setNombre("Juanito");
        p1.setApellido("Lopez");
        p1.setDni("12356789");
        p1.setDireccion("calle real 25");
        p1.setTelefono("113568555");
        p1.setEmail("juanlopez@yahoo.com");

        System.out.println("idPaciente"+ p1.getIdPaciente());
        System.out.println(p1.toString());


        //*Instanciar otra vez la clase
        Paciente p2 = new Paciente(2,"Manolo", "Gonzales",
                "0125689999","calle Magnolia 130", "256897774","manoloa@yahoo.es" );
        System.out.println(p2.toString());





    }
}

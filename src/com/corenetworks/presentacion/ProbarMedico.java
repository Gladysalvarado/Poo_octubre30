package com.corenetworks.presentacion;

import com.corenetworks.modelo.Medico;

import java.util.Scanner;

public class ProbarMedico {
    public static void main(String[] args) {

        Medico m1= new Medico();
        m1.setIdMedico(78);
        m1.setNombre("PabloAlejandro");
        m1.setApellido("sicilia");
        m1.setCmp("Atpm12546");

        System.out.println("idMedico"+ m1.toString());

        //*Recibir los datos por consola

        Scanner teclado = new Scanner(System.in);
        Medico m2 = new Medico();
        System.out.println("Escribe el id del medico");
        m2.setIdMedico(teclado.nextInt());
        teclado.nextLine();

        System.out.println("Escribe el mombre del medico");
        m2.setNombre(teclado.nextLine());

        System.out.println("Escribe el apellido");
        m2.setApellido(teclado.nextLine());

        System.out.println("Escribe el Cmp");
        m2.setCmp(teclado.nextLine());


        System.out.println(m2.toString());



    }
}

package com.corenetworks.presentacion;

import com.corenetworks.modelo.Cuenta;

import java.util.Scanner;

public class Probarcuenta {
    public static void main(String[] args) {


        //*Declaraciones de Variables

        Cuenta  c1 = new Cuenta("Gladys", 9000.50);
        Scanner teclado = new Scanner(System.in);

         c1.ingresar (500);
         c1.retirar(100);
        System.out.println(c1.toString());








    }
}

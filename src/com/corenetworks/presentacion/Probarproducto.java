package com.corenetworks.presentacion;

import com.corenetworks.modelo.Cuenta;
import com.corenetworks.modelo.Producto;

import java.util.Scanner;

public class Probarproducto {
    public static void main(String[] args) {

        //*Declaraciones de Variables

        Producto p1 = new Producto(500,"Samsumg",600);

        p1.compraProducto (500);
        System.out.println("compra de 500 " + p1.getCantidadExistencias());
        p1.ventaProducto(700);
        System.out.println("venta de 700 " + p1.getCantidadExistencias());
        p1.ventaProducto(1350);





    }
}

package com.corenetworks.modelo;

public class Producto {
    //*Atributos
    private int idProducto;
    private String nombre;
    private int cantidadExistencias;



    //*Metodos
    public void compraProducto(int cantidad){
        if (cantidad>0){
            cantidadExistencias = cantidadExistencias+cantidad;
        }
          }
    public void ventaProducto(int cantidad){

        if (cantidad<=this.cantidadExistencias)
            cantidadExistencias = cantidadExistencias- cantidad;

    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", cantidadExistencias=" + cantidadExistencias +
                '}';
    }

    //-*Constructores
    public Producto() {
}

    public Producto(int idProducto, String nombre, int cantidadExistencias) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.cantidadExistencias = cantidadExistencias;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadExistencias() {
        return cantidadExistencias;
    }

    public void setCantidadExistencias(int cantidadExistencias) {
        this.cantidadExistencias = cantidadExistencias;
    }
}

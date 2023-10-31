package com.corenetworks.modelo;

public class Especialidad {

    private int idEspecialidad;
    private String nombre;


    //*Metodos
    //*no hay
    //* este es el toString
    @Override
    public String toString() {
        return "Especialidad{" +
                "idEspecialidad=" + idEspecialidad +
                ", nombre='" + nombre + '\'' +
                '}';
    }


    //*Constructores


    public Especialidad() {
    }

    public Especialidad(int idEspecialidad, String nombre) {
        this.idEspecialidad = idEspecialidad;
        this.nombre = nombre;
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setEspecialidad(int especialidad) {
        this.idEspecialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

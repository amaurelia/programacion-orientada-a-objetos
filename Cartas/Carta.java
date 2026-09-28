package org.example.model;

public abstract class Carta {

    public String nombre;

    public Carta(String nombre){
        this.nombre = nombre;
    }

    public String toString(){
        return "Nombre: " + this.nombre;
    }

}

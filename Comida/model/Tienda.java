package org.example.model;

public abstract class Tienda {
    private String nombre;
    private String direccion;
    private int telefono;

    public Tienda(String nombre, String direccion, int telefono){
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    // getters
    public String getNombre(){
        return nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public int getTelefono() {
        return telefono;
    }
}

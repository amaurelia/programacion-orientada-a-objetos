package org.example.model;

public class Pizzeria extends Tienda implements Ventas{

    public Pizzeria(String nombre, String direccion, int telefono) {
        super(nombre, direccion, telefono);
    }

    @Override
    public String saludoPersonalizado() {
        return "Bienvenido a la pizzería " + getNombre() + ", la mejor pizza de Chile.";
    }

    @Override
    public String llamarTienda() {
        return "Llamando al " + getTelefono();
    }

    @Override
    public String datosTienda() {
        return "La tienda está ubicada en " + getDireccion() + " y su teléfono es el " + getTelefono();
    }
}

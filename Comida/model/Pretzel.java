package org.example.model;

public class Pretzel extends Tienda implements Ventas {

    public Pretzel(String nombre, String direccion, int telefono) {
        super(nombre, direccion, telefono);
    }

    @Override
    public String saludoPersonalizado() {
        return "Esta es la tienda " + getNombre() + " donde encontrarás los mejores pretzel al mejor precio.";
    }

    @Override
    public String llamarTienda() {
        return "Llamando al " + getTelefono();
    }

    @Override
    public String datosTienda() {
        return "Esta tienda está en " + getDireccion() + ", para más información llame al " + getTelefono();
    }
}

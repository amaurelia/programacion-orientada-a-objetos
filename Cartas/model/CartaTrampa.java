package org.example.model;

public class CartaTrampa extends Carta{
    String efecto;
    int defensa;

    public CartaTrampa(String nombre, String efecto) {
        super(nombre);
        this.efecto = efecto;
    }

    @Override
    public String toString(){
        return "Nombre: " + this.nombre + " Efecto: " + this.efecto ;
    }
}

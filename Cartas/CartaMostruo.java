package org.example.model;

public class CartaMostruo extends Carta {
    int ataque;
    int defensa;

    public CartaMostruo(String nombre, int ataque, int defensa) {
        super(nombre);
        this.ataque = ataque;
        this.defensa = defensa;
    }

    @Override
    public String toString(){
        return "Nombre: " + this.nombre + " Ataque: " + this.ataque + " Defensa: " + this.defensa;
    }
}

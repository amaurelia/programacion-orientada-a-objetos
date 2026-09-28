package org.example.model;

public class Habitacion {

    private int numero;
    private Pokemon pokemon;

    public Habitacion(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public boolean estaOcupada() {
        return pokemon != null;
    }

    public void ocupar(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public void desocupar() {
        this.pokemon = null;
    }
}
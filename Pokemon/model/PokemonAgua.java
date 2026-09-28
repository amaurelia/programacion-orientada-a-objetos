package org.example.model;

import org.example.exception.DatosPokemonInvalidosException;

public class PokemonAgua extends Pokemon {

    public PokemonAgua(String nombre, int nivel, int vida) throws DatosPokemonInvalidosException {
        super(nombre, nivel, vida);
    }

    @Override
    public int calcularTarifa(int dias) {
        int total = dias * 30;
        if(nivel > 20) {
            total += 100;
        }
        return total;
    }
}
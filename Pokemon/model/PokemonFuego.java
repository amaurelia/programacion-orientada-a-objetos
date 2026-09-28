package org.example.model;

import org.example.exception.DatosPokemonInvalidosException;

public class    PokemonFuego extends Pokemon {

    public PokemonFuego(String nombre, int nivel, int vida) throws DatosPokemonInvalidosException {
        super(nombre, nivel, vida);
    }

    @Override
    public int calcularTarifa(int dias) {
        if(dias < 3) {
            return 0;
        }
        return dias * 35;
    }
}
package org.example.model;

import org.example.exception.DatosPokemonInvalidosException;

public class PokemonPlanta extends Pokemon {

    private boolean tieneSemilla;

    public PokemonPlanta( String nombre, int nivel, int vida, boolean tieneSemilla) throws DatosPokemonInvalidosException {
        super(nombre, nivel, vida);
        this.tieneSemilla = tieneSemilla;
    }

    @Override
    public int calcularTarifa(int dias) {
        int total = dias * 25;
        if(tieneSemilla) {
            total -= 45;
        }
        return Math.max(total, 0);
    }

}
package org.example.model;

import org.example.exception.DatosPokemonInvalidosException;

public abstract class Pokemon {

    protected String nombre;
    protected int nivel;
    protected int vida;

    public Pokemon(String nombre, int nivel, int vida) throws DatosPokemonInvalidosException {
        validar(nombre, nivel, vida);
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
    }

    private void validar(String nombre, int nivel, int vida) throws DatosPokemonInvalidosException {

        if(nombre.length() > 10) {
            throw new DatosPokemonInvalidosException( "El nombre no puede tener más de 10 letras");
        }

        if(nivel < 0 || nivel > 100) {
            throw new DatosPokemonInvalidosException("El nivel del Pokémon debe estar entre 0 y 100");
        }

        if(vida <= 0) {
            throw new DatosPokemonInvalidosException("La vida debe ser mayor que 0");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getVida() {
        return vida;
    }

    public abstract int calcularTarifa(int dias);

}
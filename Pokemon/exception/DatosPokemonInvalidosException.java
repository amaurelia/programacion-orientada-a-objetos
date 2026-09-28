package org.example.exception;

public class DatosPokemonInvalidosException extends Exception {
    public DatosPokemonInvalidosException(String mensaje) {
        super(mensaje);
    }
}
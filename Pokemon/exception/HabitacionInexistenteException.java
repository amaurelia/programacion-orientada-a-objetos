package org.example.exception;

public class HabitacionInexistenteException extends Exception {
    public HabitacionInexistenteException(String mensaje) {
        super(mensaje);
    }
}
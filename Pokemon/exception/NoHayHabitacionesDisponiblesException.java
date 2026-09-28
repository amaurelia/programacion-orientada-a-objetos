package org.example.exception;

public class NoHayHabitacionesDisponiblesException extends Exception {
    public NoHayHabitacionesDisponiblesException(String mensaje) {
        super(mensaje);
    }
}
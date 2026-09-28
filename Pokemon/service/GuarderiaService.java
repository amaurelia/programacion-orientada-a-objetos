package org.example.service;

import org.example.exception.HabitacionDesocupadaException;
import org.example.exception.HabitacionInexistenteException;
import org.example.exception.NoHayHabitacionesDisponiblesException;
import org.example.model.Habitacion;
import org.example.model.Pokemon;

public class GuarderiaService {

    private Habitacion[] habitaciones;
    private int totalRecaudado;

    public GuarderiaService() {
        habitaciones = new Habitacion[4];
        for (int i = 0; i < habitaciones.length; i++) {
            habitaciones[i] = new Habitacion(i + 1);
        }
        totalRecaudado = 0;
    }

    public void ingresar(Pokemon pokemon) throws NoHayHabitacionesDisponiblesException {

        for (Habitacion habitacion : habitaciones) {
            if (!habitacion.estaOcupada()) {
                habitacion.ocupar(pokemon);
                System.out.println(pokemon.getNombre() + " ha ingresado en la habitación " + habitacion.getNumero());
                return;
            }
        }
        throw new NoHayHabitacionesDisponiblesException("No hay habitaciones disponibles. " + pokemon.getNombre() + " no fue ingresado.");
    }

    public void salir(int numeroHabitacion, int dias) throws HabitacionInexistenteException, HabitacionDesocupadaException {
        if (numeroHabitacion < 1 || numeroHabitacion > habitaciones.length) {
            throw new HabitacionInexistenteException( "No existe la habitación " + numeroHabitacion);
        }
        Habitacion habitacion = habitaciones[numeroHabitacion - 1];
        if (!habitacion.estaOcupada()) {
            throw new HabitacionDesocupadaException( "La habitación está desocupada");
        }
        Pokemon pokemon = habitacion.getPokemon();
        int tarifa = pokemon.calcularTarifa(dias);
        if (tarifa < 0) {
            tarifa = 0;
        }
        totalRecaudado += tarifa;
        System.out.println( pokemon.getNombre() + " sale de la habitación " + numeroHabitacion + ". Tarifa = " + tarifa + " monedas");
        habitacion.desocupar();
    }

    public void mostrarEstado() {
        System.out.println("\n===== ESTADO GUARDERÍA =====");
        for (Habitacion habitacion : habitaciones) {
            System.out.println("Habitación " + habitacion.getNumero());
            if (habitacion.estaOcupada()) {
                Pokemon pokemon = habitacion.getPokemon();
                System.out.println("Estado: Ocupada");
                System.out.println("Pokémon: " + pokemon.getNombre());
                System.out.println("Nivel: " + pokemon.getNivel());
                System.out.println("Vida: " + pokemon.getVida());
            }
            else {
                System.out.println("Estado: Desocupada");
                System.out.println("Pokémon: Ninguno");
            }
            System.out.println("-------------------");
        }
    }

    public int getTotalRecaudado() {
        return totalRecaudado;
    }

    public Habitacion[] getHabitaciones() {
        return habitaciones;
    }
}
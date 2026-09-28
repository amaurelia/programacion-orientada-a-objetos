package org.example;

import org.example.exception.*;
import org.example.model.*;
import org.example.service.GuarderiaService;

public class Main {

    public static void main(String[] args) {

        GuarderiaService guarderia = new GuarderiaService();

        try {

            guarderia.ingresar(new PokemonPlanta("Bulbasaur",23,75,true));
            guarderia.ingresar(new PokemonFuego("Charmander",27,92));
            guarderia.ingresar(new PokemonFuego("Magmar",14,52));
            guarderia.ingresar(new PokemonPlanta( "Tangela", 15, 58,  false));
            guarderia.ingresar(  new PokemonPlanta(  "Paras", 12,72,true));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            guarderia.salir(1, 5);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            guarderia.salir(151, 3);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            guarderia.ingresar(new PokemonFuego("Ponyta", 320, 105));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            guarderia.salir(3, 2);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            guarderia.salir(3, 2);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Total recaudado = "+ guarderia.getTotalRecaudado()+ " monedas");
    }
}
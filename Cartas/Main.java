package org.example;


import org.example.model.Carta;
import org.example.model.CartaMostruo;
import org.example.model.CartaTrampa;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // instanciamos los objetos
        CartaMostruo dragonBlancoDeOjosAzules = new CartaMostruo("Dragón Blanco de Ojos Azules", 3000, 2500);
        CartaMostruo exodiaElProhibido = new CartaMostruo("Esxodia el prohibido", 1000, 1000);
        CartaTrampa renaceElMonstruo = new CartaTrampa("Renace el Monstruo", "Selecciona un mostruo en cualquier cementerio. Invócalo");

        // creamos la lista de cartas ( vacía )
        ArrayList<Carta> cartas = new ArrayList<>();

        // añadimos las cartas a la lista
        cartas.add(dragonBlancoDeOjosAzules);
        cartas.add(exodiaElProhibido);
        cartas.add(renaceElMonstruo);

        // mostramos todas las cartas mediante su toString()
        for( Carta carta: cartas ){
            System.out.println( carta.toString() );
        }

    }

}
package org.example;


import org.example.model.Pizzeria;
import org.example.model.Pretzel;

public class Main {

    public static void main(String[] args) {

        Pizzeria pizza_hut = new Pizzeria("Pizza Hut", "Vicuña Mackenna 7000, Ñuñoa", 84285563);
        Pizzeria domino_pizza = new Pizzeria("Domino Pizza", "Zenteno 130, Santiago", 85694127);
        Pretzel mr_pretzel = new Pretzel("Mr. Pretzel", "Departamental 520, La Florida", 98654237);

        System.out.println( pizza_hut.datosTienda() );
        System.out.println( domino_pizza.llamarTienda() );
        System.out.println( mr_pretzel.saludoPersonalizado() );

    }

}
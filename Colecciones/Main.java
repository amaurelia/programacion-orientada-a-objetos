import java.util.ArrayList;
import java.util.List;
import java.util.*;

// Clase base
class Animal {
    String nombre;
    int edad;
    double peso;

    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }
}

// Hijos
class Perro extends Animal {
    public Perro(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }
}

class Gato extends Animal {
    public Gato(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }
}

class Pato extends Animal {
    public Pato(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }
}



public class Main {
    public static void main(String[] args) {
        // Crear objetos
        Perro perro1 = new Perro("Fifi", 3, 12.5);
        Perro perro2 = new Perro("Sasha", 5, 20.0);
        Gato gato1 = new Gato("Michi", 2, 4.5);
        Gato gato2 = new Gato("Pelusa", 4, 5.0);
        Pato pato1 = new Pato("Donald", 1, 2.0);
        Pato pato2 = new Pato("Lucas", 2, 2.5);

        /* --------------
        ------ LIST -----
        -------------  */

        // Lista de animales
        List<Animal> animales = new ArrayList<>();

        // add()
        animales.add(perro1);
        animales.add(gato1);
        animales.add(pato1);

        // get()
        System.out.println(animales.get(0).nombre); // Firulais

        // remove()
        animales.remove(gato1);

        // size()
        System.out.println("Tamaño lista: " + animales.size());


        /* --------------
        ------ MAP ------
        -------------  */

        // Map<String, Animal>
        // Un Map es una estructura clave-valor, donde cada clave apunta a un objeto.
        Map<String, Animal> zoo = new HashMap<>();

        // put(k, v)
        zoo.put("perro1", perro1);
        zoo.put("gato1", gato1);
        zoo.put("pato1", pato1);

        // get()
        System.out.println(zoo.get("perro1").nombre); // búsqueda rápida

        // containsKey(k)
        System.out.println(zoo.containsKey("gato1")); // true

        // remove(k)
        zoo.remove("pato1");

        /* --------------
        ---- FOREACH ----
        -------------  */

        // foreach en List
        for (Animal animal : animales) {
            System.out.println("Animal: " + animal.nombre + ", Edad: " + animal.edad);
        }

        // entrySet() en Map
        for (Map.Entry<String, Animal> entry : zoo.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + " → Animal: " + entry.getValue().nombre);
        }

        // keySet() en Map
        for (String clave : zoo.keySet()) {
            System.out.println("Solo clave: " + clave);
        }
    }
}

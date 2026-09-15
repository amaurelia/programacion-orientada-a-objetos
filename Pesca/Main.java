import java.util.ArrayList;
import java.util.List;

// Clase abstracta
abstract class Pez {
    private String nombre;
    private double peso;
    private double longitud;

    public Pez(String nombre, double peso, double longitud) {
        this.nombre = nombre;
        this.peso = peso;
        this.longitud = longitud;
    }

    public abstract void sonido();

    public void info() {
        System.out.println("Nombre: " + nombre + ", Peso: " + peso + " kg, Longitud: " + longitud + " cm");
    }
}

// Subclases
class Atun extends Pez {
    private double velocidadNado;

    public Atun(String nombre, double peso, double longitud, double velocidadNado) {
        super(nombre, peso, longitud);
        this.velocidadNado = velocidadNado;
    }

    @Override
    public void sonido() {
        System.out.println("El atún hace: splash!");
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Velocidad de nado: " + velocidadNado + " km/h");
    }
}

class Salmon extends Pez {
    private String origenRio;

    public Salmon(String nombre, double peso, double longitud, String origenRio) {
        super(nombre, peso, longitud);
        this.origenRio = origenRio;
    }

    @Override
    public void sonido() {
        System.out.println("El salmón hace: blub!");
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Origen del río: " + origenRio);
    }
}

class Robalo extends Pez {
    private int profundidadHabitat;

    public Robalo(String nombre, double peso, double longitud, int profundidadHabitat) {
        super(nombre, peso, longitud);
        this.profundidadHabitat = profundidadHabitat;
    }

    @Override
    public void sonido() {
        System.out.println("El róbalo hace: glup!");
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Habita a " + profundidadHabitat + " metros de profundidad");
    }
}

// Clase Pescador
class Pescador {
    private String nombre;
    private int edad;
    private String nacionalidad;
    private List<Pez> pecesPescados;

    public Pescador(String nombre, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.pecesPescados = new ArrayList<>();
    }

    public void pescar(Pez pez) {
        pecesPescados.add(pez);
        System.out.println(nombre + " ha pescado un " + pez.getClass().getSimpleName());
    }

    public void mostrarPeces() {
        System.out.println("Peces pescados por " + nombre + ":");
        for (Pez pez : pecesPescados) {
            pez.info();
            pez.sonido();
        }
    }
}

// Main
public class Main {
    public static void main(String[] args) {
        Pescador pescador = new Pescador("Juan", 35, "Chileno");

        Pez atun = new Atun("Atún Azul", 50, 120, 70);
        Pez salmon = new Salmon("Salmón del Pacífico", 8, 60, "Río Baker");
        Pez robalo = new Robalo("Róbalo Común", 5, 40, 30);

        pescador.pescar(atun);
        pescador.pescar(salmon);
        pescador.pescar(robalo);

        pescador.mostrarPeces();
    }
}

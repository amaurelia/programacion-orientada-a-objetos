public class Personaje {

    // parámetros del personaje
    public String nombre;
    public int ataque;
    public int vida;
    public String estado;

    // constructor
    public Personaje(String nombre, int ataque, int vida){
        this.nombre = nombre;
        this.ataque = ataque;
        this.vida   = vida;
        this.estado = "Normal"; // por defecto su estado es normal
    }

    // función quer muestra los parámetros del objeto
    public void info(){
        mensaje(this.nombre + " vida:" + this.vida + " estado:" + this.estado);
    }

    // un ataque simple, cualquier personaje puede usarlo
    public void golpeSimple(Personaje objetivo){
        if(estoyVivo()) {
            mensaje(this.nombre + " realiza un golpe simple.", VERDE);
            int dano = (int)(0.5 * ataque);
            objetivo.vida -= dano;
            mensaje(objetivo.nombre + " pierde " + dano + " puntos de vida.");
        } else {
            mensaje(this.nombre + " no puede atacar.", ROJO);
        }
    }

    // verificación de si un personaje está vivo o no
    public boolean estaVivo(Personaje personaje){
        if(personaje.vida <= 0){
            personaje.estado = "Desmayado";
            mensaje(personaje.nombre + " está desmayado/a", ROJO);
            return false;
        }
        return true;
    }

    // verificación de si estoy vivo o no
    public boolean estoyVivo(){
        if(this.vida <= 0){
            this.estado = "Desmayado";
            mensaje(this.nombre + " está desmayado/a", ROJO);
            return false;
        }
        return true;
    }

    // mensaje simple
    public void mensaje(String mensaje){
        System.out.println(mensaje);
    }

    // mensaje con colores
    public static final String ROJO     = "\u001B[31m";
    public static final String VERDE    = "\u001B[32m";
    public static final String AZUL     = "\u001B[34m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String RESET    = "\u001B[0m";

    public void mensaje(String mensaje, String color){
        System.out.println(color + mensaje + RESET);
    }
}

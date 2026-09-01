public class Arquero extends Personaje {

    // nuevo parámetro que no estaba incluído en el padre
    public String rango; // puede ser "bajo", "medio" o "alto"

    // constructor
    public Arquero(String nombre, int ataque, int vida, String rango){
        super(nombre, ataque, vida);
        this.rango = rango.toLowerCase(); // normalizamos a minúsculas
    }

    // hechizo flecha triple
    public void flechaTriple(Personaje objetivo){
        if(estoyVivo()) {
            mensaje(this.nombre + " dispara una flecha triple.", AMARILLO);
            int daño = 0;
            switch (rango) {
                case "bajo":
                    daño = 1 * this.ataque;
                    break;
                case "medio":
                    daño = 2 * this.ataque;
                    break;
                case "alto":
                    daño = 3 * this.ataque;
                    break;
                default:
                    mensaje("Rango desconocido, no se aplica daño.", ROJO);
                    return;
            }
            objetivo.vida -= daño;
            mensaje(objetivo.nombre + " recibe " + daño + " puntos de daño.");
        } else {
            mensaje(this.nombre + " no puede lanzar ningún ataque.", ROJO);
        }
    }
}

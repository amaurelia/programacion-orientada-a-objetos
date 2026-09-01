public class Guerrero extends Personaje {

    // constructor
    public Guerrero(String nombre, int ataque, int vida){
        super(nombre, ataque, vida);
    }

    // método para intentar bloquear un ataque del monstruo
    public boolean bloquear(){
        int probabilidad = (int)(Math.random() * 100); // número entre 0 y 99
        if(probabilidad < 40){ // 40% de probabilidad
            mensaje(this.nombre + " bloquea el ataque con su escudo", AZUL);
            return true;
        }
        return false;
    }

    // ataque especial: golpe de la justicia
    public void golpeJusticia(Personaje objetivo){
        if(estoyVivo()) {
            mensaje(this.nombre + " ejecuta el Golpe de la Justicia", AMARILLO);
            int dano = (int)(2.2 * this.ataque);
            objetivo.vida -= dano;
            mensaje(objetivo.nombre + " recibe " + dano + " puntos de daño.");
        } else {
            mensaje(this.nombre + " no puede atacar.", ROJO);
        }
    }
}

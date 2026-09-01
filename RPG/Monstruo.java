public class Monstruo extends Personaje {

    public int magia;

    // constructor
    public Monstruo(String nombre, int ataque, int vida, int magia){
        super(nombre, ataque, vida);
        this.magia = magia;
    }

    // hechizo envenenar
    public void envenenar(Personaje objetivo){
        if(estoyVivo()) {
            mensaje(this.nombre + " lanza el hechizo de veneno a " + objetivo.nombre, ROJO);
            int dano = this.ataque; // daño base igual al ataque
            objetivo.vida -= dano;
            objetivo.estado = "Envenenado";
            mensaje(objetivo.nombre + " recibe " + dano + " puntos de daño y queda envenenado/a.");
        } else {
            mensaje(this.nombre + " no puede lanzar ningún hechizo.", ROJO);
        }
    }

    // hechizo golpe mortal
    public void golpeMortal(Personaje objetivo){
        if(estoyVivo()) {
            mensaje(this.nombre + " ejecuta un golpe mortal contra" + objetivo.nombre, ROJO);
            int dano = this.ataque * 5;
            objetivo.vida -= dano;

            if(objetivo.vida < 50) {
                objetivo.vida = 0;
                objetivo.estado = "Desmayado";
                mensaje(objetivo.nombre + " recibe un golpe devastador y queda desmayado/a.");
            } else {
                mensaje(objetivo.nombre + " recibe " + dano + " puntos de daño.");
            }
        } else {
            mensaje(this.nombre + " no puede atacar.", ROJO);
        }
    }
}

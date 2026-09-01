public class Mago extends Personaje {

    // nuevo parámetro que no estaba incluído en el padre
    public int magia;

    // constructor
    public Mago(String nombre, int ataque, int vida, int magia){
        // super es el constructor del padre
        super(nombre, ataque, vida);
        this.magia = magia;
    }

    public void relampago(Personaje objetivo){
        if(estoyVivo()) {
            mensaje(this.nombre + " lanza el hechizo de relámpago.", AMARILLO);
            double daño = 1.5 * this.magia;
            objetivo.vida -= daño;
            mensaje(objetivo.nombre + " recibe " + daño + " puntos de daño.");
        }
        else {
            mensaje(this.nombre + " no puede lanzar ningún hechizo.", ROJO);
        }
    }

    // hechizo ventisca
    public void ventisca(Personaje objetivo){
        if(estoyVivo()) {
            mensaje(this.nombre + " lanza el hechizo de ventisca.", AZUL);
            int dano = 3 * this.magia;
            objetivo.vida -= dano;
            mensaje(objetivo.nombre + " recibe " + dano + " puntos de daño.");
        } else {
            mensaje(this.nombre + " no puede lanzar ningún hechizo.", ROJO);
        }
    }

}
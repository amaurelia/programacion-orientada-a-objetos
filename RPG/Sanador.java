public class Sanador extends Personaje {

    // nuevo parámetro que no estaba incluído en el padre
    public int magia;

    // constructor
    public Sanador(String nombre, int ataque, int vida, int magia){
        // super es el constructor del padre
        super(nombre, ataque, vida);
        this.magia = magia;
    }

    // hechizo para curar vidas
    public void sanar(Personaje objetivo){
        if(estoyVivo()) {
            mensaje(this.nombre + " lanza el hechizo de sanación.", VERDE);
            objetivo.vida += this.magia;
            mensaje(objetivo.nombre + " recupera " + this.magia + " puntos de vida.");
        }
        else {
            mensaje(this.nombre + " no puede lanzar ningún hechizo.", ROJO);
        }
    }

    // hechizo para curar estados alterados
    public void curar(Personaje objetivo){
        if(estoyVivo()) {
            mensaje(this.nombre + " lanza el hechizo de curación.", VERDE);
            objetivo.estado = "Normal";
            mensaje(objetivo.nombre + " se encuentra bien.");
        }
        else {
            mensaje(this.nombre + " no puede lanzar ningún hechizo.", ROJO);
        }
    }

    // hechizo para aumentar el ataque
    public void bendición(Personaje objetivo){
        if(estoyVivo()) {
            mensaje(this.nombre + " lanza el hechizo de bendición.", VERDE);
            objetivo.ataque += 10;
            mensaje(objetivo.nombre + " aumenta su ataque.");
        }
        else {
            mensaje(this.nombre + " no puede lanzar ningún hechizo.", ROJO);
        }
    }

}
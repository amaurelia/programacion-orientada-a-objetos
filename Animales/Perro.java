public class Perro extends Animal {
    public Perro(String nombre, int edad, double peso){
        super(nombre, edad, peso);
    }

    @Override
    public void sonido(){
        System.err.println("Guau");
    }
}

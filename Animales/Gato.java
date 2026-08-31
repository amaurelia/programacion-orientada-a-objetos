public class Gato extends Animal {
    public Gato(String nombre, int edad, double peso){
        super(nombre, edad, peso);
    }

    @Override
    public void sonido(){
        System.err.println("Miau");
    }
}

public class Animal {
    public String nombre;
    private int edad;
    private double peso;

    public Animal(){
        this.nombre = "Desconocido";
        this.edad = 0;
        this.peso = 0;
    } 

    public Animal(String nombre, int edad, double  peso){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public void info(){
        System.err.println(this.nombre + " edad:" + this.edad + " peso:" + this.peso);
    }

    public void sonido() {
        System.out.println("El animal hace un sonido genérico");
    }
}

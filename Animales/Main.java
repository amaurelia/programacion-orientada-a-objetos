public class Main {
    public static void main(String[] args) {
        System.out.println("Inicia programa");

        Animal animal = new Animal("Perrito", 12, 20.0);
        Perro perro = new Perro("Sasha", 12, 20.0);
        Gato gato = new Gato("Carmen", 15, 3.0);
        animal.sonido();
        perro.sonido();
        gato.sonido();

        // se permite obtener el nombre
        System.out.println(animal.nombre);

        // no se permite obtener la edad
        // System.out.println(animal.edad);


    }
}

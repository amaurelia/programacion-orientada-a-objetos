import java.util.ArrayList;
import java.util.List;

class Jugador {
    String nombre;
    int probabilidadGol;

    public Jugador(String nombre, int probabilidadGol) {
        this.nombre = nombre;
        this.probabilidadGol = probabilidadGol;
    }

    public void patear() throws Exception {
        if (nombre == null) {
            throw new NullPointerException("El jugador no está inicializado.");
        }
        if (probabilidadGol < 0) {
            throw new ArithmeticException("La probabilidad no puede ser negativa.");
        }
        if (probabilidadGol == 0) {
            throw new ArithmeticException("Probabilidad inválida: división por cero.");
        }

        // Simulación simple: si probabilidad > 50, gol
        if (probabilidadGol > 50) {
            System.out.println(nombre + " ¡GOOOOL!");
        } else {
            System.out.println(nombre + " falló el penal.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Lista de jugadores con su probabilidad de gol
        List<Jugador> jugadores = new ArrayList<>();
        jugadores.add(new Jugador("Messi", 90));
        jugadores.add(new Jugador("Cristiano", 85));
        jugadores.add(new Jugador("Mbappé", 80));
        jugadores.add(new Jugador("Jugador Fantasma", 0)); // fuerza un ArithmeticException
        jugadores.add(null); // fuerza un NullPointerException

        for (int i = 0; i < jugadores.size(); i++) {
            try {
                Jugador jugador = jugadores.get(i);
                jugador.patear();

            } catch (NullPointerException e) {
                System.out.println("Error: jugador no inicializado.");
            } catch (ArithmeticException e) {
                System.out.println("Error aritmético: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Ocurrió una excepción inesperada: " + e.getMessage());
            } finally {
                System.out.println("Fin del intento #" + (i + 1));
                System.out.println("-------------------------");
            }
        }
    }
}

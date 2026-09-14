# ⚽ Simulador de Penales

![Futbol](IMG/futbol.jpg)  

## 📖 Descripción

Debes desarrollar un sistema para simular una tanda de penales en un partido de fútbol. Cada jugador debe ejecutar un penal, pero pueden ocurrir distintos errores que el programa debe manejar con **excepciones**:

- **NullPointerException**: si el jugador no está inicializado (ejemplo: se intenta acceder a un objeto `Jugador` que es `null`).
- **ArithmeticException**: si la probabilidad de gol es inválida (ejemplo: `probabilidadGol = 0` o negativa).
- **ArrayIndexOutOfBoundsException**: si se intenta acceder a un jugador fuera de la lista.
- **NumberFormatException**: si se intenta convertir un valor no numérico a número (puedes simularlo en pruebas adicionales).

El sistema debe:
- Usar un bloque `try-catch` para capturar cada excepción y mostrar un mensaje claro al usuario.
- Diferenciar entre **checked** y **unchecked exceptions**, explicando en el código dónde se usaría `throws` y dónde se usaría `throw`.
- Recorrer la lista de jugadores y mostrar el resultado de cada penal.

---

## 📝 Paso 1: Clase Jugador

Crea la clase `Jugador` con:
- Atributo `nombre`.
- Atributo `probabilidadGol`.
- Método `patear()` que:
  - Lanza excepciones si los datos son inválidos.
  - Imprime en consola si el penal fue gol o fallado.

---

## 📝 Paso 2: Clase Principal

Crea la clase `Main` con:
- Una **lista de jugadores** (`List<Jugador>`) inicializada en duro.
- Agrega algunos casos especiales:
  - Un jugador con `probabilidadGol = 0` para provocar una excepción aritmética.
  - Un jugador `null` para provocar una excepción de puntero nulo.
- Recorre la lista con un ciclo `for` y llama al método `patear()` de cada jugador.

---

## 📝 Paso 3: Manejo de Excepciones

- Usa `try-catch` para capturar:
  - `NullPointerException`
  - `ArithmeticException`
  - `ArrayIndexOutOfBoundsException`
  - `Exception` genérica
- Usa `throw` dentro del método `patear` para lanzar excepciones.
- Usa `throws` en la firma del método para declarar que puede lanzar excepciones.

---

## 🎯 Objetivo del Ejercicio

Al finalizar, el programa debe:
- Mostrar los resultados de cada penal (gol o fallo).
- Mostrar mensajes claros cuando ocurra una excepción.
- Explicar la diferencia entre **checked** y **unchecked exceptions**.

---

## 🚀 Ejemplo de salida esperada

```Messi ¡GOOOOL!
Cristiano ¡GOOOOL!
Mbappé ¡GOOOOL!
Error aritmético: Probabilidad inválida: división por cero.
Error: jugador no inicializado.
Fin del intento #5```

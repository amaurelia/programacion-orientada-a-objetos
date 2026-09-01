public class Main {

    public static void main(String[] args) {
        // Crear personajes
        Sanador aurora = new Sanador("Aurora", 20, 180, 40);
        Arquero diana = new Arquero("Diana", 35, 160, "medio");
        Mago vincent = new Mago("Vincent", 25, 140, 50);
        Guerrero rex = new Guerrero("Rex", 45, 420);
        Monstruo reyDelMal = new Monstruo("REY DEL MAL", 70, 500, 100);

        // --- Primera ronda de ataques ---
        vincent.relampago(reyDelMal);     // Vincent ataca
        aurora.sanar(rex);                // Aurora cura a Rex
        diana.flechaTriple(reyDelMal);    // Diana dispara flecha triple
        rex.golpeJusticia(reyDelMal);     // Rex golpe de la justicia

        // --- Ataques del REY DEL MAL ---
        reyDelMal.envenenar(vincent);     // Envenena a Vincent
        reyDelMal.golpeMortal(diana);     // Golpe mortal a Diana
        reyDelMal.envenenar(aurora);      // Envenena a Aurora
        reyDelMal.golpeMortal(rex);       // Golpe mortal a Rex

        // --- Segunda ronda de ataques de los héroes ---
        vincent.ventisca(reyDelMal);      // Vincent lanza ventisca
        aurora.curar(vincent);            // Aurora cura estado de Vincent
        diana.flechaTriple(reyDelMal);    // Diana intenta otro disparo
        rex.golpeJusticia(reyDelMal);     // Rex vuelve a atacar

        // --- Ataques adicionales del REY DEL MAL ---
        reyDelMal.envenenar(aurora);
        reyDelMal.golpeMortal(vincent);

        // --- Estado final ---
        System.out.println("\n--- ESTADO FINAL ---");
        System.out.println("Aurora: Vida=" + aurora.vida + " Estado=" + aurora.estado);
        System.out.println("Diana: Vida=" + diana.vida + " Estado=" + diana.estado);
        System.out.println("Vincent: Vida=" + vincent.vida + " Estado=" + vincent.estado);
        System.out.println("Rex: Vida=" + rex.vida + " Estado=" + rex.estado);
        System.out.println("REY DEL MAL: Vida=" + reyDelMal.vida + " Estado=" + reyDelMal.estado);
    }
}

public class EjerciciosIFvideojuego {
    public static void main(String[] args) {
        // ==============================

        // EJERCICIO 1 – Vida del personaje (Minecraft)

        // ==============================

        // Declara una variable con la vida de un jugador (entero entre 0 y 100).

        // Usa if/else para imprimir:

        //   Vida > 70 → "Tu personaje está fuerte 💪"

        //   Vida entre 30 y 70 → "Tu personaje está herido 😢"

        //   Vida < 30 → "Tu personaje está en peligro ⚠️"

        System.out.println("Ejercicio 1");
        int vida = 60;
        if (vida >= 70) {
            System.out.println("Tu personaje está fuerte");
        } else if (vida <= 70 && vida >= 30) {
            System.out.println("Tu personajecestá herido");
        } else {
            System.out.println("Tu personaje está en peligro");
        }


        // ==============================

        // EJERCICIO 2 – Elección de ataque (Pokémon)

        // ==============================

        // Declara una variable con el tipo de ataque: "fuego", "agua" o "planta".

        // Con if/else if/else imprime:

        //   Si es fuego → "¡Es super eficaz contra planta!"

        //   Si es agua → "¡Es super eficaz contra fuego!"

        //   Si es planta → "¡Es super eficaz contra agua!"

        //   Otro caso → "Tipo de ataque no reconocido"

        String tipodeataque = "planta";

        if (tipodeataque == "fuego") {
            System.out.println("\n ¡Es súper eficaz contra planta!");
        }
        if (tipodeataque == "agua") {
            System.out.println("\n ¡Es súper eficaz contra fuego!");
        }
        if (tipodeataque == "planta") {
            System.out.println("\n ¡Es súper eficaz contra agua!");
        }


        // ==============================

        // EJERCICIO 3 – Tienda de objetos (Fortnite)

        // ==============================

        // Declara una variable con el número de V-Bucks.

        // Con if imprime qué puede comprar el jugador:

        //   Si tiene 2000 o más → "Puedes comprar una skin legendaria"

        //   Si tiene 1200 o más → "Puedes comprar una skin épica"

        //   Si tiene 800 o más → "Puedes comprar una skin rara"

        //   Si tiene menos de 800 → "No tienes suficientes V-Bucks"

        int VBucks = 1500;

        if (VBucks >= 2000) {
            System.out.println("\n Puedes comprar una skin legendaria");
        } else if (VBucks >= 1200) {
            System.out.println("\n Puedes comprar una skin épica");
        } else if (VBucks >= 800) {
            System.out.println("\n Puedes comprar una skin rara");
        } else {
            System.out.println("\n No tienes suficientes V-Bucks");
        }


        // ==============================

        // EJERCICIO 4 – Clasificación de rango (League of Legends)

        // ==============================

        // Declara una variable con los puntos de ranking.

        // Con if imprime el rango:

        //   0–999   → "Bronce"

        //   1000–1999 → "Plata"

        //   2000–2999 → "Oro"

        //   3000 o más → "Platino"

        int puntos = 2500;

        if (puntos >= 3000) {
            System.out.println("Platino");
        } else if (puntos >= 2999) {
            System.out.println("Oro");
        } else if (puntos >= 1999) {
            System.out.println("Plata");
        } else {
            System.out.println("Bronce");
        }


        // ==============================

        // EJERCICIO 5 – Evento especial (Minecraft)

        // ==============================

        // Declara una variable "hora" (entero de 0 a 23).

        // Con if imprime:

        //   Entre 6 y 11 → "Es de mañana, los aldeanos están activos ☀️"

        //   Entre 12 y 18 → "Es de tarde, hora de explorar 🔍"

        //   Entre 19 y 23 → "Es de noche, cuidado con los mobs 🌙"

        //   Entre 0 y 5 → "Madrugada, mejor dormir 😴"

        int hora = 3;

        if (hora >= 6 && hora <= 11) {
            System.out.println("Es de mañana, los aldesnos están activos");
        } else if (hora >= 12 && hora <= 18) {
            System.out.println("Es de tarde, hora de explorar");
        } else if (hora >= 19 && hora <= 23) {
            System.out.println("Es de noche, cuidado con los mobs");
        } else if (hora >= 0 && hora <= 5) {
            System.out.println("Madrugada, mejor dormir");
        } else {
            System.out.println("Hora no válida");
        }


        // ==============================

        // EJERCICIO 6 – Reto final: Sistema de logros (multijuego)

        // ==============================

        // Declara tres variables:

        //   - kills (número de enemigos derrotados)

        //   - muertes (veces que ha muerto el jugador)

        //   - tiempo (minutos jugados)

        //

        // Crea condiciones con if para asignar logros:

        //   - Si kills >= 10 → "Logro: Cazador experto 🏹"

        //   - Si muertes == 0 → "Logro: Intocable 👑"

        //   - Si tiempo > 60 → "Logro: Maratón gamer ⏱️"

        //   - Si kills < muertes → "Logro: Necesita entrenar 🐣"

        //

        // Extensión opcional:

        //   - Combina condiciones con && y || para logros más complejos.

        //   - Ejemplo: (kills > 20 && muertes < 5) → "Logro: PRO absoluto 🔥"

        int kills = 56;
        int muertes = 0;
        int tiempo = 45;

        if (kills >= 10) {
            System.out.println("Logro: Cazador desbloqueado");
        }
        if (muertes == 0) {
            System.out.println("Logro: Intocable");
        }
        if (tiempo > 60) {
            System.out.println("Logro: Maratón gamer");
        }
        if (kills < muertes) {
            System.out.println("Logro: Necesita Entrenar");
        }
        if (kills > 20 && muertes < 5) {
            System.out.println("Logro: PRO absoluto");
        }


    }
}
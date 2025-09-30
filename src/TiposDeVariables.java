public class TiposDeVariables {

    public static void main(String[] args) {

        // ==============================
        // Introducción
        // ==============================
        // Este fichero Java contiene VARIOS ejercicios básicos.
        // Para cada ejercicio, tenéis que hacer lo que indica.
        // Conforme vayáis haciendo ejercicios, cada vez que lo ejecutéis
        // ejecutará de nuevo todos los anteriores, pero está correcto (no borréis
        // los ejercicios ya hechos).

        // ==============================
        // EJERCICIO 1 – Ficha de personaje (Minecraft)
        // ==============================
        // Crea variables con el nombre del jugador, nivel, vida (double)
        // y si tiene armadura (boolean). Imprímelas como si fuese una ficha del jugador.
        String nombrejugador = "Cernadas";
        long nivel = 6782;
        double vida = 20.0;
        boolean tienearmadura = true;
        System.out.println("El Nombre de Jugador es: " + nombrejugador +
                " ,tiene nivel: " + nivel +
                " ,su vida es: " + vida +
                " ,tiene armadura?: " + tienearmadura);


        // ==============================// EJERCICIO 2 – Batalla rápida (Pokémon)
        // ==============================
        // Declara dos variables con el ataque de Pikachu y la defensa de Charmander.
        // Calcula el daño causado (ataque – defensa).
        // Imprime el resultado: "Pikachu hace X puntos de daño a Charmander" - X es el valor real del daño.
        long ataquedepikachu = 110;
        long defensadecharmander = 45;

        System.out.println("Pikachu hace X puntos de daño a Charmander: " + ataquedepikachu +
                " ,la defensa de charmander es de: " + defensadecharmander);
        System.out.println("Por lo que el daño causado es de: " + (ataquedepikachu - defensadecharmander));


        // ==============================
        // EJERCICIO 3 – Monedas y compras (Fortnite)
        // ==============================
        // Declara una variable con el número de V-Bucks que tiene un jugador.
        // Resta el precio de una skin (ej: 1200).
        // Imprime el resultado: "Después de comprar la skin, te quedan X V-Bucks".

        long pavos = 2000;
        long skin = 1200;

        System.out.println("Después de comprar la skin, te quedan " + (pavos - skin) + " pavos");


        // ==============================
        // EJERCICIO 4 – Velocidad de campeón (League of Legends)
        // ==============================
        // Declara una variable con la velocidad base de un campeón
        // y otra con un buff de velocidad.
        // Calcula la velocidad final sumando ambos valores.
        // Imprime el resultado: "La velocidad final de Jinx es X".

        long vel = 74;
        long buff = 90;

        System.out.println(" La velocidad final de Jinx es: " + (vel + buff));


        // ==============================
        // EJERCICIO 5 – Conversor de monedas de juego
        // ==============================
        // Declara una cantidad de monedas de Minecraft.
        // Convierte a su equivalente en V-Bucks y en RP de LoL
        // usando tasas de cambio inventadas (ej: 1 moneda MC = 5 V-Bucks = 2 RP).
        // Imprime el resultado en formato claro.

        int monedasMinecraft = 1;
        int VBucks = 5;
        int RP = 2;

        int totalVBucks = monedasMinecraft * VBucks;
        int totalRP = monedasMinecraft * RP;


        System.out.println("1 moneda de  Minecraft equivale a " + (monedasMinecraft * RP) + " VBucks ");
        System.out.println("1 moneda de Minecraft equivale a " + (monedasMinecraft * VBucks) + " RP ");}}



        // ==============================
        // EJERCICIO 6 – Clasificación de jugador (Fortnite / LoL)
        // ==============================
        // ESTE EJERCICIO INCLUYE SENTENCIAS DE CONTROL. No pertenece a tipos de variables.
        // Si te aburres, investiga cómo se haría y entiéndelo.
        //
        // Declara variables con el número de kills, muertes y asistencias de una partida.
        // Calcula el KDA = (kills + asistencias) / muertes.
        // Según el resultado:
        //   KDA ≥ 5        → "Jugador PRO"
        //   KDA entre 3–5  → "Jugador BUENO"
        //   KDA entre 1–3  → "Jugador NORMAL"
        //   KDA < 1        → "Jugador NOOB"
        //
        // OPCIONAL: muestra también el tier en el que quedaría (Bronce, Plata, Oro, Platino…).











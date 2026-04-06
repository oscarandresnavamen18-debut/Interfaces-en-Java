package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
         // 1. Crear la lista de tipo EspacioCultural
        ArrayList<EspacioCultural> lugares = new ArrayList<>();

        // 2. Crear los objetos
        EspacioCultural jardin = new JardinBotanico();
        EspacioCultural museo = new MuseoDeAntioquia();
        EspacioCultural parque = new ParqueExplora();

        // 3. Agregarlos a la lista
        lugares.add(jardin);
        lugares.add(museo);
        lugares.add(parque);

        // 4. Recorrer la lista con for-each
        for (EspacioCultural lugar : lugares) {

            System.out.println("---------------------------");
            System.out.println("Lugar cultural:");

            // 5. Llamar los métodos
            lugar.mostrarHorario();
            System.out.println(lugar.ObtenerRequisitoEntrada());
            lugar.realizarActividadPrincipal();
        }
    }
    
}
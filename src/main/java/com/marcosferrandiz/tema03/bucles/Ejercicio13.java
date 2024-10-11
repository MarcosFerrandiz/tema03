package com.marcosferrandiz.tema03.bucles;

import java.util.Random;

public class Ejercicio13 {
    public static void main(String[] args) {
        final int REPETICIONES = 1_000_000;
        Random rng = new Random();
        float cara = 0;
        float cruz = 0;
        for (int i = 0; i <= REPETICIONES; i++){
            int random = rng.nextInt(0, 2);
            if (random == 0){
                cara += 1;
            } else{
                cruz += 1;
            }
        }
        float totalCara = cara * 100 / REPETICIONES;
        float totalCruz = cruz * 100 / REPETICIONES;

        System.out.println("El total de caras es del "+ totalCara+ " %");
        System.out.println("El total de cruz es del "+ totalCruz+ " %");
    }
}

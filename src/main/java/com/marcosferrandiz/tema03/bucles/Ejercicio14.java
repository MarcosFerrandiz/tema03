package com.marcosferrandiz.tema03.bucles;

import java.util.Random;

public class Ejercicio14 {
    public static void main(String[] args) {
        final int REPETICIONES = 1_000_000;
        int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0;
        Random rng = new Random();

        for (int i = 0; i <= REPETICIONES; i++){
            int random = rng.nextInt(1, 7);
            switch (random){
                case 1 -> num1++;
                case 2 -> num2++;
                case 3 -> num3++;
                case 4 -> num4++;
                case 5 -> num5++;
                case 6 -> num6++;

            }
        }
        float porcentaje1 = num1 * 100 / REPETICIONES;
        float porcentaje2 = num2 * 100 / REPETICIONES;
        float porcentaje3 = num3 * 100 / REPETICIONES;
        float porcentaje4 = num4 * 100 / REPETICIONES;
        float porcentaje5 = num5 * 100 / REPETICIONES;
        float porcentaje6 = num6 * 100 / REPETICIONES;

        System.out.println("Han sálido una cantidad de "+ num1 + " numeros 1, una cantidad de "+ num2+ " numeros 2, una cantidad de "+ num3+ " numeros 3, una cantidad de "+num4+ " numeros 4, una cantidad de "+num5+" numeros 5, una cantidad de "+num6+" numeros 6");
        System.out.println("Porcentaje de 1 que han salido es de un "+porcentaje1+ " %");
        System.out.println("Porcentaje de 2 que han salido es de un "+porcentaje2+ " %");
        System.out.println("Porcentaje de 3 que han salido es de un "+porcentaje3+ " %");
        System.out.println("Porcentaje de 4 que han salido es de un "+porcentaje4+ " %");
        System.out.println("Porcentaje de 5 que han salido es de un "+porcentaje5+ " %");
        System.out.println("Porcentaje de 6 que han salido es de un "+porcentaje6+ " %");

    }
}

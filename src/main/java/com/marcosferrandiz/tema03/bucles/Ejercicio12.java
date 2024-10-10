package com.marcosferrandiz.tema03.bucles;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroIntroducido;
        int intentos;
        int numeroRNG;

        Random rng = new Random();
        numeroRNG = rng.nextInt(1, 101);

        do {
            System.out.println("Inserte la cantidad de intentos que quieras tener");
            intentos = Integer.parseInt(input.nextLine());
            if (intentos <= 0) {
                System.err.println("ERROR, Los intentos deberán de ser mayores a 0");
            }
        } while (intentos <= 0);
        System.out.println("Intenta adivinar el número del 1 al 100");

        intentos -=1;
        for (int i = 1; intentos >= 0; intentos--) {

            System.out.println("Inserte el número");
            numeroIntroducido = Integer.parseInt(input.nextLine());

            System.out.println("Te quedan " + intentos + " intentos");
            if (numeroIntroducido != numeroRNG) {
                if (numeroIntroducido < numeroRNG) {
                    System.out.println("El número a adivinar es mayor a " + numeroIntroducido);
                } else {
                    System.out.println("El número a adivinar es menor a " + numeroIntroducido);
                }
            } else {
                System.out.println("YUPIIIII, HAS ACERTADO EL NÚMERO, LO QUE EQUIVALO A QUE HAS GANADO!!!!!!");
            }
            if (intentos == 0) {
                System.out.println("Has perdido, que malo!!!!!!!!");
            }
        }
        input.close();
    }
}

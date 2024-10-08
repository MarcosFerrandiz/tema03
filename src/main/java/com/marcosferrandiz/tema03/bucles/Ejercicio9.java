package com.marcosferrandiz.tema03.bucles;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        float num;
        String esPrimo = "SI";

        Scanner input = new Scanner(System.in);
        System.out.println("Indique el numero que quiera saber si es primo o no");
        num = Float.parseFloat(input.nextLine());

        if (num < 2) {
            esPrimo = "NO";
        } else {
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    esPrimo = "NO";
                    break;
                }
            }
        }
        System.out.println(esPrimo +" es primo");
    }
}

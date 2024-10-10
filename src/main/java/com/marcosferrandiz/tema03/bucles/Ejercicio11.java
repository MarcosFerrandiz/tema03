package com.marcosferrandiz.tema03.bucles;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num;
        float media;
        int cuenta = 0;
        float total = 0;

        do {
            System.out.println("Introduzca un número");
            num = Float.parseFloat(input.nextLine());
            if (num >= 0){
                cuenta += 1;
                total += num;
            }
        }while (num >= 0);

        input.close();

        media = total / cuenta;
        System.out.println("La media de todos los anteriores numeros es de: " +media);
    }
}

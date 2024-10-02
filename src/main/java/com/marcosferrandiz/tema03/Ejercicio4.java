package com.marcosferrandiz.tema03;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        Scanner input = new Scanner(System.in);
        System.out.println("Te voy a preguntar que me digas dos numeros para que los ordene");
        System.out.println("Dime el primer número");
        numero1 = input.nextInt();
        System.out.println("Dime el segundo número");
        numero2 = input.nextInt();
        scanner.close();

        if (numero1 > numero2){
            System.out.println(numero1 + " " + numero2);
        }
        else {
            System.out.println(numero2 + " " + numero1);
        }
    }
}

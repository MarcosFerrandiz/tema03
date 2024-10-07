package com.marcosferrandiz.tema03.bucles;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int numero;
        int total = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Dime un número para hacer el factorial");
        numero = Integer.parseInt(input.nextLine());

        System.out.print(numero + "! = ");
        for (int cuenta = numero; cuenta > 0; cuenta--){
            total *=cuenta;
            System.out.print(cuenta + " * ");
        }
        System.out.print(" = " + total);
    }
}

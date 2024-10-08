package com.marcosferrandiz.tema03.bucles;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float numero;
        float total = 0;

        do {
            System.out.println("Introduzca un número");
            numero = Float.parseFloat(input.nextLine());
            total = total + numero;
        }while (numero != 0);
        System.out.println("La suma de todos los numeroa anteriores es: "+ total);
    }
}

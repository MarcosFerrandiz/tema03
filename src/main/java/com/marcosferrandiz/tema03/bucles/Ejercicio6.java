package com.marcosferrandiz.tema03.bucles;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        float numero;
        float total;
        int cuenta;
        boolean valido;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Indique un número del 1 al 10");
            numero = Float.parseFloat(input.nextLine());
            valido = numero >= 1 && numero <= 10;
            if (valido == false) {
                System.err.println("Error, el número introducido no es válido, pruebe uno válido");
            }
        }while (valido == false);

        input.close();
        for (cuenta = 1; cuenta <= 10; cuenta++ ){
            total = numero * cuenta;
            System.out.println(numero + " x " + cuenta + " = "+ total);
        }

    }
}

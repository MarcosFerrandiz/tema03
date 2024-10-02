package com.marcosferrandiz.tema03;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float numero;
        int numeroCts;
        System.out.println("Inique la cantidad");
        numero = Float.parseFloat(input.nextLine());
        numeroCts = (int)(numero * 100);
        scanner.close();

        int moneda200 = numeroCts / 200;
        int resto = numeroCts % 200;
        int moneda100 = resto / 100;
        resto = resto % 100;

        int moneda50 = resto / 50;
        resto = resto % 50;

        int moneda20 = resto / 20;
        resto = resto % 20;

        int moneda10 = resto / 10;
        resto = resto % 10;
        int moneda5 = resto / 5;
        resto = resto % 5;

        int moneda2 = resto / 2;
        resto = resto % 2;

        int moneda1 = resto;

        System.out.println("La cantidad mínima de monedas de " + numero + " es de " + moneda200 + " monedas de 2 euro, " + moneda100 + " monedas de 1 euro, " + moneda50 + " monedas de 50 cts, " + moneda20 + " monedas de 20 cts, " + moneda10 + " monedas de 10 " + moneda5 + " monedas de 5cts, " + moneda2 + " monedas de 2cts," + moneda1 + " monedas de 1cts");
    }
}


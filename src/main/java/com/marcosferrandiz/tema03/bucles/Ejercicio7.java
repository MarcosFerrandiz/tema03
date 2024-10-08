package com.marcosferrandiz.tema03.bucles;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num1;
        int num2;
        float resultado = 1;

        System.out.println("Indique un número");
        num1 = Float.parseFloat(input.nextLine());
        System.out.println("Indique el número elevado");
        num2 = Integer.parseInt(input.nextLine());

        input.close();

        if (num2 == 0) {
            resultado = 1;
        }
        else if (num1 == 0 && num2 > 0) {
            resultado = 0;
        }
        else if (num2 < 0) {
            num1 = 1 / num1;
            num2 = -num2;
        }
        for (int cuenta = 1; cuenta <= num2; cuenta++) {
            resultado *= num1;

        }
        System.out.println(resultado);
    }
}

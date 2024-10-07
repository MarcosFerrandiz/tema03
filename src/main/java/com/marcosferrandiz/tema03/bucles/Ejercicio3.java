package com.marcosferrandiz.tema03.bucles;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num1;
        float num2;
        float resultado = 0;
        float contador = 0;

        System.out.println("Dime dos números para multiplicarlos sumando");
        System.out.println("Ingresa el primer número");
        num1 = Float.parseFloat(input.nextLine());
        System.out.println("Ingresa el segundo número");
        num2 = Float.parseFloat(input.nextLine());

        input.close();

        while (contador < num2){
            resultado += num1;
            contador++;
        }
        System.out.printf("El resultado de " + num1 +" y " + num2 + " es de: "+ resultado);
    }
}

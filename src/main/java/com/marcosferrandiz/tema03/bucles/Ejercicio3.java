package com.marcosferrandiz.tema03.bucles;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num1 , signo1;
        float num2 , signo2;
        float resultado = 0;
        float contador = 0;

        System.out.println("Dime dos números para multiplicarlos sumando");
        System.out.println("Ingresa el primer número");
        num1 = Float.parseFloat(input.nextLine());
        System.out.println("Ingresa el segundo número");
        num2 = Float.parseFloat(input.nextLine());

        input.close();

        signo1 = num1 < 0 ? -1 : 1;
        num1 *= signo1;
        signo2 = num2 < 0 ? -1 : 1;
        num2 *= signo2;

        while (contador < num2){
            resultado += num1;
            contador++;
        }
        num1 *= signo1;
        num2 *= signo2;
        resultado = resultado * signo1 * signo2;
        System.out.printf("El resultado de " + num1 +" y " + num2 + " es de: "+ resultado);
    }
}

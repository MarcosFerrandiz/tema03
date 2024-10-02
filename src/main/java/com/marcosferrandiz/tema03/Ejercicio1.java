package com.marcosferrandiz.tema03;


import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        float numero;
        System.out.println("Indíque un número y te diré si es par o impar");
        Scanner input = new Scanner(System.in);
        numero = input.nextFloat();
        input.close();
        if (numero % 2  == 0){
            System.out.println(numero + " es un numero par");
        }
        else{
            System.out.println(numero + " es un numero impar");
        }
    }
}

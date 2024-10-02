package com.marcosferrandiz.tema03;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int edad;
        Scanner input = new Scanner(System.in);
        System.out.println("Dime tu edad");
        edad = input.nextInt();
        input.close();
        if (edad < 18){
            System.out.println("Eres menor de edad");
        }
        else {
            System.out.println("Eres mayor de edad");
        }
    }
}

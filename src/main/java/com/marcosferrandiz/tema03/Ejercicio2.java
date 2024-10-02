package com.marcosferrandiz.tema03;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        float primero;
        float segundo;

        Scanner input = new Scanner(System.in);
        System.out.println("Te voy a preguntar que me dígas dos numeros para decirte si el primero es mayor o menor al segundo");
        System.out.println("Dime el primer número");
        primero = input.nextFloat();
        System.out.println("Dime el segundo número");
        segundo = input.nextFloat();
        scanner.close();
        
        if (primero > segundo){
            System.out.println("El primér número es mayor al segundo");
        }
        else {
            System.out.println("El priér número es menor al segundo");
        }
    }
}

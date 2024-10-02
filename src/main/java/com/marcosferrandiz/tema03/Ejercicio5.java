package com.marcosferrandiz.tema03;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int nota;

        Scanner input = new Scanner(System.in);
        System.out.println("Dime un número del 1 al 10");
        nota = (int)Float.parseFloat(input.nextFloat());
        scanner.close();

        switch (nota){
            case 1,2,3,4 -> System.out.println("INSUFICIENTE");
            case 5 -> System.out.println("SUFICIENTE");
            case 6 -> System.out.println("BIEN");
            case 7,8 -> System.out.println("NOTABLE");
            case 9,10 -> System.out.println("SOBRESALIENTE");
            default -> System.out.println("ERROR");
        }

    }
}

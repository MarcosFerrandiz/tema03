package com.marcosferrandiz.tema03;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int dato;
        int opuesta = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("indique un número del 1 al 6");
        dato = Integer.parseInt(input.nextLine());
        input.close();
        if (dato<7 && dato>0) {
            opuesta = switch (dato) {
                case 1 -> 6;
                case 2 -> 5;
                case 3 -> 4;
                case 4 -> 3;
                case 5 -> 2;
                case 6 -> 1;
                default -> -1;
            };
            System.out.println("La cara opuesta de "+ dato +" es: " + opuesta);
        }
        else {
            System.err.println("ERROR");
        }
    }
}

package com.marcosferrandiz.tema03;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        int ano;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un año");
        ano = Integer.parseInt(input.nextLine());
        input.close();

        if (ano % 4 == 0){
            System.out.println("Es bisiesto");
        }
        else {
            if (ano % 4 == 0 && ano % 100 != 0){
                System.out.println("Es bisiesto");
            }
            else {
                System.out.println("No es bisiesto");
            }
        }

    }
}

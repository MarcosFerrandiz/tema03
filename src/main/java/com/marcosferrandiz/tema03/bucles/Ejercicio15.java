package com.marcosferrandiz.tema03.bucles;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h, m, s;
        do{
            System.out.println("Introduzca las hora que quieres en el horario de 24h");
            h = Integer.parseInt(input.nextLine());

            if (h <= 0 || h >23) {
                System.err.println("El número introducido no es válido, pruebe otra vez");
            }
        } while (h<0 || h>23);

        do {
            System.out.println("Introduzca los minutos");
            m = Integer.parseInt(input.nextLine());

            if (m<0 || m>59){
                System.err.println("El número introducido no es válido, pruebe otra vez");
            }
        }while (m<0 || m>59);

        do {
            System.out.println("Introduzca los segundos");
            s = Integer.parseInt(input.nextLine());

            if (s<0 || s>59){
                System.err.println("El número introducido no es válido, pruebe otra vez");
            }
        }while (s<0 || s>59);

        input.close();

        System.out.println("La hora introducida es: "+h+":"+m+":"+s);
    }
}

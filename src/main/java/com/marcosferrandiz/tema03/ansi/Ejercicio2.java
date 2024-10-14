package com.marcosferrandiz.tema03.ansi;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h, m, s;

        do {
            System.out.println("Itroduzca la hora que quieras");
            h = Integer.parseInt(input.nextLine());
            if (h<0 || h>23){
                System.err.println("Valor introducido NO válido");
            }
        }while (h<0 || h>23);

        do {
            System.out.println("Introduzca los minutos que quieras");
            m = Integer.parseInt(input.nextLine());
            if (m<0 || m>59){
                System.err.println("Valor introducido NO válido");
            }
        }while (m<0 || m>59);

        do {
            System.out.println("Introduzca los segundos que quieras");
            s = Integer.parseInt(input.nextLine());
            if (s<0 || s>59){
                System.err.println("Valor introducido NO válido");
            }
        }while (s<0 || s>59);
        input.close();

        System.out.printf("La hora indicada es %02d:%02d:%02d\n" , h, m, s);
    }
}

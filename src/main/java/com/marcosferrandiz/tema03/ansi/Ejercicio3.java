package com.marcosferrandiz.tema03.ansi;

public class Ejercicio3 {
    public static void main(String[] args) {
        final int MAXIMO = 9;
        for (int num = 1; num <= MAXIMO; num++){
            System.out.printf("%" + (MAXIMO - num +1)+ "s", "");
            for (int i = 1; i <= num; i++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

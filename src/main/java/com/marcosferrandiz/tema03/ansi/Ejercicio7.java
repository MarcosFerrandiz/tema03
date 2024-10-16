package com.marcosferrandiz.tema03.ansi;

public class Ejercicio7 {
    public static void main(String[] args) {
/*
        String cadena = "";
        String cadena2 = "";


        for (int i = 1; i <= 9; i++){
            for (i = 1; i <= 9; i++){
                cadena2 = i + cadena2;
                cadena += i;
                System.out.printf("%9s%-9s\n", cadena, cadena2);
            }
        }
*/
        String cadena = "";


        for (int i = 1; i <= 9; i++) {
            cadena += i;
            System.out.printf("%9s", cadena);
            for (int a = (cadena.length() - 1); a >= 0; a--) {
                System.out.print(cadena.charAt(a));
            }
            System.out.println();
        }
    }
}

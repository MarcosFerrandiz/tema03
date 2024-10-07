package com.marcosferrandiz.tema03.bucles;

public class Ejercicio4 {
    static int par = 0;
    static int impar = 0;
    public static void main(String[] args) {
        for (int numero = 1; numero <= 100; numero++){
            if (numero % 2 != 0){
                System.out.print(numero + " ");
                impar ++;
            }
        }
    }
}

package com.marcosferrandiz.tema03.bucles;

public class Ejercicio4 {
    static int par = 0;
    static int impar = 0;
    public static void main(String[] args) {
        for (int numero = 1; numero <= 100; numero++){
            System.out.println(numero);
            if (numero % 2 == 0){
                par += 1;
            }else {
                impar += 1;
            }
        }
        System.out.println("En total hay "+ par+ " números pares y "+ impar+ " números impares");
    }
}

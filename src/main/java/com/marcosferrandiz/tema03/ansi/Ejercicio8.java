package com.marcosferrandiz.tema03.ansi;

public class Ejercicio8 {
    public static void main(String[] args) {
        final String ESC = "\u001B[";
        final String RESET = ESC + "0m";
        int intensidad = 0;
        final int COLOR_BASE_TEXTO = 30;
        final int COLOR_BASE_FONDO = 40;
        final int COLOR_MAX_TEXTO = 37;
        final int COLOR_MAX_FONDO = 47;

        // Primero recorremos las filas (colorTexto)
        for (int i = 1; i<= 2; i++){
            for (int colorTexto = COLOR_BASE_TEXTO; colorTexto <= COLOR_MAX_TEXTO; colorTexto++) {
                for (int colorFondo = COLOR_BASE_FONDO; colorFondo <= COLOR_MAX_FONDO; colorFondo++) {
                    System.out.printf( ESC  + intensidad + ";" + colorTexto + ";" + colorFondo + "m %d;%d;%d" + RESET, intensidad, colorTexto, colorFondo );
                }
                System.out.println();
            }
            intensidad +=1;
        }
    }
}

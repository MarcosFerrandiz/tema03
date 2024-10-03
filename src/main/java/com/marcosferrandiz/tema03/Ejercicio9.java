package com.marcosferrandiz.tema03;

import java.util.Scanner;

public class Ejercicio9 {
    public enum TipoTriangulo {
        EQUILATERO, ISOSCELES, ESCALENO
    }
    public static void main(String[] args) {
        float lado1;
        float lado2;
        float lado3;
        TipoTriangulo tipo;
        String triangulo;
        Scanner input = new Scanner(System.in);
        System.out.println("Dime la medida del primer lado");
        lado1 = Float.parseFloat(input.nextLine());
        System.out.println("Dime la medida del segundo lado");
        lado2 = Float.parseFloat(input.nextLine());
        System.out.println("Dime la medida del tercer lado");
        lado3 = Float.parseFloat(input.nextLine());
        input.close();
        if (lado1 == lado2 && lado1 == lado3){
            tipo = TipoTriangulo.EQUILATERO;
        }
        else {
            if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
                tipo = TipoTriangulo.ESCALENO;
            }
            else {
                tipo = TipoTriangulo.ISOSCELES;
            }
        }

        /*
        triangulo = switch (tipo){
          case 1 -> "Equilátero";
          case 2 -> "Escaleno";
          case 3 -> "Isósceles";
          default -> "Antonio";
        }; */
        System.out.println("El triangulo marcado es: " + tipo);
    }
}

package com.marcosferrandiz.tema03;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int padres;
        float cuotaAbonar = 0;
        int edad;
        float cuotaBase = 500;
        float quitarCuota = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("¿Que edad tienes?");
        edad = input.nextInt();
        if (edad > 65){
            cuotaAbonar = 500 * 50/100;
        }else {
            if (edad < 18){
                System.out.println("¿Los padres son socios, 1 si es si, 2 si no?");
                padres = input.nextInt();
                if (padres == 1){
                    quitarCuota = 500 * 35/100;
                    cuotaAbonar = cuotaBase - quitarCuota;
                }else {
                    quitarCuota = 500 * 25/100;
                    cuotaAbonar = cuotaBase - quitarCuota;
                }
            }else {
                cuotaAbonar = cuotaBase;
            }
        }
        input.close();
        System.out.println("La cuota a abonar es de " + cuotaAbonar);
    }
}

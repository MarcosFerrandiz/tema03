package com.marcosferrandiz.tema03.ansi;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ciudad;
        int dia, mes, anyo;
        boolean checkDia, checkMes, checkAnyo, bisiesto;
        int h, m, s;
        boolean checkH, checkM, checkS;
        boolean checkProb, checkRad;

        final String ESC = "\u001B[";
        final String RESET = ESC + "0m";




        System.out.println("Introduzca la Ciudad correspondiente");
        ciudad = input.nextLine();

        //Indicar la fecha

        System.out.println("A continuación indique la fecha");
        do {
            System.out.println("Introduzca el año en el siguiente formato (yyyy)");
            anyo = Integer.parseInt(input.nextLine());
            checkAnyo = anyo >= 2024;
            if (!checkAnyo) {
                System.err.println("Valor introducido NO válido");
            }
        } while (!checkAnyo);

        do {
            System.out.println("Itroduzca el mes en numero (1,2,3,4...)");
            mes = Integer.parseInt(input.nextLine());
            checkMes = mes >= 1 && mes <= 12;
            if (!checkMes) {
                System.err.println("Valor introducido NO válido");
            }
        } while (!checkMes);

        do {
            System.out.println("Introduzca el dia");
            dia = Integer.parseInt(input.nextLine());
            checkDia = dia >= 1 && dia <= 31;
            bisiesto = anyo % 400 == 0 || anyo % 4 == 0 && anyo % 100 != 0;
            if (bisiesto){
                checkDia = dia >= 1 && dia <= 29;
            }

            if (bisiesto && mes == 2 && dia>29) {
                System.out.println("El año es bisiesto y no se puede pasar de mas de 29 dias");
            }else {
                if (!checkDia && mes == 2 && dia > 28){
                    System.out.println("El mes de febrero no puede contener mas de 28 dias");
                }else {
                    if (!checkDia){
                        System.out.println("El dia debe de ser entre 1 a 31");
                    }
                }
            }
            if (!checkDia) {
                System.err.println("Valor introducido NO válido");
            }
        } while (!checkDia);


        //Indicar la hora


        do {
            System.out.println("Itroduzca la hora que quieras en formato 24h");
            h = Integer.parseInt(input.nextLine());
            checkH = h >= 0 && h <= 23;

            if (!checkH){
                System.err.println("Valor introducido NO válido");
            }
        }while (!checkH);

        do {
            System.out.println("Introduzca los minutos que quieras hasta 59");
            m = Integer.parseInt(input.nextLine());
            checkM = m >= 0 && m <= 59;

            if (!checkM){
                System.err.println("Valor introducido NO válido");
            }
        }while (!checkM);

        do {
            System.out.println("Introduzca los segundos que quieras hasta 59");
            s = Integer.parseInt(input.nextLine());
            checkS = s >= 0 && s <= 59;

            if (!checkS){
                System.err.println("Valor introducido NO válido");
            }
        }while (!checkS);

        //Velocidad del viento

        System.out.println("Indique la velocidad del viento en Km/H");
        int veloKmH = Integer.parseInt(input.nextLine());

        //Temperatura

        System.out.println("Indique la temperatura actual");
        float temp = Float.parseFloat(input.nextLine());

        //Presión atmosférica

        System.out.println("Indique la presión atmosférica en hPa");
        float presAtm = Float.parseFloat(input.nextLine());

        //Probabilidad de lluvia

        int probabilidad;
        do {
            System.out.println("Indique la probabilidad de lluvia en porcentaje de 0 a 100");
            probabilidad = Integer.parseInt(input.nextLine());
            checkProb = probabilidad >= 0 && probabilidad <= 100;
            if (!checkProb){
                System.err.println("Valor introducido NO válido");
            }
        }while (!checkProb);

        //Radiacion ultravioleta

        int radViol;
        do {
            System.out.println("Indique la radiación ultravioleta");
            radViol = Integer.parseInt(input.nextLine());
            checkRad = radViol >=0;
            if (!checkRad){
                System.err.println("Valor introducido NO válido");
            }
        }while (!checkRad);

        //Cambio de colores a lo arcoiris y cosos de esos

        String colorVel = "";
        if (veloKmH <30){
            colorVel = "32";
        }else  {
            if( veloKmH >29 && veloKmH <60){
                colorVel ="33";
            }else {
                if (veloKmH >= 60) {
                    colorVel = "31";
                }
            }
        }

        String colorTemp = "";
        if (temp <22){
            colorTemp = "36";
        }else  {
            if( temp >=22 && temp <=27){
                colorTemp ="32";
            }else {
                if (temp >= 27 && temp <=35) {
                    colorTemp = "33";
                }else {
                    if (temp > 35) {
                        colorTemp = "31";
                    }
                }
            }
        }


        String colorProb = "";
        if (probabilidad <=35){
            colorProb = "32";
        }else  {
            if( probabilidad >35 && probabilidad <=70){
                colorProb ="33";
            }else {
                if (probabilidad > 70) {
                    colorProb = "31";
                }
            }
        }


        String colorRad = "";
        if (radViol <=2){
            colorRad = "32";
        }
        else  {
            if( radViol >=3 && radViol <=5){
                colorRad ="36";
            }else {
                if (radViol >= 6 && radViol <=7) {
                    colorRad = "33";
                }else {
                    if (radViol >= 8 && radViol <=10) {
                        colorRad = "31";
                    }else {
                        if (radViol > 10) {
                            colorRad = "35";
                        }
                    }
                }
            }
        }


        //Mostrar
        final String COSO = "%-24s";
        final String TITULO = "** DATOS ESTACIÓN METEREOLÓGICA **";
        final String CIUD = "Ciudad:";
        final String FECHA = "Fecha:";
        final String HORA = "Hora de la mesura:";
        final String VELVIEN = "Velocidad viento:";
        final String TEMP = "Temperatura:";
        final String PREATM = "Presión atmosférica:";
        final String PROBLLUVIA = "Probabilidad lluvia:";
        final String UVI = "UVI:";

        System.out.printf(ESC + "0;30;44m"+"%34s"+RESET+"\n", TITULO);
        System.out.printf( COSO +"%s\n",CIUD, ciudad);
        System.out.printf(COSO +"%02d/%02d/%04d\n", FECHA, dia, mes, anyo);
        System.out.printf(COSO +"%02d:%02d:%02d\n", HORA, h,m,s);
        System.out.printf(COSO+ ESC+ "1;"+colorVel+"m%d"+ RESET+ "km/h\n",VELVIEN,veloKmH);
        System.out.printf(COSO+ ESC+ "1;"+colorTemp+"m%.2f "+ RESET+ "Cº\n", TEMP, temp);
        System.out.printf(COSO+"%.1f  hPa\n", PREATM, presAtm);
        System.out.printf(COSO+ESC+ "1;"+colorProb+"m%d"+ RESET, PROBLLUVIA, probabilidad);
        System.out.println("%");
        System.out.printf(COSO+ESC+ "1;"+colorRad+"m%d \n" + RESET, UVI, radViol);


    }
}

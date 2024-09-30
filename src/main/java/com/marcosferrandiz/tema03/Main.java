package com.marcosferrandiz.tema03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica un valor");
        int i = Integer.parseInt(scanner.nextLine());
        System.out.println("Hello world!");
        int x = i++;
        int y = ++i;
    }
}
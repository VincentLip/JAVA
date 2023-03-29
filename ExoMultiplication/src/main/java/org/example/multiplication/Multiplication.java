package org.example.multiplication;

import java.util.Scanner;

public class Multiplication {

    public static void multiplication(){

        short number;
        System.out.println(" Entrer un nombre ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextShort();

        System.out.println(" Table de " + number);
        for (int i = 0; i < 11; i++) {
            System.out.println( number + " x " + i + " = " + number*i);
        }
    }
}

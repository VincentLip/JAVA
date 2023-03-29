package org.example.somme;

import java.util.Scanner;

public class Somme {

    public static void calculSomme(){

        short number;
        int result =0 ;
        System.out.println(" Entrer un nombre ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextShort();

        for (int i = 0; i <= number; i++) {
            result = result + i;
        }
        System.out.println(" La somme des nombres jusqu'à " + number + " est " + result);
    }
}

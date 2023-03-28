package org.example.exo5;

import java.util.Scanner;

public class Exo5 {

    public static void checkNumber(){

        short number1;
        short number2;
        System.out.println(" Entrer un nombre1 ");
        Scanner sc1 = new Scanner(System.in);
        number1 = sc1.nextShort();
        System.out.println(" Entrer un nombre2 ");
        Scanner sc2 = new Scanner(System.in);
        number2 = sc2.nextShort();

        if((number1<0) && (number2<0)  || (number1>0) && (number2>0)) {
            System.out.println(" Votre nombre est positif ");
        }else{
            System.out.println(" Votre nombre est négatif ");
        }

    }
}

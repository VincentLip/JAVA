package org.example.exo7;

import java.util.Scanner;

public class Exo7 {
    public static void checkNumber(){

        short number;
        System.out.println(" Entrer un nombre ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextShort();

        if(number < 0) {
            System.out.println(" Votre nombre est négatif ");
        }else if(number ==0 ){
            System.out.println(" Votre nombre est zéro ");
        }else{
            System.out.println(" Votre nombre est positif ");
        }

    }
}

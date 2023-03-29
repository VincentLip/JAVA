package org.example.exo9;

import java.util.Scanner;

public class Exo9 {

    public static void checkCategory(){

        short number;

        System.out.println(" Entrer votre âge ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextShort();

        if(number>= 6 & number <=7){
            System.out.println(" Votre catégorie est poussin ");
        }else if(number>= 8 & number <=9){
            System.out.println(" Votre catégorie est pupille ");
        }else if(number>= 10 & number <=11){
            System.out.println(" Votre catégorie est minime ");
        }else if(number>= 12){
            System.out.println(" Votre catégorie est cadet ");
        }else{
            System.out.println(" Vous êtes hors catégorie ");
        }
    }
}

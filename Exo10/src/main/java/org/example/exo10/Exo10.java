package org.example.exo10;

import java.util.Scanner;

public class Exo10 {

    public static void divisible(){

        int number;
        System.out.println(" Entrer un nombre ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        if(number%3 ==0){
            System.out.println(" Votre nombre est divisible par 3 ");
        }else{
            System.out.println(" Votre nombre n'est pas divisible par 3 ");
        }
    }
}

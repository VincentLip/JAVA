package org.example.structure;

import java.util.Scanner;

public class Exo1 {

    public static void getEvenOdd(){

        int number;

        System.out.println("Veuillez entrer un nombre");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        if(number%2 ==0){
            System.out.println("Le nombre est pair");
        }else{
            System.out.println("Le nombre est impair");
        }
    }
}

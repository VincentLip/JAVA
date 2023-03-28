package org.example.exo8;

import java.util.Scanner;

public class Exo8 {

    public static void askNumber(){

        int number = 0;
        System.out.println(" Entrer un nombre " );
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        while(number < 1 | number >3){
            System.out.println(" Entrer un nombre entre 1 et 3 " );
            Scanner sc1 = new Scanner(System.in);
            number = sc1.nextInt();

        }
        System.out.println(" Good " );

    }
}

package org.example.exo1;

import java.util.Scanner;

public class Exo1 {

    public static void carreNumber(){

        int num;
        System.out.println(" Entrer un nombre");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println(" Le carré de ce nombre est " + num*num);
    }
}

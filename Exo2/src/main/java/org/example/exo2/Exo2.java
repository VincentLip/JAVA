package org.example.exo2;

import java.util.Scanner;

public class Exo2 {


    public static void helloName(){

        String name;
        System.out.println(" Quel est votre prénom ?");
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        System.out.println(" Bonjour " + name);

    }
}

package org.example.structure;

import java.util.Scanner;

public class Exo3 {

    public static void convertCelsiusFahrenheit(){

        int celsius;
        int fahrenheit;
        System.out.println(" Entrer une valeur en celsius :");
        Scanner sc = new Scanner(System.in);
        celsius = sc.nextInt();

        fahrenheit = (celsius*9/5)+32;
        System.out.println(" La valeur en fahrenheit est de :" + fahrenheit);

    }
}

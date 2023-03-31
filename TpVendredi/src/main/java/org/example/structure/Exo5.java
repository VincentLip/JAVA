package org.example.structure;

import java.util.Scanner;

public class Exo5 {

    public static void calculAverage(){

        float number=0;
        double average=0;
        int count =0;

        while(number >= 0){

            System.out.println("Entrer un nombre");
            Scanner sc = new Scanner(System.in);
            number = sc.nextFloat();
            if(number >=0){
                average = average + number;
                count++;
            }

        }

        System.out.println("La moyenne de tout les nombres saisis est de " + average/count);

    }
}

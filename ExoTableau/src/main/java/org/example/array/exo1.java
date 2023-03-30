package org.example.array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class exo1 {

    public static void tabOccurence(){

        int[] tab = {1,2,3,4,2,3,1,3,3,3};
        int number ;
        int count =0;

        System.out.println(" Entrer le nombre recherché");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        for (int i = 0; i < tab.length; i++) {
            if(tab[i] == number){
                count++;
            }
        }
        System.out.println(" Il y a "+ count + " fois, le nombre " + number);

    }
}

package org.example.tableaux;

import java.util.Arrays;
import java.util.Scanner;

public class Exo3 {
    public static void createTab(){

        int[] tab = {10,20,30,40,50,60,70,80};
        int number;
        boolean isPresent = false;

        System.out.println("Veuillez saisir un entier");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        for (int i = 0; i < tab.length; i++) {
            if(tab[i] == number){
                isPresent = true;
            }

        }
        if(isPresent){
            System.out.println("L'entier est dans le tableau");
        }else{
            System.out.println("L'entier n'est pas dans le tableau");
        }

    }
}

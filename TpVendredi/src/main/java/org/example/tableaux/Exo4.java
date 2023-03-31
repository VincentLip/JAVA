package org.example.tableaux;

import java.util.Scanner;

public class Exo4 {

    public static void createTab(){

        int[] tab = new int[5];
        boolean odd = false;

        System.out.println("Veuillez saisir des entiers :");
        for (int i = 0; i < tab.length ; i++) {
            Scanner sc = new Scanner(System.in);
            tab[i] = sc.nextInt();
        }

        for (int i = 0; i < tab.length; i++) {
            if(tab[i] % 2 != 0 ){
                odd= true;
                break;
            }
        }

        if(odd){
            System.out.println("Au moins un élément est impair");
        }else{
            System.out.println("Tous les éléments sont pairs");
        }
    }

}

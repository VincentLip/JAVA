package org.example.tableaux;

import java.util.Arrays;
import java.util.Random;

public class Exo7 {
    public static void createTab(){

        int[] tab =  new int[10];
        int nbMax =0;

        for (int i = 0; i < tab.length; i++) {
            Random r = new Random();
            int number = r.nextInt(100);
            tab[i] = number;
            if(nbMax<tab[i]){
                nbMax = tab[i];
            }
        }
        System.out.println(Arrays.toString(tab));
        System.out.println("La valeur max du tableau est " + nbMax);
    }
}

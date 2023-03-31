package org.example.tableaux;

import java.util.Arrays;
import java.util.Random;

public class Exo6 {

    public static void createTab(){

        int[] tab1 =  new int[5];
        int[] tab2 =  new int[5];
        int count1 =0;
        int count2 =0;

        for (int i = 0; i < tab1.length; i++) {
            Random r = new Random();
            int number = r.nextInt(100);
            tab1[i] = number;
            count1 = tab1[i] + count1;
        }

        for (int i = 0; i < tab2.length; i++) {
            Random r = new Random();
            int number = r.nextInt(100);
            tab2[i] = number;
            count2 = tab2[i] + count2;
        }

        System.out.println(Arrays.toString(tab1));
        System.out.println(Arrays.toString(tab2));

        System.out.println("La somme des entiers des deux tableaux est de :" + (count1+count2));

    }
}

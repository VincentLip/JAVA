package org.example.tableaux;

import java.util.Arrays;
import java.util.Random;

public class Exo5 {

    public static void createTab(){

        int[] tab =  new int[10];

        for (int i = 0; i < tab.length; i++) {
            Random r = new Random();
            int number = r.nextInt(100);
            tab[i] = number;
        }
        System.out.println(Arrays.toString(tab));
    }
}

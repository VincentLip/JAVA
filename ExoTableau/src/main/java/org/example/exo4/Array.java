package org.example.exo4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {


    public static int[] generateRandomArray (int quantité){

        int quantity;
        System.out.println("Entrer la taille du tableau");
        Scanner sc = new Scanner(System.in);
        quantity = sc.nextInt();

        int tab[] = new int[quantity];

        for (int i = 0; i < tab.length; i++) {
            Random r = new Random();
            int number = r.nextInt(100);
            tab[i] = number;
        }
        return tab;
    }

    public static int[] extendArray(int[] arr) {

        int[] tab1 = generateRandomArray(5);
        int[] tab2 = new int[tab1.length*2];

        for (int i = 0; i < tab1.length; i++) {
            tab2[i] = tab1[i];
            tab2[i+ tab1.length] = tab1[i]*2;

        }
        System.out.println(Arrays.toString(tab1));
        System.out.println(Arrays.toString(tab2));

        return tab2;
    }

}

package org.example.tri;

import java.util.Arrays;

public class TriSelection {

    public static void triSelection(){

        int[] tab = {45,122,12,3,21,78,64,53,89};
        System.out.println(Arrays.toString(tab));

        for (int i = 0; i < tab.length; i++) {
            int index = i;
            for (int j = i+1; j < tab.length; j++) {
                if(tab[j]<tab[index]) {
                    index=j;

                }
            }
            int temp = tab[index];
            tab[index] = tab[i];
            tab[i]=temp;

        }
        System.out.println(Arrays.toString(tab));
    }
}

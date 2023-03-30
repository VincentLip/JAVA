package org.example.tri;

import java.util.Arrays;

public class TriBulle {

    public static void triBulle(){

        int[] tab = {5,2,1,4,3};
        System.out.println(Arrays.toString(tab));

        for (int i = 0; i < tab.length; i++) {
            for (int j = 1; j < tab.length-i; j++) {
                if(tab[j-1]>tab[j]){
                    int tmp = tab[j-1];
                    tab[j-1]=tab[j];
                    tab[j]=tmp;
                }
            }
        }
        System.out.println(Arrays.toString(tab));
    }
}

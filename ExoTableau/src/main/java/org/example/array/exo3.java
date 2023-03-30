package org.example.array;

import java.util.Arrays;

public class exo3 {

    public static void inverseTab(){

        int[] tab = {1,2,3,4,5};
        System.out.println(Arrays.toString(tab));

        for (int i = 0; i < tab.length/2; i++) {
            int tmp = tab[i];
            tab[i]=tab[tab.length-1-i];
            tab[tab.length-1-i]=tmp;
        }
        System.out.println(Arrays.toString(tab));
    }
}

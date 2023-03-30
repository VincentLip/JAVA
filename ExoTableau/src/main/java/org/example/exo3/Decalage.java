package org.example.exo3;

import org.example.exo4.Array;

import java.util.Arrays;

public class Decalage {



    public static void decalage(){

            String[] tab = {"D","E","C","A","L","A","G","E"};

            String tmp;
            tmp = tab[0];

        for (int i = 0; i < tab.length-1 ; i++) {
            tab[i] = tab[i+1];
        }
        tab[tab.length-1] = tmp;


        System.out.println(Arrays.toString(tab));
    }

}

package org.example.exo3;

public class Decalage {



    public static void decalage(){

            String[] tab = {"D","E","C","A","L","A","G","E"};

            String tmp;
            tmp = tab[0];

        for (int i = 0; i < tab.length-1 ; i++) {
            tab[i] = tab[i+1];
        }
        tab[tab.length-1] = tmp;
        System.out.println(tab[0]);
        System.out.println(tab[1]);
        System.out.println(tab[2]);
        System.out.println(tab[3]);
        System.out.println(tab[4]);
        System.out.println(tab[5]);
        System.out.println(tab[6]);
        System.out.println(tab[7]);
    }

}

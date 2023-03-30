package org.example.exo1;

import java.util.Scanner;

public class Note {

    static int tab[]= new int[20];
    static int average=0;
    static int note=0;
    public static void getNote(){

        System.out.println("Veuillez entrer les 20 notes :");
        for (int i = 0; i < tab.length ; i++) {
            Scanner sc = new Scanner(System.in);
            tab[i] = sc.nextInt();
        }

    }

    public static void getAverage(){

        for (int i = 0; i < tab.length; i++) {

            note = note + tab[i];
            average = note/ tab.length;
        }
        System.out.println(" La moyenne des notes est de " + average+ "/20");
    }

    public static void getWorstAndBetterNote(){

        int noteMin =20;
        int noteMax=0;

        for (int i = 0; i < tab.length; i++) {
            if(tab[i]>noteMax) {
                noteMax = tab[i];
            }
            if(tab[i]<noteMin) {
                noteMin=tab[i];
            }
        }
        System.out.println("La note maximum est " +noteMax);
        System.out.println("La note minimum est " +noteMin);

    }
}

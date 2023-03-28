package org.example.exo6;

import java.util.Scanner;

public class Exo6 {

    public static void alphabeticalOrder(){

        String nameA;
        String nameB;
        String nameC;

        System.out.println(" Entrer le premier prénom ");
        Scanner sc1 = new Scanner(System.in);
        nameA = sc1.next();
        System.out.println(" Entrer le premier prénom ");
        Scanner sc2 = new Scanner(System.in);
        nameB = sc2.next();
        System.out.println(" Entrer le premier prénom ");
        Scanner sc3 = new Scanner(System.in);
        nameC = sc3.next();

        int order1 = nameA.compareTo(nameB);
        int order2 = nameB.compareTo(nameC);
        if( order1<0 & order2<0 ){
            System.out.println("Les prénoms sont rangés par ordre alphabétique");
        }else{
            System.out.println("Les prénoms ne sont pas rangés par ordre alphabétique");
        }


    }
}

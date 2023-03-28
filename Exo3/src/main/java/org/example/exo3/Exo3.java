package org.example.exo3;

import java.util.Scanner;

public class Exo3 {

    public static void priceTtc(){

        float priceHT;
        short quantity;
        float taux;
        float total;

        System.out.println(" Entrer le prix HT ");
        Scanner sc1 = new Scanner(System.in);
        priceHT = sc1.nextFloat();
        System.out.println(" Entrer la quantité ");
        Scanner sc2 = new Scanner(System.in);
        quantity = sc2.nextShort();
        System.out.println(" Entrer le taux en % ");
        Scanner sc3 = new Scanner(System.in);
        taux = sc3.nextFloat();
        total = ((((priceHT*taux)/100)+priceHT)*quantity);

        System.out.println(" Avec un prix HT de " + priceHT + " de " + quantity + " produit(s), et une T.V.A de " + taux +
                "%. Le total est de : " + total);

    }
}

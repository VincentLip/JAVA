package org.example.structure;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Structure {

    public static void getPrice(){

        int price =-1;
        int result =0;
        int paid =0;
        int render=0;
        int render10=0;
        int render5=0;
        int render1=0;




        while(price != 0){
            System.out.println("Veuillez entrer un prix : ");
            System.out.println(" Entrer 0 pour quitter");
            Scanner sc = new Scanner(System.in);
            price = sc.nextInt();
            result = result + price;

        }
        System.out.println(" Le montant est de " + result);
        if(result !=0){
            System.out.println("Entrer la montant que vous versez :");
            Scanner sc1 = new Scanner(System.in);
            paid = sc1.nextInt();
            render = paid - result;
            System.out.println(render);

            while(render >=10){
                render10 = render10 + 1;
                render = render-10;
            }
            while(render <10 & render >=5){
                render5 = render5 + 1;
                render = render-5;
            }
            while(render<5 & render >0){
                render1 = render1 +1;
                render = render-1;
            }
            System.out.println("La monnaie rendu sera de " + render10 + " billet(s) de 10 euros " + render5 + " billet(s) de 5 euros et de " + render1 + " pièce(s) de 1 euros ");
        }


    }
}

package org.example.exo11;

import java.util.Scanner;

public class Exo11 {

    public static void photocopieCalcul(){

        short number;
        System.out.println(" Entrer le nombre de photocopie : ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextShort();

        if(number<10){
            System.out.println(" Pour " + number + " photocopie(s). Vous devrez payer " + number*0.15 + " euros");
        }else if(number >= 10 & number <=20 ){
            System.out.println(" Pour " + number + " photocopies. Vous devrez payer " + number*0.10 + " euros");
        }else{
            System.out.println(" Pour " + number + " photocopie(s). Vous devrez payer " + number*0.05 + " euros");
        }
    }
}

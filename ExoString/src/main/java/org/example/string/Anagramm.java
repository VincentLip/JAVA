package org.example.string;

import java.util.Scanner;

public class Anagramm {

    public static void anagramm(){

        String word1;
        String word2;

        System.out.println(" Entrer votre premier mot ");
        Scanner sc = new Scanner(System.in);
        word1 = sc.next();

        System.out.println(" Entrer votre second mot ");
        Scanner sc1 = new Scanner(System.in);
        word2 = sc1.next();


        if(word1.length() == word2.length()){

            for (int i = 0; i < word1.length(); i++) {
                if(word2.indexOf(word1.charAt(i)) == -1){
                    System.out.println("Ce n'est pas un annagramme");
                    break;
                }
                System.out.println("Annagramme");
            }
        }
    }
}

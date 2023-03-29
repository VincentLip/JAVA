package org.example.string;

import java.util.Scanner;

public class Palindrome {

    public static void palindrome() {

        String word1;



        System.out.println(" Entrer votre premier mot ");
        Scanner sc = new Scanner(System.in);
        word1 = sc.next();

        for (int i = 0; i < word1.length()/2-1; i++) {
            if (word1.charAt(i) == word1.charAt(word1.length() - 1 - i)){
                System.out.println("Ce mot est un palindrome");
            }else{
                System.out.println("Ce n'est pas un palindrome");
                break;
            }

        }

    }

}

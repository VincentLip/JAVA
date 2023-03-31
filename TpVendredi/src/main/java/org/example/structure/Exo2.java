package org.example.structure;

import java.util.Scanner;

public class Exo2 {

    public static void getNumberChar(){

        String word;
        int number=0;
        System.out.println("Veuillez entrer un mot");
        Scanner sc = new Scanner(System.in);
        word = sc.nextLine();

        System.out.println(word.length());

        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) != ' '){
                number++;
            }
        }
        System.out.println("Nombre total de caractères est: " + number);
    }
}

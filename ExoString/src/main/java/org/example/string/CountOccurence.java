package org.example.string;

import java.util.Scanner;

public class CountOccurence {

    public static void countOccurence(){

        String word;
        int number=0;

        System.out.println(" Entrer un mot");
        Scanner sc = new Scanner(System.in);
        word = sc.nextLine();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a'){
                    number++;
                }
        }
        System.out.println(number);
    }
}

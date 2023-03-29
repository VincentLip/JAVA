package org.example.string;

import java.util.Scanner;

public class CountWord {

    public static void countWord(){

        String phrase;
        Scanner sc = new Scanner(System.in);
        phrase = sc.nextLine();
        System.out.println(phrase.split(" ").length);
    }
}

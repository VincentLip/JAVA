package org.example.structure;

import java.util.Scanner;

public class Exo4 {

    public static void checkPassword(){

        String password;
        boolean capital = false;
        boolean number = false;
        System.out.println("Veuillez entrer un mot de passe");
        Scanner sc = new Scanner(System.in);
        password = sc.next();

        if(password.length() <8){
            System.out.println(" Mot de passe Invalide");
        }else{
            for (int i = 0; i < password.length(); i++) {
                if(Character.isUpperCase(password.charAt(i))){

                    capital = true;

                }else if(Character.isDigit(password.charAt(i))){

                    number = true;

                }

            }
        }
        if(capital & number){
            System.out.println(" Mot de passe Valide");
        }else{
            System.out.println(" Mot de passe Invalide");
        }
    }
}

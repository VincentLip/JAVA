package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {


    static List<Lieu> lieuList = new ArrayList<>();
    static List<Evenement> evenementList =new ArrayList<>();
    public static void mainMenu(){

        Scanner sc = new Scanner(System.in);
        String[] propositions = {
                "1- Gestion des lieux",
                "2- Gestion des evenements",
                "3- Gestion des clients",
                "0- Quitter",
                "Entrez votre choix : "};

        for (String prop : propositions) {
            System.out.println(prop);
        }

        String answer = sc.next();

        switch (answer) {
            case "1":
                menuLieux();
            case "2":
                menuEvenement();
            case "0":
                break;
        }
    }

    public static void menuLieux(){

        Scanner sc = new Scanner(System.in);
        String[] propositions = {
                "1- Ajouter un lieu",
                "2- Modifier un lieu",
                "3- Supprimer un lieu",
                "4- Voir la liste des lieux",
                "0- Menu principal",
                "Entrez votre choix : "};

        for (String prop : propositions) {
            System.out.println(prop);
        }

        String answer = sc.next();

        switch (answer) {
            case "1":
                addLieux();
                menuLieux();
            case "2":
                editLieux();
                menuLieux();
            case "3":
                deleteLieux();
                menuLieux();
            case "4":
                displayLieux();
                menuLieux();
            case "0":
                mainMenu();
        }
    }
    public static void addLieux(){

        String name;
        String adress;
        int capacity;

        System.out.println("==== Ajouter un lieu ====");
        System.out.println();
        System.out.println("Saisir le nom du lieu");
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        System.out.println("Saisir l'adresse du lieu");
        adress = sc.next();
        System.out.println("Saisir la capacité du lieu");
        capacity = sc.nextInt();

        lieuList.add(new Lieu(name,adress,capacity));

        System.out.println(lieuList);
    }

    public static void displayLieux(){

        System.out.println("Voici la liste des lieux");
        System.out.println();
        for (int i = 0; i < lieuList.size(); i++) {
            System.out.println(lieuList.get(i));
            System.out.println();
        }
    }

    public  static void deleteLieux(){

        String nameLieu;
        System.out.println("***** Supprimer un lieu *****");
        System.out.println("Saisir le nom du lieu");
        Scanner sc = new Scanner(System.in);
        nameLieu = sc.next();
        for (Lieu lieu:lieuList) {
            if(nameLieu.equals(lieu.getName())){
                lieuList.remove(lieu);
                System.out.println("Lieu supprimé" );
            }
        }
    }

    public static void editLieux(){

        String nameLieu;
        System.out.println("***** Modifier un lieu *****");
        System.out.println("Saisir le nom du lieu");
        Scanner sc = new Scanner(System.in);
        nameLieu = sc.next();
        for (Lieu lieu:lieuList) {
            if(nameLieu.equals(lieu.getName())){
                System.out.println("Lieu trouvé" );
                System.out.println("Saisir son nouveau nom" );
                Scanner sc1 = new Scanner(System.in);
                lieu.setName(sc1.next());
                System.out.println("Saisir sa nouvelle adresse " );
                Scanner sc2 = new Scanner(System.in);
                lieu.setAdress(sc2.next());
                System.out.println("Saisir sa nouvelle capacité " );
                Scanner sc3 = new Scanner(System.in);
                lieu.setCapacity(sc3.nextInt());
            }
        }
    }

    public static void menuEvenement(){

        Scanner sc = new Scanner(System.in);
        String[] propositions = {
                "1- Ajouter un evenement",
                "2- Modifier un evenement",
                "3- Supprimer un evenement",
                "4- Voir la liste des evenement",
                "0- Menu principal",
                "Entrez votre choix : "};

        for (String prop : propositions) {
            System.out.println(prop);
        }

        String answer = sc.next();

        switch (answer) {
            case "1":
                //addEvenement();
                menuEvenement();
            case "2":
                //editEvenement();
                menuEvenement();
            case "3":
                //deleteEvenement();
                menuEvenement();
            case "4":
                //displayEvenement();
                menuEvenement();
            case "0":
                mainMenu();
        }
    }


}

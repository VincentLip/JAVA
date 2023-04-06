package org.example.hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ihm {

    private static String nameHotel;

    static List<Room> roomList = new ArrayList<>();

   static List<Client> clientList = new ArrayList<>();


   static List<Reservation> reservationList = new ArrayList<>();


   public static void start(){
       for (int i = 1; i < 20; i++) {
           Room room = new Room(i,false,50,2);
           roomList.add(room);
       }
       Scanner sc = new Scanner(System.in);
       System.out.println("Veuillez donner un nom à l'hotel");
       nameHotel = sc.nextLine();
       Hotel hotel = new Hotel(nameHotel,roomList);
       System.out.println("Bienvenue dans l'hotel " + nameHotel);
       System.out.println();
       menu();

   }

   public static void menu(){

        Scanner sc1 = new Scanner(System.in);
        String[] propositions = {"1- Ajouter un client",
                "2- Afficher la liste des clients",
                "3- Afficher les réservations d'un client",
                "4- Ajouter une réservation",
                "5- Annuler une réservation",
                "6- Afficher la liste des réservations",
                "0- Quitter",
                "Entrez votre choix : "};

        for (String prop : propositions) {
            System.out.println(prop);
        }

        String answer = sc1.next();

        switch (answer) {
            case "1":
                addClient();
                menu();
            case "2":
                displayClient();
                menu();
            case "3":
                displayReservation();
                menu();
            case "0":
                break;
        }
    }

    public static void addClient(){

         String lastName;
         String firstName;
         int phone;

        System.out.println("==== Ajouter un client ====");
        System.out.println();
        System.out.println("Saisir le nom du client");
        Scanner sc = new Scanner(System.in);
        lastName = sc.next();
        System.out.println("Saisir le prénom du client");
        firstName = sc.next();
        System.out.println("Saisir le n° de téléphone du client");
        phone = sc.nextInt();

        clientList.add(new Client(lastName,firstName,phone));

        System.out.println(clientList);
    }

    public static void displayClient(){

        System.out.println("Voici la liste des clients");
        System.out.println();
        for (int i = 0; i < clientList.size(); i++) {
            System.out.println(clientList.get(i));
            System.out.println();
        }

    }

    public static void displayReservation(){
        int phone;
        Reservation reservation = new Reservation(1,true, new Client("j","j",1)
                ,new Room(1,false,40,4));

        reservationList.add(reservation);
        System.out.println("Entrez le numero de téléphone du client");
        Scanner sc = new Scanner(System.in);
        phone = sc.nextInt();

        for (Client client : clientList) {
            if(client.getPhone() == phone){
                System.out.println("Le client a une réservation");
                for (Reservation reservation1: reservationList) {
                    System.out.println(reservation1);

                }

            }

        }


    }

}

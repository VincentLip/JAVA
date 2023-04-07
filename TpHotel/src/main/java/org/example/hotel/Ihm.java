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
       for (int i = 1; i < 6; i++) {
           Room room = new Room(i,true,50,4);
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
                displayReservationClient();
                menu();
            case "4":
                addReservation();
                menu();
            case "5":
                cancelReservation();
                menu();
            case "6":
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

    public static void displayReservationClient(){
        int phone;
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

    public static void addReservation(){

       int telephone;
       int nbrOccupant;
       int nbRoom;


        System.out.println("***** Ajout d'une reservation *****");
        System.out.println("Saisir le numéro du client");
        Scanner sc  = new Scanner(System.in);
        telephone = sc.nextInt();
        System.out.println("Saisir le nombre d'occupant");
        Scanner sc1 = new Scanner(System.in);
        nbrOccupant = sc1.nextInt();

        for (Room room : roomList) {
            if(room.getCapacity() > nbrOccupant && room.isStatusRoom() == true){
                System.out.println("Chambre n°"+room.getNumber()+" disponible, capacité"+ room.getCapacity());
                System.out.println();
            }
        }
        System.out.println("Saisir le n° de chambre pour la reservation");
        Scanner sc2 = new Scanner(System.in);
        nbRoom = sc2.nextInt();

        for (Room room1 : roomList) {
            for (Client client:clientList) {
                if(telephone == client.getPhone()){
                    Client tmpClient = new Client(client.getId(), client.getLastName(),client.getFirstName(),client.getPhone());
                    if(room1.getNumber() == nbRoom){
                        room1.setStatusRoom(!room1.isStatusRoom());
                        Reservation reservation = new Reservation(true,tmpClient,room1);
                        reservationList.add(reservation);
                        System.out.println(reservation);
                    }
                }
            }
        }

    }

    public static void displayReservation(){

        for (Reservation reservation:reservationList) {
            System.out.println(reservation);

        }
    }

    public  static void cancelReservation(){

       int nbReservation;
        System.out.println("***** Annulation reservation *****");
        System.out.println("Saisir le numero de reservation");
        Scanner sc = new Scanner(System.in);
        nbReservation = sc.nextInt();

        for (Reservation reservation:reservationList) {
            if(nbReservation == reservation.getNumber()){
                reservation.setStatusReservation(!reservation.isStatusReservation());
                Room tmpRoom = new Room();
                tmpRoom = reservation.getRoom();
                tmpRoom.setStatusRoom(!tmpRoom.isStatusRoom());
                System.out.println(tmpRoom);
                reservationList.remove(reservation);
                System.out.println("Reservation annulée et chambre libérée" );
            }
        }
    }
}

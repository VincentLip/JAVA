package org.example.hotel;

public class Reservation {

    private int number;

    private static int counter =0;

    {
        ++counter;
    }
    private boolean statusReservation;
    private Client client;
    private Room room;

    public Reservation(boolean statusReservation, Client client, Room room) {
        this.number = counter;
        this.statusReservation = statusReservation;
        this.client = client;
        this.room = room;
    }

    @Override
    public String toString() {
        return "Reservation n°" + number +
                ", statusReservation=" + statusReservation +
                ", client=" + client +
                ", room=" + room;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isStatusReservation() {
        return statusReservation;
    }

    public void setStatusReservation(boolean statusReservation) {
        this.statusReservation = statusReservation;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}

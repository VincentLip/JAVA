package org.example.hotel;

import java.util.List;

public class Hotel {

    private String name;
    private List<Room> roomList;
    private List<Reservation> reservationList;
    private List<Client> clientList;

    public Hotel(String name, List<Room> roomList) {
        this.name = name;
        this.roomList = roomList;
    }


    public Hotel(String name, List<Room> roomList, List<Reservation> reservationList, List<Client> clientList) {
        this.name = name;
        this.roomList = roomList;
        this.reservationList = reservationList;
        this.clientList = clientList;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", roomList=" + roomList +
                ", reservationList=" + reservationList +
                ", clientList=" + clientList +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }
}

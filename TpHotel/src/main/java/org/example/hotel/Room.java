package org.example.hotel;

public class Room {

    private int number;

    private boolean statusRoom;
    private int price;
    private int capacity;

    public Room(int number, boolean statusRoom, int price, int capacity) {
        this.number = number;
        this.statusRoom = statusRoom;
        this.price = price;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", statusRoom=" + statusRoom +
                ", price=" + price +
                ", capacity=" + capacity +
                '}';
    }
}

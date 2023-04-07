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

    public Room() {
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isStatusRoom() {
        return statusRoom;
    }

    public void setStatusRoom(boolean statusRoom) {
        this.statusRoom = statusRoom;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Room n°" + number +
                ", statusRoom=" + statusRoom +
                ", price=" + price +
                ", capacity=" + capacity ;
    }

}

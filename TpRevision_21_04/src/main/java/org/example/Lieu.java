package org.example;

public class Lieu {


    private String name;
    private String adress;
    private int capacity;


    public Lieu( String name, String adress, int capacity) {
        this.name = name;
        this.adress = adress;
        this.capacity = capacity;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Lieu{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}


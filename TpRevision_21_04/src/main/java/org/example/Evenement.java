package org.example;

public class Evenement {

    private String name;
    private int hour;

    private Lieu lieu;
    private float price;
    private int nbTicketSold;

    public Evenement(String name, int hour, Lieu lieu, float price, int nbTicketSold) {
        this.name = name;
        this.hour = hour;
        this.lieu = lieu;
        this.price = price;
        this.nbTicketSold = nbTicketSold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public Lieu getLieu() {
        return lieu;
    }

    public void setLieu(Lieu lieu) {
        this.lieu = lieu;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNbTicketSold() {
        return nbTicketSold;
    }

    public void setNbTicketSold(int nbTicketSold) {
        this.nbTicketSold = nbTicketSold;
    }

    public int checkDisponibility(Lieu lieu){

        if(nbTicketSold < lieu.getCapacity()){
            return nbTicketSold- lieu.getCapacity();
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Evenement{" +
                "name='" + name + '\'' +
                ", hour=" + hour +
                ", lieu=" + lieu +
                ", price=" + price +
                ", nbTicketSold=" + nbTicketSold +
                '}';
    }
}

package org.example.hotel;

public class Client {

    private int id;

    private static int counter =0;

    {
        ++counter;
    }

    private String lastName;
    private String firstName;

    private int phone;

    public Client(String lastName, String firstName, int phone) {
        this.id = counter;
        this.lastName = lastName;
        this.firstName = firstName;
        this.phone = phone;
    }

    public Client(int id, String lastName, String firstName, int phone) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Client n°" + id +
                ", nom : " + lastName + '\'' +
                ", prénom : " + firstName + '\'' +
                ", n° téléphone = " + phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Client.counter = counter;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}

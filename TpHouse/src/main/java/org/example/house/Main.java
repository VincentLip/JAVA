package org.example.house;

public class Main {

    public static void main() {
        Apartment apartment = new Apartment();
        Person person = new Person("Thomas",apartment);
        person.display();
    }
}

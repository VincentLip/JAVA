package org.example.house;

public class Person {

    protected String name;
    protected House house;

    public Person(String name, House house) {
        this.name = name;
        this.house = house;
    }

    public void display()
    {
        System.out.println("Je m'appelle "+ name);
        house.display();
        house.door.display();
    }
}

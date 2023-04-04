package org.example.person;

public class Person {

    int age ;

    public void setAge(int age) {
        this.age = age;
    }

    public void hello(){

        System.out.println("Hello");
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}

package org.example.person;

public class Student extends Person{

    public void GoToClasses(){

        System.out.println("I'm going to class");
    }

    public void DisplayAge(){

        System.out.println("My age is : "+ age + " years old.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }
}

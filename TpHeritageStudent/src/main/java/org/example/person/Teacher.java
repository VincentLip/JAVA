package org.example.person;

public class Teacher extends Person{

    private String subject;
    public void Explain(){

        System.out.println("Explanation begins");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                ", age=" + age +
                '}';
    }
}

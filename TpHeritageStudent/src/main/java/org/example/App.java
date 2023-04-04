package org.example;

import org.example.person.Person;
import org.example.person.Student;
import org.example.person.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Person person = new Person();
        person.hello();
        System.out.println();

        Student student = new Student();
        student.setAge(15);
        student.hello();
        student.GoToClasses();
        student.DisplayAge();
        System.out.println();

        Teacher teacher = new Teacher();
        teacher.setAge(40);
        teacher.hello();
        teacher.Explain();

    }
}

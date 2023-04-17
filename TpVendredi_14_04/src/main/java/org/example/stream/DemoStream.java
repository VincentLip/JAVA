package org.example.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStream {

    public static void main() {

        Teacher teacher1 = new Teacher(1,"John Doe","Mathematique",2010);
        Teacher teacher2 = new Teacher(2,"Jane Smith","Physique",2015);
        Teacher teacher3 = new Teacher(3,"Michael Johnson","Chimie",2005);
        Teacher teacher4 = new Teacher(4,"Michel Papin","Informatique",2003);

        Course course1 = new Course(1,"Calculs",teacher1,15);
        Course course2 = new Course(2,"Mecanique",teacher2,10);
        Course course3 = new Course(3,"Chimie Organique",teacher3,12);
        Course course4 = new Course(4,"Java",teacher4,12);

        Student student1 = new Student(1,"Alice Smith",18,new ArrayList<>());
        Student student2 = new Student(2,"Bob Johnson",20,new ArrayList<>());
        Student student3 = new Student(3,"Charlie Williams",19,new ArrayList<>());
        Student student4 = new Student(4,"David Brown",21,new ArrayList<>());
        Student student5 = new Student(5,"Eve Jones",22,new ArrayList<>());

        student1.addCourse(course1);
        student1.addCourse(course2);

        student2.addCourse(course3);
        student2.addCourse(course1);

        student3.addCourse(course4);
        student3.addCourse(course3);
        student3.addCourse(course1);

        student4.addCourse(course3);
        student4.addCourse(course1);
        student4.addCourse(course2);
        student4.addCourse(course4);

        student5.addCourse(course1);
        student5.addCourse(course3);
        student5.addCourse(course2);

        List<Student> studentList =new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);
        teacherList.add(teacher4);

        List<Course> courseList = new ArrayList<>();
        courseList.add(course1);
        courseList.add(course2);
        courseList.add(course3);
        courseList.add(course4);


        System.out.println("***** 1 *****");
        List<Student> studentList1 = studentList.stream()
                .filter(s -> s.getAge()>20)
                .collect(Collectors.toList());

        studentList1.forEach(System.out::println);
        System.out.println();

        System.out.println("***** 2 *****");
        List<String> teacherList1 = teacherList.stream()
                .map(t -> t.getName())
                .collect(Collectors.toList());
        teacherList1.forEach(System.out::println);
        System.out.println();

        System.out.println("***** 3 *****");
        List<String> teacherList2 = teacherList.stream()
                .map(t -> t.getDepartment())
                .collect(Collectors.toList());
        teacherList2.forEach(System.out::println);
        System.out.println();

        System.out.println("***** 4 *****");
        List<Teacher> teacherList3 = courseList.stream()
                .map(t -> t.getTeacher())
                .collect(Collectors.toList());
        teacherList3.forEach(System.out::println);
        System.out.println();

        System.out.println("***** 5 *****");

       Integer result = courseList.stream()
                .map(d -> d.getDuration())
               .mapToInt(Integer::intValue).sum();

        System.out.println(result);


        System.out.println("***** 6 *****");

        List<String> stringList = courseList.stream()
                .filter(c -> c.getDuration()>11)
                .map(n -> n.getName())
                .collect(Collectors.toList());

        stringList.forEach(System.out::println);
        System.out.println();

        System.out.println("***** 7 *****");



        System.out.println("***** 8 *****");
        List<List<Course>> courseList1 = studentList.stream()
                .map(c -> c.getCourses())
                .collect(Collectors.toList());
        courseList1.forEach(System.out::println);
        System.out.println();


        System.out.println("***** 9 *****");

        List<String> stringList1 = courseList.stream()
                .filter(c -> c.getDuration()>12)
                .map(n -> n.getName())
                .sorted()
                .collect(Collectors.toList());
        stringList1.forEach(System.out::println);
        System.out.println();

        System.out.println("***** 10 *****");

        List<List<Course>> courseList2 = studentList.stream()
                .filter(s -> s.getAge() >= 18 & s.getAge()<=20)
                .map(c -> c.getCourses())
                .collect(Collectors.toList());

        courseList2.forEach(System.out::println);
        System.out.println();

        System.out.println("***** 11 *****");





        System.out.println("***** 12 *****");

        Long number = studentList.stream()
                .filter(s->s.getAge()>=20)
                .map(c->c.getCourses())
                .count();

        System.out.println(number);
        System.out.println();

        System.out.println("***** 13 *****");




    }

}

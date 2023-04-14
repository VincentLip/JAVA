package org.example.stream;

public class Teacher {

    private int id;
    private String name;
    private String department;
    private int startDate;

    public Teacher(int id, String name, String department, int startDate) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.startDate = startDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getStartDate() {
        return startDate;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", startDate=" + startDate +
                '}';
    }
}

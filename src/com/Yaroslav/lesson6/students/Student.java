package com.Yaroslav.lesson6.students;



public class Student {
    private String firstName, lastName, group;
    protected double averageMark;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public Student(String firstName, String lastName, String group) {
        this(firstName, lastName);
        this.group = group;
    }

    public int getScholarship(){
        return averageMark == 5? 100 : 80;
    }

}

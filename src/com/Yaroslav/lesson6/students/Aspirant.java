package com.Yaroslav.lesson6.students;

public class Aspirant extends Student{

    private String work;

    public Aspirant(String firstName, String lastName){
        super(firstName,lastName);
    }
    public Aspirant(String firstName, String lastName,String work){
        this(firstName,lastName);
        this.work = work;
    }

    @Override
    public int getScholarship() {
        return averageMark == 5? 200 : 180;
    }
}

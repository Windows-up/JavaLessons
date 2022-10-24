package com.Yaroslav.lesson6.animals;

public abstract class Animal {

    private String food;
    private String location;

    public Animal() {
    }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoice() {
        System.out.println("Неизвестное животное шумит");
    }

    public void eat() {
        System.out.println("Неизвестное животное ест");
    }

    public void sleep() {
        System.out.println("Неизвестное животное спит");
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

}

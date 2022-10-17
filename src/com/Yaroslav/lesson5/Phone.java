package com.Yaroslav.lesson5;

public class Phone {

    private int number;
    private int model;
    private int weight;

    public Phone() {
    }

    public Phone(int number, int model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, int model, int weight) {
        this(number,model);
        this.weight = model;
    }

    public int getNumber() {
        return number;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }
}

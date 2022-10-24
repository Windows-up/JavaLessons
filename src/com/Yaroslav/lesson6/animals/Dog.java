package com.Yaroslav.lesson6.animals;

public class Dog extends Animal {

    private boolean pointyEars = false;

    public Dog(String food, String location){
        super(food,location);
    }

    //@Override
    public void makeNoice() {
        System.out.println("Собака гавкает (Шум)");
    }

    @Override
    public void eat() {
        System.out.println("Собака кушает");
    }



}



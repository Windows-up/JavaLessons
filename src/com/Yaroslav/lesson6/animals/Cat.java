package com.Yaroslav.lesson6.animals;

public class Cat extends Animal {

    private boolean pointyEars = true;

    public Cat(String food, String location){
        super(food,location);
    }

    //@Override
    public void makeNoice() {
        System.out.println("Ночной тыг-дык (Шум)");
    }

    @Override
    public void eat() {
        System.out.println("Кот кушает");
    }


}

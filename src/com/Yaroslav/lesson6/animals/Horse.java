package com.Yaroslav.lesson6.animals;

public class Horse extends Animal {

    private int hoovesSize;

    public Horse(String food, String location) {
        super(food, location);
    }

    //@Override
    public void makeNoice() {
        System.out.println("Лошадь почему-то шумит (Шум)");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь есть вкусное сено");
    }


}

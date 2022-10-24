package com.Yaroslav.lesson6.animals;

public class Veterinarian {

    public void treatAnimal(Animal animal) {
        System.out.print("Animal`s food: " + animal.getFood());
        System.out.println("; Location: " + animal.getLocation());
    }

}

package com.Yaroslav.main;

import com.Yaroslav.lesson5.Phone;
import com.Yaroslav.lesson6.animals.*;
import com.Yaroslav.lesson6.students.Aspirant;
import com.Yaroslav.lesson6.students.Student;

public class Main {

    public static void main(String[] args) {
        //lesson5main();
        Animal[] animals = {
                new Dog("Bones", "Home"),
                new Horse("Apples", "Farm"),
                new Cat("All", "City"),
        };

        Veterinarian veterinarian = new Veterinarian();

        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }

        Student person = new Aspirant("Anton","Olegov","Doctor");

    }

    private static void lesson5main() {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone(123456, 6);
        Phone phone3 = new Phone(122249, 2, 15);

        phone1.receiveCall("Artem");
        phone2.receiveCall("Anna");
        phone3.receiveCall("Alex");

        System.out.println("Phone1`s number " + phone1.getNumber());
        System.out.println("Phone2`s number " + phone2.getNumber());
        System.out.println("Phone3`s number " + phone3.getNumber());

    }
}
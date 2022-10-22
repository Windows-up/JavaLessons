package com.Yaroslav.main;

import com.Yaroslav.lesson5.Phone;

public class Main {

    public static void main(String[] args) {
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
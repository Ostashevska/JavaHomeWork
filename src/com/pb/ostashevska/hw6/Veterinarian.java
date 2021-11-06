package com.pb.ostashevska.hw6;

public class Veterinarian {
    public void treatAnimal() {

        Animal animals = new Animal();
        animals.setFood("Корм");
        animals.setLocation("Місто");

        System.out.println( "знаходиться у "+ animals.getLocation() + ", раціон - "+ animals.getFood() );

    }
}
package com.pb.ostashevska.hw6;

public class Veterinarian {
    public void treatAnimal(Animal animal) {

        Animal animals = new Animal();
        animals.setFood("Корм");
        animals.setLocation("Місто");

        System.out.println( "Тварина "+/* a +*/ "знаходиться у "+ animals.getLocation() + ", раціон - "+ animals.getFood() );

    }
    }


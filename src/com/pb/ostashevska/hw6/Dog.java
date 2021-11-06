package com.pb.ostashevska.hw6;

import java.util.Objects;

public class Dog extends Animal {
    private String DogName;

    public String getDogName() {
        return DogName;
    }

    public void setDogName(String dogName) {
        DogName = dogName;
    }

    public String getDogBreed() {
        return DogBreed;
    }

    public void setDogBreed(String dogBreed) {
        DogBreed = dogBreed;
    }

    private String DogBreed;

    @Override
    public void makeNoise() {
        System.out.println( DogName );
        super.makeNoise();
    }

    @Override
    public void eat () {
        System.out.println( DogName);
        super.eat();
    }

    /*@Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    } */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(DogName, dog.DogName) && Objects.equals(DogBreed, dog.DogBreed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(DogName, DogBreed);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "DogName='" + DogName + '\'' +
                ", DogBreed='" + DogBreed + '\'' +
                '}';
    }
}

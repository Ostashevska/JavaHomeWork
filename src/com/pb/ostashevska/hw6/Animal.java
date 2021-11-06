package com.pb.ostashevska.hw6;

public class Animal {
    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private String food;
    private String location;


    public void makeNoise() {
        System.out.println( " шумить ");
    }

    public void eat () {
            System.out.println(" їсть ");
        }

    public void sleep () {
        System.out.println(" спить ");
    }

    // public void treatAnimal() {}
}

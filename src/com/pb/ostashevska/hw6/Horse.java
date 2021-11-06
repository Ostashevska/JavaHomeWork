package com.pb.ostashevska.hw6;

import java.util.Objects;

public class Horse extends Animal {
    public String getHorseName() {
        return HorseName;
    }

    public void setHorseName(String horseName) {
        HorseName = horseName;
    }

    public String getHorseBreed() {
        return HorseBreed;
    }

    public void setHorseBreed(String horseBreed) {
        HorseBreed = horseBreed;
    }

    private String HorseName;
    private String HorseBreed;

    @Override
    public void makeNoise() {
        System.out.println( HorseName);
        super.makeNoise();
    }

    @Override
    public void eat () {
        System.out.println( HorseName);
        super.eat();
    }

   /* @Override
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
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(HorseName, horse.HorseName) && Objects.equals(HorseBreed, horse.HorseBreed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(HorseName, HorseBreed);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "HorseName='" + HorseName + '\'' +
                ", HorseBreed='" + HorseBreed + '\'' +
                '}';
    }
}

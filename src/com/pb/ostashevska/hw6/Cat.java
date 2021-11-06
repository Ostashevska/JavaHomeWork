package com.pb.ostashevska.hw6;

import java.util.Objects;

public class Cat extends Animal {
    private String CatName;

    public String getCatName() {
        return CatName;
    }

    public void setCatName(String catName) {
        CatName = catName;
    }

    public String getCatBreed() {
        return CatBreed;
    }

    public void setCatBreed(String catBreed) {
        CatBreed = catBreed;
    }

    private String CatBreed;

    @Override
    public void makeNoise() {
        System.out.println( CatName);
        super.makeNoise();
    }

    @Override
    public void eat () {
        System.out.println( CatName);
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
    } */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return CatName.equals(cat.CatName) && CatBreed.equals(cat.CatBreed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CatName, CatBreed);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "CatName='" + CatName + '\'' +
                ", CatBreed='" + CatBreed + '\'' +
                '}';
    }
}

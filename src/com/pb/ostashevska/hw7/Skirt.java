package com.pb.ostashevska.hw7;

public class Skirt extends Clothes implements WomenClothes{

    @Override
    public void dressWomen() {
        System.out.println("Спідниця: розмір " + size + " ціна - " + price + " колір - "+ color);
    }
}

package com.pb.ostashevska.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes{


    @Override
    public void dressMan() {
        System.out.println("Футбока: розмір " + size + " ціна - " + price + " колір - "+ color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Футболка: розмір " + size + " ціна - " + price + " колір - "+ color);
    }
}

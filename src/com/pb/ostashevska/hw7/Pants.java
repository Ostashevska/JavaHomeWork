package com.pb.ostashevska.hw7;

import java.util.Arrays;

public class Pants extends Clothes implements ManClothes, WomenClothes{

    @Override
    public void dressMan() {
        System.out.println("Штани: розмір " + size + " ціна - " + price + " колір - "+ color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Штани: розмір " + size + " ціна - " + price + " колір - "+ color);
    }
}

package com.pb.ostashevska.hw7;

public class Tie extends Clothes implements ManClothes {
    @Override
    public void dressMan() {
        System.out.println("Галстук: розмір " + size + " ціна - " + price + " колір - "+ color);
    }
}

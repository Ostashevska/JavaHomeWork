package com.pb.ostashevska.hw7;

public abstract class  Clothes {

    public String size;
    public int price;
    public String color;

    public String getSize(String size) {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPrice(int price) {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor(String s) {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

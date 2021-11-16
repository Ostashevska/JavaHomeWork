package com.pb.ostashevska.hw7;

public abstract class  Clothes {

    Size size;
    public int price;
    public String color;

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

    public Size getSize(String s) {
        return size;
    }

    public void setSize(String size) {
         size = size;
    }

}

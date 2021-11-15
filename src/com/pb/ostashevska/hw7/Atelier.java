package com.pb.ostashevska.hw7;

public class Atelier {

    public static void dressMan(Clothes[] clothes){
        for (Clothes allClothes: clothes){
            if (allClothes instanceof ManClothes) {
                ManClothes manClothes = (ManClothes) allClothes;
                manClothes.dressMan();
            }
        }

    }
    public static void dressWomen(Clothes[] clothes) {
        for (Clothes allClothes : clothes) {
            if (allClothes instanceof WomenClothes) {
                WomenClothes womenClothes = (WomenClothes) allClothes;
                womenClothes.dressWomen();
            }
        }
    }

    public static void main(String[] args){
        Tshirt tshirt = new Tshirt();
        tshirt.setColor(" white ");
        tshirt.setPrice(100);
        tshirt.setSize(" M ");

        Pants pants = new Pants();
        pants.setColor(" black ");
        pants.setPrice(150);
        pants.setSize(" M ");

        Tie tie = new Tie();
        tie.setColor(" green ");
        tie.setPrice(50);
        tie.setSize(" M ");

        Skirt skirt = new Skirt();
        skirt.setColor(" blue ");
        skirt.setPrice(150);
        skirt.setSize(" M ");

        Clothes[] clothes = new Clothes[] {tshirt, pants, tie, skirt};

        dressMan(clothes);
        dressWomen(clothes);

    }
}

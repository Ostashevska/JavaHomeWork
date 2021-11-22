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
        tshirt.setSize("m");

        Pants pants = new Pants();
        pants.setColor(" black ");
        pants.setPrice(150);
        pants.setSize("m");

        Tie tie = new Tie();
        tie.setColor(" green ");
        tie.setPrice(50);
        tie.setSize("m");

        Skirt skirt = new Skirt();
        skirt.setColor(" blue ");
        skirt.setPrice(150);
        skirt.setSize("m");

        Clothes[] clothes = new Clothes[] {tshirt, pants, tie, skirt};

        System.out.println("Чоловічий одяг: ");
        dressMan(clothes);
        System.out.println("Жіночий одяг: ");
        dressWomen(clothes);

    }
}

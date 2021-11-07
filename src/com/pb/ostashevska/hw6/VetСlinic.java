package com.pb.ostashevska.hw6;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class VetСlinic {
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException {
        Veterinarian doc = new Veterinarian();

        Cat cat = new Cat();
        cat.setCatName(" Кузя ");
        cat.setCatBreed(" Сіамський ");

        Dog dog = new Dog();
        dog.setDogName(" Топік ");
        dog.setDogBreed(" Вівчарка ");

        Horse horse = new Horse();
        horse.setHorseName(" Зірка ");
        horse.setHorseBreed(" Мустанг ");

        Animal[] animal = new Animal[] {cat, dog, horse};
        System.out.println(Arrays.toString(animal));

        cat.makeNoise();

        for(Animal a: animal) {
            System.out.println("На прийомі у ветеринара: " + a);
            doc.treatAnimal();
        }

        Class<Object> Clazz = (Class<Object>) Class.forName("com.pb.ostashevska.hw6.Veterinarian");

        Constructor<Object> constr = Clazz.getConstructor();
        Object obj = null;
        try {
            obj = constr.newInstance("Доктор");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        if (obj instanceof Veterinarian) {
            ((Veterinarian) obj).treatAnimal();
        }

    }
}

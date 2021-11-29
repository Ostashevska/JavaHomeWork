package com.pb.ostashevska.hw10;

public class NumBox<T extends Number> {

    private T vehicle;
    private T[] vehicles;

    @SuppressWarnings("unchecked")

  //  инициализировать массив в конструкторе.
    public NumBox(T[] vehicles) {
        this.vehicles = vehicles;
    }

    //конструктор принимающий параметр - максимальную длину массива.
    public NumBox(int maxLenght) {
        vehicles = (T[]) new Number[maxLenght];
    }

    public T get() {
        return vehicle;
    }

    public void set(T vehicle) {
        this.vehicle = vehicle;
    }

    public void set(int index) {
        this.vehicles[index] = vehicle;
    }

   //добавляющий число в массив. В случае если массив полон - выбросить исключение.
    public void add(int index, T vehicle){
        try {
            if(index<vehicles.length) {
                this.vehicles[index] = vehicle;
            }
        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }
    }

//возвращающий число по индексу.
    public T get(int index) {
        System.out.println(index +"-тий елемент масиву: "+ vehicles[index]);
        return vehicles[index];
    }

//возвращает текущее количество элементов
    public int length() {
        int size=vehicles.length;
        vehicles = (T[]) new Number[size];
        System.out.println("Розмір масиву: "+ size);
        return size;
    }

// подсчет среднего арифметического среди элементов массива.
    public double average(){
        double arg=0;
        for (T vehicle: vehicles) {
            arg+= vehicle.doubleValue();
        }
        arg = arg/vehicles.length;
        System.out.println("Середнє арифметичне елементів масиву: "+ arg);
        return arg;
    }

//сумма всех элементов массива
    public double sum(){
        double sum=0;
        for (T vehicle: vehicles) {
            sum+= vehicle.doubleValue();
        }
        System.out.println("Сума елементів масиву: "+ sum);
        return sum;
    }
    //максимальный элемент массива
    public T max() {
        double max=0;
        for (T vehicle : vehicles) {
            if (max < vehicle.doubleValue())
                max = vehicle.doubleValue();
        }
        System.out.println("Найбільший елемент масиву: " + max);
        return null;
    }

}

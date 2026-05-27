package rvt.PD_Test;

public class Car {
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void printCar(){
        System.out.println(brand + " " + model + " " + year);
    }
}

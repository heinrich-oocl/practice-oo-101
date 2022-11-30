package com.oo101;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Cool Car", 30);
        Truck truck = new Truck("Big Truck", 10);
        car.speedup();
        truck.speedup();
    }
}

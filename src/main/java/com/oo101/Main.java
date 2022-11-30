package com.oo101;

public class Main {
    public static void main(String[] args) {

        Car electricCar = new Car("Electric Car", new ElectricEngine());
        Car gasolineCar = new Car("Gasoline Car", new GasolineEngine());
        Truck electricTruck = new Truck("Electric Truck", new ElectricEngine());
        Truck gasolineTruck = new Truck("Gasoline Truck", new GasolineEngine());
        electricCar.speedup();
        gasolineCar.speedup();
        electricTruck.speedup();
        gasolineTruck.speedup();

        Driver carDriver = new Driver(electricCar);
        Driver truckDriver = new Driver(electricTruck);
        carDriver.drive();
        truckDriver.drive();
    }
}

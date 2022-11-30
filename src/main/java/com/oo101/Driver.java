package com.oo101;

public class Driver {
    private Vehicle vehicle;

    public Driver(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public void drive(){
        vehicle.speedup();
    }

}

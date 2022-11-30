package com.oo101;

public class Car {
    private String name;
    private int speed;

    public Car(String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    public void speedup(){
        System.out.println(name + ": speed up " + speed + " km/h");
    }

}

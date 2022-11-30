package com.oo101;

public class Vehicle {
    private String name;
    private Engine engine;

    public Vehicle(String name, Engine engine){
        this.name = name;
        this.engine = engine;
    }

    public void speedup(){
        System.out.println(name + ": speed up " + engine.getSpeed() + " km/h");
    }
}

package org.example.company;

public class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        return "the Mitsubishi's engine is starting";
    }

    public String accelerate() {
        return "the Mitsubishi is accelerating";
    }

    public String brake() {
        return "the Mitsubishi is braking";
    }

}

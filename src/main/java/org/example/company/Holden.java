package org.example.company;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        return "the Holden's engine is starting";
    }

    public String accelerate() {
        return "the Holden is accelerating";
    }

    public String brake() {
        return "the Holden is braking";
    }
}






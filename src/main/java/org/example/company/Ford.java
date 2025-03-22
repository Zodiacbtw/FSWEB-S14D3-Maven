package org.example.company;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        return "the Ford's engine is starting";
    }

    public String accelerate() {
        return "the Ford is accelerating";
    }

    public String brake() {
        return "the Ford is braking";
    }
}

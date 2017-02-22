package com.company;

public abstract class Car {

    protected String description = "Unknown car";

    public abstract double calculatePrice();

    public String getDescription() {
        return description;
    }
}

package com.company.equipment;

import com.company.Car;
import com.company.Decorator;

public class Radio extends Decorator{

    Car car;

    public Radio(Car car) {
        this.car = car;
    }

    public double calculatePrice() {
        return 500 + car.calculatePrice();
    }

    public String getDescription() {
        return car.getDescription() + "+ Radio ";
    }
}

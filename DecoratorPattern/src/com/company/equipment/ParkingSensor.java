package com.company.equipment;

import com.company.Car;
import com.company.Decorator;

public class ParkingSensor extends Decorator{

    Car car;

    public ParkingSensor(Car car) {
        this.car = car;
    }

    public double calculatePrice() {
        return 1000 + car.calculatePrice();
    }

    public String getDescription() {
        return car.getDescription() + "+ Parking Sensor ";
    }
}

package com.company.equipment;

import com.company.Car;
import com.company.Decorator;

public class Navigation extends Decorator {

    Car car;

    public Navigation(Car car) {
        this.car = car;
    }

    public double calculatePrice() {
        return 6000 + car.calculatePrice();
    }

    public String getDescription() {
        return car.getDescription() + "+ Navigation ";
    }
}

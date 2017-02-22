package com.company;

import com.company.cars.Honda;
import com.company.cars.Nissan;
import com.company.equipment.Navigation;
import com.company.equipment.ParkingSensor;
import com.company.equipment.Radio;

public class DecoratedCars {

    public static void main(String[] args) {

        Car car1 = new Nissan();
        System.out.println(car1.getDescription() + "= " + car1.calculatePrice());

        Car car2 = new Nissan();
        car2 = new Navigation(car2);
        car2 = new Radio(car2);
        System.out.println(car2.getDescription() + "= " + car2.calculatePrice());

        Car car3 = new Honda();
        car3 = new Radio(car3);
        car3 = new ParkingSensor(car3);
        System.out.println(car3.getDescription() + "= " + car3.calculatePrice());
    }
}

package com.pluralsight;

public class Main {

    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        Car fastRide = new Car();
        fastRide.setColor("Blue");
        fastRide.setFuelCapacity(10);

        SemiTruck heavyRide = new SemiTruck();
        slowRide.setColor("Yellow");
        slowRide.setFuelCapacity(20);

        Hovercraft fanRide = new Hovercraft();
        slowRide.setColor("Black");
        slowRide.setFuelCapacity(8);

    }
}

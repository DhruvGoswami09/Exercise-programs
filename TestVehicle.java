import java.util.*;

abstract class Vehicle {
    abstract String fuelType();
    abstract int noOfWheels();
}

class Car extends Vehicle {
    String fuelType() { return "Petrol/Diesel"; }
    int noOfWheels() { return 4; }
}

class Bike extends Vehicle {
    String fuelType() { return "Petrol"; }
    int noOfWheels() { return 2; }
}

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle c = new Car();
        Vehicle b = new Bike();
        System.out.println("Car: " + c.fuelType() + ", " + c.noOfWheels());
        System.out.println("Bike: " + b.fuelType() + ", " + b.noOfWheels());
    }
}

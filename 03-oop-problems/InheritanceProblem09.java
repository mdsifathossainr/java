// Write a Java program to create a vehicle class hierarchy. The base class should be
// Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have
// properties such as make, model, year, and fuel type. Implement methods for calculating
// fuel efficiency, distance traveled, and maximum speed.

class Vehicle {

    String make;
    String model;
    int year;
    String fuelType;

    Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    double distanceTraveled(double speed, double time) {
        return speed * time;
    }

    double fuelEfficiency(double distance, double fuel) {
        return distance / fuel;
    }

    int maximumSpeed() {
        return 0;
    }

    void display(double speed, double time, double fuel) {
        double distance = distanceTraveled(speed, time);
        double efficiency = fuelEfficiency(distance, fuel);

        System.out.println("Make : " + make);
        System.out.println("Model : " + model);
        System.out.println("Year : " + year);
        System.out.println("Fuel Type : " + fuelType);
        System.out.printf("Distance Traveled : %.2f km%n", distance);
        System.out.printf("Fuel Efficiency : %.2f km/l%n", efficiency);
        System.out.println("Maximum Speed : " + maximumSpeed() + " km/h");
    }
}

class Truck extends Vehicle {

    Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    int maximumSpeed() {
        return 120;
    }
}

class Car extends Vehicle {

    Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    int maximumSpeed() {
        return 200;
    }
}

class Motorcycle extends Vehicle {

    Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    int maximumSpeed() {
        return 160;
    }
}

public class InheritanceProblem09 {
    public static void main(String[] args) {

        Car car = new Car("Toyota", "Corolla", 2024, "Petrol");
        car.display(60, 3, 10);

        System.out.println();

        Truck truck = new Truck("Volvo", "FH16", 2024, "Diesel");
        truck.display(50, 4, 40);

        System.out.println();

        Motorcycle motorcycle = new Motorcycle("Yamaha", "R15", 2024, "Petrol");
        motorcycle.display(40, 2, 4);
    }
}
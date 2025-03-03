package pa4;

abstract class Vehicle {
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

    abstract double fuelEfficiency(); // in miles per gallon
    abstract double distanceTraveled(double hours); // in miles
    abstract double maximumSpeed(); // in miles per hour

    @Override
    public String toString() {
        return "Make: " + make + ", Model: " + model + ", Year: " + year + ", Fuel Type: " + fuelType;
    }
}

// Subclass Truck
 class Truck extends Vehicle {
   public Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    double fuelEfficiency() {
        return 15; // example value
    }

    @Override
    double distanceTraveled(double hours) {
        return hours * maximumSpeed();
    }

    @Override
    double maximumSpeed() {
        return 80; // example value
    }
}

// Subclass Car
class Car extends Vehicle {
   public  Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    double fuelEfficiency() {
        return 25; // example value
    }

    @Override
    double distanceTraveled(double hours) {
        return hours * maximumSpeed();
    }

    @Override
    double maximumSpeed() {
        return 120; // example value
    }
}

// Subclass Motorcycle
 class Motorcycle extends Vehicle {
  public  Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    double fuelEfficiency() {
        return 40; // example value
    }

    @Override
    double distanceTraveled(double hours) {
        return hours * maximumSpeed();
    }

    @Override
    double maximumSpeed() {
        return 140; // example value
    }
}


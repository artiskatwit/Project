package pa4;

public class Test_Vehicle {
    public static void main(String[] args) {
        Vehicle truck = new Truck("Ford", "F-150", 2021, "Diesel");
        Vehicle car = new Car("Toyota", "Camry", 2022, "Gasoline");
        Vehicle motorcycle = new Motorcycle("Yamaha", "YZF-R3", 2023, "Gasoline");

        System.out.println(truck);
        System.out.println("Fuel Efficiency: " + truck.fuelEfficiency() + " MPG");
        System.out.println("Distance Traveled in 5 hours: " + truck.distanceTraveled(5) + " miles");
        System.out.println("Maximum Speed: " + truck.maximumSpeed() + " MPH\n");

        System.out.println(car);
        System.out.println("Fuel Efficiency: " + car.fuelEfficiency() + " MPG");
        System.out.println("Distance Traveled in 5 hours: " + car.distanceTraveled(5) + " miles");
        System.out.println("Maximum Speed: " + car.maximumSpeed() + " MPH\n");

        System.out.println(motorcycle);
        System.out.println("Fuel Efficiency: " + motorcycle.fuelEfficiency() + " MPG");
        System.out.println("Distance Traveled in 5 hours: " + motorcycle.distanceTraveled(5) + " miles");
        System.out.println("Maximum Speed: " + motorcycle.maximumSpeed() + " MPH");
    }
}
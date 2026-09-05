package Oops;

class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void showVehicleDetails() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Speed: " + this.speed);
    }
}

class Car extends Vehicle {
    String fuelType;

    Car(String brand, int speed, String fuelType) {
        super(brand, speed);
        this.fuelType = fuelType;
    }

    void showCarDetails() {
        super.showVehicleDetails();
        System.out.println("Fuel type: " + this.fuelType);
    }
}


public class InheritanceDemo {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 200, "Diesel");
        car.showCarDetails();
    }
}

// Parent class
package constructors;

class Vehicle {
    String brand;

    // Parent class constructor
    Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle constructor called: Brand = " + brand);
    }
}

// Child class
class Car extends Vehicle {
    String model;
    int year;

    // Child class constructor with two parameters
    Car(String brand, String model) {
        super(brand); // Calls the constructor of the parent class
        this.model = model;
        System.out.println("Car constructor called: Model = " + model);
    }

    // Child class constructor with three parameters
    Car(String brand, String model, int year) {
        this(brand, model); // Calls another constructor in the same class
        this.year = year;
        System.out.println("Car constructor called: Year = " + year);
    }
}

// Main class
public class ConstructorChainingExample {
    public static void main(String[] args) {
        // Create an object of the Car class using the 3-parameter constructor
        Car car = new Car("Toyota", "Camry", 2022);
    }
}
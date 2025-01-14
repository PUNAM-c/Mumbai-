// Base Class: herirachicalCar
public class herirachicalCar {
	String brand;
    int year;

    // Constructor for Car class
    public herirachicalCar(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method to display car information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

// Derived Class 1: Sedan
class Sedan extends herirachicalCar {
    int trunkCapacity;

    // Constructor for Sedan class
    public Sedan(String brand, int year, int trunkCapacity) {
        super(brand, year); // Call Car constructor
        this.trunkCapacity = trunkCapacity;
    }

    // Method specific to Sedan
    public void displaySedanInfo() {
        displayInfo();
        System.out.println("Trunk Capacity: " + trunkCapacity + " liters");
    }
}

// Derived Class 2: SUV
class SUV extends herirachicalCar {
    boolean hasFourWheelDrive;

    // Constructor for SUV class
    public SUV(String brand, int year, boolean hasFourWheelDrive) {
        super(brand, year); // Call Car constructor
        this.hasFourWheelDrive = hasFourWheelDrive;
    }

    // Method specific to SUV
    public void displaySUVInfo() {
        displayInfo();
        System.out.println("Four-Wheel Drive: " + (hasFourWheelDrive ? "Yes" : "No"));
    }
}

// Main Class
public class HierarchicalInheritance {
    public static void main(String[] args) {
        // Create a Sedan object
        Sedan sedan = new Sedan("Toyota", 2021, 450);
        System.out.println("Sedan Details:");
        sedan.displaySedanInfo();

        System.out.println();

        // Create an SUV object
        SUV suv = new SUV("Ford", 2023, true);
        System.out.println("SUV Details:");
        suv.displaySUVInfo();
    }
}


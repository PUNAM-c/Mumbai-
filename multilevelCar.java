
// Base Class: Car
public class multilevelCar {
    String brand;
    int year;

    // Constructor for Car class
    public multilevelCar(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

  
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

// Derived Class: ElectricCar (inherits Car)
class ElectricCar extends multilevelCar {
    int batteryCapacity;

    // Constructor for ElectricCar
    public ElectricCar(String brand, int year, int batteryCapacity) {
        super(brand, year); // Call Car constructor
        this.batteryCapacity = batteryCapacity;
    }

    // Method to display electric car information
    public void displayElectricCarInfo() {
        displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

// Derived Class: AutonomousElectricCar (inherits ElectricCar)
class AutonomousElectricCar extends ElectricCar {
    boolean selfDrivingEnabled;

    // Constructor for AutonomousElectricCar
    public AutonomousElectricCar(String brand, int year, int batteryCapacity, boolean selfDrivingEnabled) {
        super(brand, year, batteryCapacity); // Call ElectricCar constructor
        this.selfDrivingEnabled = selfDrivingEnabled;
    }

    // Method to display autonomous electric car information
    public void displayAutonomousCarInfo() {
        displayElectricCarInfo();
        System.out.println("Selsf-Driving Enabled: " + (selfDrivingEnabled ? "Yes" : "No"));
    }


// Main Class
    public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        // Create an AutonomousElectricCar object
        AutonomousElectricCar tesla = new AutonomousElectricCar("Tesla", 2023, 100, true);

        System.out.println("Autonomous Electric Car Details:");
        tesla.displayAutonomousCarInfo();
    }
}

import java.util.Scanner;

// Base class Vehicle
class Vehicle {
    private String brand;
    private int speed;
    private String fuelType;

    public Vehicle(String brand, int speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    public void inputDetails(Scanner scanner) {
        System.out.print("Brand: ");
        this.brand = scanner.nextLine();
        System.out.print("Speed: ");
        this.speed = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Fuel Type: ");
        this.fuelType = scanner.nextLine();
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, int speed, String fuelType, int numDoors) {
        super(brand, speed, fuelType);
        this.numDoors = numDoors;
    }

    
    @Override
    public void inputDetails(Scanner scanner) {
        super.inputDetails(scanner); 
        System.out.print("Number of Doors: ");
        this.numDoors = scanner.nextInt();
        scanner.nextLine(); 
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Number of Doors: " + numDoors);
    }
}

class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, int speed, String fuelType, boolean hasSidecar) {
        super(brand, speed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void inputDetails(Scanner scanner) {
        super.inputDetails(scanner); 
        System.out.print("Has Sidecar? (true/false): ");
        this.hasSidecar = scanner.nextBoolean();
        scanner.nextLine(); 
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}

public class TestVehicle {
    public static void main(String[] args) {
        // Create Scanner object for input
        try (Scanner scanner = new Scanner(System.in)) {
            // Create instances of Car and Motorcycle
            Vehicle car = new Car("", 0, "", 0); 
            Vehicle motorcycle = new Motorcycle("", 0, "", false); 

            // Get input for both vehicles
            System.out.println("Enter Car Details:");
            car.inputDetails(scanner);
            System.out.println("\nEnter Motorcycle Details:");
            motorcycle.inputDetails(scanner);

            // Display details for both vehicles
            System.out.println("\nCar Details:");
            car.displayDetails();
            System.out.println("\nMotorcycle Details:");
            motorcycle.displayDetails();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

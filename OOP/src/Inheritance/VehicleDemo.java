package Inheritance;
import java.util.InputMismatchException;
import java.util.Scanner;
abstract class VehicleTypeBase {
    public abstract void drive();
    public abstract void fuelType();
}

class DrivingCar extends VehicleTypeBase {
    @Override
    public void drive() {
        System.out.println("Car is driving smoothly on the road.");
    }
    @Override
    public void fuelType() {
        System.out.println("Car uses petrol or diesel.");
    }
    public void playMusic() {
        System.out.println("Car is playing music.");
    }
}

class MotorBike extends VehicleTypeBase {
    @Override
    public void drive() {
        System.out.println("Bike is zooming through traffic.");
    }
    @Override
    public void fuelType() {
        System.out.println("Bike uses petrol.");
    }
    public void doWheelie() {
        System.out.println("Bike is doing a wheelie!");
    }
}

class CargoTruck extends VehicleTypeBase {
    @Override
    public void drive() {
        System.out.println("Truck is hauling cargo on the highway.");
    }
    @Override
    public void fuelType() {
        System.out.println("Truck uses diesel.");
    }
    public void loadCargo() {
        System.out.println("Truck is loading heavy cargo.");
    }
}

// Main demo class renamed to avoid conflict
public class VehicleDemo {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        VehicleTypeBase vehicleType = null;
        while (true) {
            System.out.println("Select a vehicle:");
            System.out.println("1. Car");
            System.out.println("2. Bike");
            System.out.println("3. Truck");
            System.out.print("Enter your choice (1-3): ");
            try {
                int choice = read.nextInt();

                if (choice == 1) {
                    vehicleType = new DrivingCar();
                    break;
                } else if (choice == 2) {
                    vehicleType = new MotorBike();
                    break;
                } else if (choice == 3) {
                    vehicleType = new CargoTruck();
                    break;
                } else {
                    System.out.println("Invalid choice. Please enter a number from 1 to 3.\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.\n");
                read.nextLine(); // clear invalid input
            }
        }

        System.out.println("\n--- Vehicle Information ---");
        vehicleType.drive();       // Polymorphic call
        vehicleType.fuelType();    // Polymorphic call

        // Downcasting to call class-specific methods
        if (vehicleType instanceof DrivingCar) {
            ((DrivingCar) vehicleType).playMusic();
        } else if (vehicleType instanceof MotorBike) {
            ((MotorBike) vehicleType).doWheelie();
        } else if (vehicleType instanceof CargoTruck) {
            ((CargoTruck) vehicleType).loadCargo();
        }

        read.close();
    }
}

package Inheritance;


abstract class Vehicle {
    protected String vehicleId;
    protected String maker;
    protected String model;

    public Vehicle(String vehicleId,String maker,String model){
        this.vehicleId = vehicleId;
        this.maker = maker;
        this.model = model;
    }

    public abstract double calculateRentalFee(int rentalDays);
}

class Car extends Vehicle{
    private static final double DAILY_RATE = 50.0;

    public Car(String vehicleId,String maker,String model){
        super(vehicleId,maker,model);
    }

    @Override
    public double calculateRentalFee(int rentalDays){
        double total = DAILY_RATE*rentalDays;
        if (rentalDays > 7){
            total = total * 0.9;
        }
        return total;
    }
}

class Bicycle extends Vehicle{
    private static final double DAILY_RATE = 15.0;

    public Bicycle(String vehicleId,String maker,String model){
        super(vehicleId,maker,model);
    }
    @Override
    public double calculateRentalFee(int rentalDays){
        return DAILY_RATE * rentalDays;
    }
}

class Truck extends Vehicle{
    private static final double DAILY_RATE = 80.0;
    private static final double SURCHARGE = 100.0;

    public Truck(String vehicleId, String make, String model) {
        super(vehicleId, make, model);
    }

    @Override
    public double calculateRentalFee(int rentalDays) {
        double total = DAILY_RATE * rentalDays;
        if (rentalDays > 5) {
            total += SURCHARGE;
        }
        return total;
    }

}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle car = new Car("C001", "Toyota", "Camry");
        Vehicle bike = new Bicycle("B001", "Giant", "Escape 3");
        Vehicle truck = new Truck("T001", "Ford", "F-150");

        int rentalDays = 8;

        System.out.println("Car rental fee for " + rentalDays + " days: $" + car.calculateRentalFee(rentalDays));
        System.out.println("Bicycle rental fee for " + rentalDays + " days: $" + bike.calculateRentalFee(rentalDays));
        System.out.println("Truck rental fee for " + rentalDays + " days: $" + truck.calculateRentalFee(rentalDays));
    }
}

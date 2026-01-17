package Inheritance;

abstract class Employee{
    private String name;

    public Employee(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract double calculatePay();
    public abstract void displayEmployeeDetails();
}

class SalariedEmployee extends Employee{
    private double monthlySalary;
    public SalariedEmployee(String name, double monthlySalary){
        super(name);
        this.monthlySalary = monthlySalary;
    }
    @Override
    public double calculatePay(){
        return monthlySalary;
    }
    @Override
    public void displayEmployeeDetails(){
        System.out.println("Salaried Employee: " + getName() + ", Monthly Salary: $" + monthlySalary);
    }
}

class HourlyEmployee extends Employee{
    private double hoursWorked;
    private double hourlyRate;

    public HourlyEmployee(String name, double hoursWorked, double hourlyRate) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePay() {
        double regularHours = Math.min(hoursWorked,40);
        double overtimeHours = Math.max(hoursWorked - 40,0);
        return (regularHours * hourlyRate) + (overtimeHours * hourlyRate * 1.5);
    }
    @Override
    public void displayEmployeeDetails() {
        System.out.println("Hourly Employee: " + getName() + ", Hours Worked: " + hoursWorked + ", Hourly Rate: $" + hourlyRate);
    }
}


public class EmployeePayment {
    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
                new SalariedEmployee("Alice", 5000),
                new HourlyEmployee("Bob", 38, 20),
                new HourlyEmployee("Charlie", 45, 15),
                new SalariedEmployee("Diana", 6000)
        };

        for (Employee emp : employees) {
            emp.displayEmployeeDetails();
            System.out.println("Calculated Pay: $" + emp.calculatePay());
            System.out.println("-------------------------------------");
        }
    }
}

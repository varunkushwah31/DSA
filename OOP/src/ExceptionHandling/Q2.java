package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter the first integer: ");
                int num1 = read.nextInt();

                System.out.print("Enter the second integer: ");
                int num2 = read.nextInt();

                // Check for negative numbers
                if (num1 < 0 || num2 < 0) {
                    throw new NegativeNumberException("Error: Negative numbers are not allowed.");
                }

                // Division by zero check
                if (num2 == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                    continue;  // Ask again
                }

                // Perform division and print formatted result
                double result = (double) num1 / num2;
                System.out.printf("Result: %.2f%n", result);
                break;  // Exit loop after successful division

            } catch (NegativeNumberException nne) {
                System.out.println(nne.getMessage());
            } catch (InputMismatchException ime) {
                System.out.println("Invalid input: Please enter a valid integer.");
                read.nextLine(); // Clear invalid input
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }

        read.close();
    }
}

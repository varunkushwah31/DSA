package ExceptionHandling;
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try {
            double value = Double.parseDouble(input);
            System.out.println(value);
        }catch (NumberFormatException e) {
            System.out.println("Invalid input");
            //You can also use Exception e (in general it will also pass all test cases)
        }
        scanner.close();
        //It is General conventional to close Scanner but I don't Generally Close it
    }
}

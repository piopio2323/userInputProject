import java.util.InputMismatchException;
import java.util.Scanner;

/********* Header *******
 Created by David Houston, on 31/01/2025
 TODO: Project description
 */
public class UserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = getValidInteger(scan, "Please enter your first integer number:");
        int num2 = getValidInteger(scan, "Enter your second integer number:");

        int result = num1 * num2;
        System.out.println("Multiplication Result: " + result);

        // Call addTwoNumbers method
        double sum = addTwoNumbers(num1, num2);
        System.out.println("Addition Result: " + sum);

        // Call squareRootOfANumber method for num1 and num2
        double sqrtNum1 = squareRootOfANumber(num1);
        double sqrtNum2 = squareRootOfANumber(num2);

        System.out.println("Square root of " + num1 + " is: " + sqrtNum1);
        System.out.println("Square root of " + num2 + " is: " + sqrtNum2);

        scan.close(); // Close scanner to prevent resource leaks
    }

    // Method to prompt for a valid integer
    private static int getValidInteger(Scanner scan, String prompt) {
        while (true) {
            System.out.println(prompt);
            try {
                return scan.nextInt(); // Return valid input
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter an integer.");
                scan.next(); // Discard invalid input
            }
        }
    }

    // Method to add two numbers and return the result as double
    private static double addTwoNumbers(int a, int b) {
        return (double) (a + b);
    }

    // Method to calculate and return the square root of a number
    private static double squareRootOfANumber(double s) {
        if (s < 0) {
            System.out.println("Error: Square root of a negative number is not allowed.");
            return -1; // Returning -1 as an indicator of invalid input
        }
        return Math.sqrt(s);
    }
}

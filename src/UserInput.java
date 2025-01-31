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
        System.out.println("Result: " + result);

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
}

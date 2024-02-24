import java.util.Scanner;

public class MaxBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Input the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double maxNumber;

        // Compare the two numbers using if-else statements
        if (num1 > num2) {
            maxNumber = num1;
        } else {
            maxNumber = num2;
        }

        // Display the maximum number
        System.out.println("The maximum number between " + num1 + " and " + num2 + " is: " + maxNumber);

        scanner.close();
    }
}

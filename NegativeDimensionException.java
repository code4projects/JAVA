// Custom exception for negative dimensio
// Custom exception class for negative dimensions
import java.util.Scanner;

// Custom exception for negative dimensions
class NegativeDimensionException extends Exception {
    public NegativeDimensionException(String message) {
        super(message);
    }
}

// Rectangle class
class Rectangle {
    private double length;
    private double breadth;

    // Constructor
    public Rectangle(double length, double breadth) throws NegativeDimensionException {
        if (length < 0 || breadth < 0) {
            throw new NegativeDimensionException("Dimensions cannot be negative");
        }
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * breadth;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        try {
            // Create Scanner object to read input from the console
            Scanner scanner = new Scanner(System.in);

            // Prompt user to enter length and breadth
            System.out.print("Enter length of rectangle: ");
            double length = scanner.nextDouble();

            System.out.print("Enter breadth of rectangle: ");
            double breadth = scanner.nextDouble();

            // Create a rectangle object
            Rectangle rectangle = new Rectangle(length, breadth);

            // Calculate area and perimeter
            double area = rectangle.calculateArea();
            double perimeter = rectangle.calculatePerimeter();

            // Print results
            System.out.println("Area of rectangle: " + area);
            System.out.println("Perimeter of rectangle: " + perimeter);

            // Close scanner
            scanner.close();
        } catch (NegativeDimensionException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

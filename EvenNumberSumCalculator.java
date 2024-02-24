import java.util.ArrayList;

public class EvenNumberSumCalculator {

    public static int sumOfEvenNumbers(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num % 2 == 0) { // Check if the number is even
                sum += num; // Add the even number to the sum
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        // Calculate the sum of even numbers
        int evenSum = sumOfEvenNumbers(numbers);

        // Print the sum of even numbers
        System.out.println("Sum of even numbers: " + evenSum);
    }
}

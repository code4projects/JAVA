// import java.util.Scanner;

// public class CheckNthBit {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input the number
//         System.out.print("Enter a number (num): ");
//         int num = scanner.nextInt();

//         // Input the bit position to check
//         System.out.print("Enter the bit position to check (n): ");
//         int n = scanner.nextInt();

//         // Check if the nth bit is set (1) or not (0)
//         int mask = 1 << n;
//         int result = (num & mask) == 0 ? 0 : 1;

//         // Display the result
//         System.out.println("The " + n + "th bit of " + num + " is set to: " + result);

//         scanner.close();
//     }
// }
import java.util.Scanner;

public class CheckNthBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number (num): ");
        int num = scanner.nextInt();

        // Input the bit position to check
        System.out.print("Enter the bit position to check (n): ");
        int n = scanner.nextInt();

        // Right shift num by n positions and then perform bitwise AND with 1
        int result = (num >> n) & 1;

        // Display the result
        System.out.println("The " + n + "th bit of " + num + " is set to: " + result);

        scanner.close();
    }
}

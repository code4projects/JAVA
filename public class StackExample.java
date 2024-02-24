package Anudip100days;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Declare and initialize a stack
        Stack<Integer> stack = new Stack<>();

        // Store 10 elements into the stack
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }

        // Display the elements of the stack before removing
        System.out.println("Stack elements before removing: " + stack);

        // Remove 4 elements from the stack and display them
        System.out.println("Elements removed from the stack:");
        for (int i = 0; i < 4; i++) {
            System.out.println(stack.pop());
        }

        // Display the elements of the stack after removing
        System.out.println("Stack elements after removing: " + stack);
    }
}

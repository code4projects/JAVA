import java.util.LinkedList;
import java.util.Queue;

public class Queue {
    public static void main(String[] args) {
        // Create a queue to hold the states of India
        Queue<String> stateQueue = new LinkedList<>();

        // Add 10 states of India to the queue
        stateQueue.add("Maharashtra");
        stateQueue.add("Uttar Pradesh");
        stateQueue.add("Bihar");
        stateQueue.add("West Bengal");
        stateQueue.add("Madhya Pradesh");
        stateQueue.add("Tamil Nadu");
        stateQueue.add("Rajasthan");
        stateQueue.add("Karnataka");
        stateQueue.add("Gujarat");
        stateQueue.add("Andhra Pradesh");

        // Print the states in the queue
        System.out.println("States of India in the Queue:");
        while (!stateQueue.isEmpty()) {
            System.out.println(stateQueue.poll());
        }
    }
}

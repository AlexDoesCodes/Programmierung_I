package de.fhdw.prg1.hoh.set.arrays;

import java.util.Arrays; // Import the Arrays class for array manipulation

public class FibonacciInArray {
    public static void main(String[] args) {
        // Prompt the user to enter the desired length of the Fibonacci sequence
        System.out.println("Enter Fibonacci length:");
        
        // Read user input from the console
        String input = System.console().readLine();
        
        // Convert the input string to an integer
        int length = Integer.parseInt(input);

        // Call the fibonacci method with the user-specified length and print the result
        System.out.println(fibonacci(length));
    }

    public static String fibonacci(int l) {
        // Create an array to store the Fibonacci sequence
        int[] Fib = new int[l];

        // Handle the special case when the length is 1
        if (l == 1) {
            Fib[0] = 1; // The first Fibonacci number is 1
        } else {
            // Initialize the first two elements of the Fibonacci sequence
            Fib[0] = 1; // The first Fibonacci number is 1
            Fib[1] = 1; // The second Fibonacci number is also 1

            // Generate the Fibonacci sequence by adding the previous two numbers
            for (int i = 2; i < l; i++) {
                Fib[i] = Fib[i - 1] + Fib[i - 2]; // Each number is the sum of the two preceding ones
            }
        }
        
        // Return the generated Fibonacci sequence as a string
        return Arrays.toString(Fib);
    }
}
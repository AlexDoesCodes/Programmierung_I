package de.fhdw.prg1.hoh.set.arrays;

public class FibonacciInArray {
    public static void main(String[] args) {
        // Prompt the user to enter the length of the Fibonacci sequence
        System.out.println("Enter Fibonacci length:");
        // Read user input from the console
        String input = System.console().readLine();
        // Convert the input string to an integer
        int length = Integer.parseInt(input);

        // Call the fibonacci method with the user-specified length
        fibonacci(length);
    }

    public static void fibonacci(int l) {
        // Create an array to store the Fibonacci sequence
        int[] Fib = new int[l];

        // Handle the special case when the length is 1
        if(l == 1){
            System.out.println("1");
        } else {
            // Initialize the first two elements of the Fibonacci sequence
            Fib[0] = 1;
            Fib[1] = 1;

            // Generate the Fibonacci sequence
            for (int i = 2; i < l; i++) {
                Fib[i] = Fib[i - 1] + Fib[i - 2];
            }

            // Print the Fibonacci sequence
            for (int fibo : Fib) {
                System.out.print(fibo + " ");
            }
        }
    }
}
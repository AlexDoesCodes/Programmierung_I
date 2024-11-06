package de.fhdw.prg1.hoh.set.arrays;


public class FibonacciInArray {
    public static void main(String[] args) {
        System.out.println("Enter Fibonacci length:");
        String input = System.console().readLine();
        int length = Integer.parseInt(input);

        fibonacci(length);
    }

    public static void fibonacci(int l) {
        int[] Fib = new int[l];


        if(l == 1){
            System.out.println("1");
        } else {
            Fib[0] = 1;
            Fib[1] = 1;

            for (int i = 2; i < l; i++) {
                Fib[i] = Fib[i - 1] + Fib[i - 2];
            }

            for (int fibo : Fib) {
                System.out.print(fibo + " ");
            }
        }
    }
}

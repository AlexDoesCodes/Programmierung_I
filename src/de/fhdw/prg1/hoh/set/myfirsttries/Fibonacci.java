package de.fhdw.prg1.hoh.set.myfirsttries;

public class Fibonacci {
    public static void main(String[] args) {
        int i;
        int fib1 = 0;
        int fib2 = 1;

        for(i=1; i<=20; i++){
            System.out.print(fib2 + " ");
            fib2 = fib1 + fib2;
            fib1 = fib2 - fib1;
        }

    }
}

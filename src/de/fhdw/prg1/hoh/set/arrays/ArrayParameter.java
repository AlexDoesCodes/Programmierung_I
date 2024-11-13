package de.fhdw.prg1.hoh.set.arrays;
import java.util.Arrays;

public class ArrayParameter {
    public static void main(String[] args) {
        // Initialize an array of doubles
        double[] array = {1.5, 2.7, 3.2, 4.9, 5.6};

        // Calculate and print the sum of the array elements
        System.out.println("Sum of the array elements: " + sum(array));
    }
    // Method to calculate the sum of all elements in the given array
    public static double sum(double[] arr) {
        double sum = 0.0; // Initialize sum to zero

        // Iterate over each element in the array
        for (double num : arr) {
            sum += num; // Add each element to the sum
        }

        // Return the calculated sum
        return sum;
    }
}
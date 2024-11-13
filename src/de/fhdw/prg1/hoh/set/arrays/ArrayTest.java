package de.fhdw.prg1.hoh.set.arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = {1, 12, 3, 4, 5};
        int e = 12;
        System.out.println(contains(arr, e));
    }

    public static boolean contains(int[] arr, int e) {

        for (int i : arr) {
            if (i == e) {
                System.out.println("Element " + e + " found in array.");
                return true;
            }
        }

        return false;
    }
}

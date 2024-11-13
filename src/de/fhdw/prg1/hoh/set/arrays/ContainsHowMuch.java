package de.fhdw.prg1.hoh.set.arrays;

public class ContainsHowMuch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 12};
        int e = 12;
        System.out.println("Der Wert e kommt " + counter(arr, e) + " mal vor.");
    }

    public static int counter(int[] arr, int e) {
        int count = 0;
        for (int i : arr) {
            if (i == e) {
                count++ ;
            }
        }
        return count;
    }
}

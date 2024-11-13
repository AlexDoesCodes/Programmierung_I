package de.fhdw.prg1.hoh.set.sort;

import java.util.Arrays;

public class miniSort {
    public static void main(String[] args) {
        int[] input = {12,25,14};
        if (input.length == 3){
            System.out.print(miniSort(input));
        } else {
            System.out.print("Das Array ist entweder zu lang oder zu kurz!");
        }


    }
    public static String miniSort(int[] arr) {
        int swap = 0;
        if (arr[0] > arr[1]) {
            swap(arr, 0, 1);
        }
        if (arr[1] > arr[2]) {
            swap(arr, 1, 2);
        }

        if (arr[0] > arr[1]) {
            swap(arr, 0, 1);
        }
        return Arrays.toString(arr);
    }
    public static void swap (int [] arr, int a, int b) {
        int swap = 0;
        swap = arr[a];
        arr[a] = arr[b];
        arr[b] = swap;

    }
}

package de.fhdw.prg1.hoh.set.arrays;

import java.util.Arrays;

public class rotateLeft {
    public static void main(String[] args) {
        long[] array = {12,1231231231,23221};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(rotateArray(array)));
    }

    private static long[] rotateArray(long[] arr) {
        long saveVal = arr[0];
        assert arr.length >= 1;
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = saveVal;
        return arr;
    }
}

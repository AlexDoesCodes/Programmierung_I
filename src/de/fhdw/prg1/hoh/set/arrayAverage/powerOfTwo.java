package de.fhdw.prg1.hoh.set.arrayAverage;

import java.util.Arrays;

public class powerOfTwo {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(powersOfTwo(100)));
    }

    private static int[] powersOfTwo(int i) {
        int[] powers = new int[i];
        powers[0] = 2;
        for (int j = 1; j < i; j++) {
            powers[j] = powers[j-1] * 2;
        }
        return powers;


    }

}

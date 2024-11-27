package de.fhdw.prg1.hoh.set.arrays;

import java.util.Arrays;

public class Mirroring {
    public static void main(String[] args) {
        int[] array = {1};
        int[] arrayCopy = array.clone();
        int[] mirror = new int[array.length];

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("a) " + Arrays.toString(mirror1(array)));
        System.out.println("b) " + Arrays.toString(mirror2(arrayCopy)));
        System.out.println("c) " + Arrays.toString(mirror3(arrayCopy, mirror)));
    }

    static int[] mirror1(int[] array) {
        int lower = 0;
        int upper = array.length - 1;
        int help = 0;

        while (lower <= upper) {
            help = array[lower];
            array[lower] = array[upper];
            array[upper] = help;
            lower++;
            upper--;
        }

        return array;
    }

    static int[] mirror2(int[] array) {
        int[] result = new int[array.length];
        int lower = 0;
        int upper = result.length - 1;
        int help = 0;

        while (lower <= upper) {
            result[lower] = array[upper];
            result[upper] = array[lower];
            lower++;
            upper--;
        }

        return result;
    }

    static int[] mirror3(int[] array, int[] mirror) {

        int lower = 0;
        int upper = mirror.length - 1;
        int help = 0;

        while (lower <= upper) {
            mirror[lower] = array[upper];
            mirror[upper] = array[lower];
            lower++;
            upper--;
        }

        return mirror;
    }
}

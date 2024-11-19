package de.fhdw.prg1.hoh.set.arrays;

import java.util.Arrays;

public class removeElementFromArray {
    public static void main(String[] args) {
        int e = 0;
        int[] intArray = {1,2,0,4,5,6,0,8,9};
        System.out.println(Arrays.toString(removeElement(intArray, e)));
    }

    private static int[] removeElement(int[] intArray, int e) {
        int[] result = new int[arrayLength(intArray, e)];
        boolean isFound = false;

        for (int i = 0; i < result.length; i++) {
            switch ((intArray[i] == e ? 1 : 0) + (isFound ? 2 : 0)) {
                case 0: // intArray[i] != e && isFound == false
                    result[i] = intArray[i];
                    break;
                case 1: // intArray[i] == e && isFound == false
                    result[i] = intArray[i + 1];
                    isFound = true;
                    break;
                case 2: // intArray[i] != e && isFound == true
                    result[i] = intArray[i + 1];
                    break;
                case 3: // intArray[i] == e && isFound == true
                    result[i] = intArray[i + 1];
                    break;
            }
        }
        return result;
    }

    static int arrayLength(int[] intArray, int e) {
        boolean length = false;
        for (int element: intArray) {
            if (e == element) {
                length = true;
            }
        }
        if (length == true) {
            return intArray.length - 1;
        }
        return intArray.length;
    }
}

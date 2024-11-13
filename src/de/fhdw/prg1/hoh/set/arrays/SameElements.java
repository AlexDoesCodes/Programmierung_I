package de.fhdw.prg1.hoh.set.arrays;

import java.util.HashMap;
import java.util.Map;

public class SameElements {

    public static void main(String[] args) {
        int[] array1 = {1, 3, 3, 4, 12, 6};
        int[] array2 = {3, 1, 3, 6, 4, 12};

        System.out.println(haveSameElementsWithSameOccurrences(array1, array2));
    }

    public static boolean haveSameElementsWithSameOccurrences(int[] array1, int[] array2) {
        Map<Integer, Integer> frequencyMap1 = getFrequencyMap(array1);
        Map<Integer, Integer> frequencyMap2 = getFrequencyMap(array2);

        return frequencyMap1.equals(frequencyMap2);
    }

    private static Map<Integer, Integer> getFrequencyMap(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        return frequencyMap;
    }
}

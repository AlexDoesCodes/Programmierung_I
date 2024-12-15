package de.fhdw.prg1.hoh.set.arrayAverage;

public class Average {
    public static void main(String[] args) {
        double[] array = new double[] {5,1,7};
        System.out.print(average(array));
    }

    private static double average(double[] array) {
        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum/array.length;
    }
}

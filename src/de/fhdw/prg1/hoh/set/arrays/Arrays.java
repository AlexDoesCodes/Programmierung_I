package de.fhdw.prg1.hoh.set.arrays;

public class Arrays {
    public static void main(String[] args) {
        String result = "";
        int[] myInts = new int[20];

        for(int i = 0; i < myInts.length; i++){
            myInts[i] = i*2;
        }

        for (int myInt : myInts) {
            result += myInt + " ";
        }
        System.out.println(result);

    }
}

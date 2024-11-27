package de.fhdw.prg1.hoh.set.strings;

public class RepeatString {
    public static void main(String[] args) {
        String inputString = "FH";
        int n = 3;

        System.out.println(repeatString(inputString, n));
    }

    static String repeatString(String inputString, int n) {
        String outputString = "";

        for (int i = 0; i < n; i++) {
            outputString += inputString;
        }

        return outputString;
    }
}

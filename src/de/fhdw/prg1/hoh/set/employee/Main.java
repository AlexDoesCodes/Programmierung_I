package de.fhdw.prg1.hoh.set.employee;

public class Main {
    public static void main(String[] args) {
       String s1 = "123";

       System.out.print(sumOfDigits(s1));
    }

    private static int sumOfDigits(String s1) {
        int sum = 0;
        for(char c : s1.toCharArray()) {
            sum += Character.getNumericValue(c);
        }

        return sum;
    }


}

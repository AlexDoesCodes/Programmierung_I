package de.fhdw.prg1.hoh.set.sec;

public class CalcSum {
    public static void main(String[] args) {
        System.out.println(calcsum(10,9));
    }

    static int calcsum(int a, int b) {
        int sum = 0;

        for (int i = a; i<=b; i++) {
            sum = sum + i;
        }
        return sum;
    }
}

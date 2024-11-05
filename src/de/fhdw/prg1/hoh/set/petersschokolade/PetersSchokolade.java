package de.fhdw.prg1.hoh.set.petersschokolade;

public class PetersSchokolade {

    public static void main(String[] args) {
        int numOfChoc;
        numOfChoc = getNumOfChoc(12,4,2);
        System.out.println(numOfChoc);
    }

    private static int getNumOfChoc(int m, int p, int g) {
        int numOfChoc;
        int numOfCoup;
        numOfChoc = getChocForMoney(m, p);
        numOfCoup = numOfChoc;
        numOfChoc += getChocForCoupons(numOfCoup, g);

        return numOfChoc;
    }

    private static int getChocForMoney(int m, int p) {
        return m/p;
    }

    private static int getChocForCoupons(int numOfCoup, int g) {
        int numOfChoc = 0;
        int numOfChocForCoup = 0;

        while(numOfCoup >= g) {
            numOfChocForCoup = swapCoup(numOfCoup, g);
            numOfCoup = getRemain(numOfCoup, g);
            numOfCoup += numOfChocForCoup;
            numOfChoc += numOfChocForCoup;
        }

        return numOfChoc;
    }

    private static int getRemain(int numOfCoup, int g) {
        return numOfCoup%g;
    }

    private static int swapCoup(int numOfCoup, int g) {

        return numOfCoup/g;
    }


}
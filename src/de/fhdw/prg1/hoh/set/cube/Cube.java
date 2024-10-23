package de.fhdw.prg1.hoh.set.cube;

public class Cube {
    public static void main(String[] args) {
        drawCube(10);
    }

    private static void drawCube(int b) {
        System.out.println(fullLine(b));
        if (b != 1) {
            cubeHeight(b);
        }
    }

    private static String fullLine(int f) {
        String line = "";
        for (int i = 0; i < f; i++) {
            line += "*";
        }
        return line;
    }

    public static void cubeHeight(int s){
        for(int i = 1; i <= s-2; i++){
            System.out.println(cubeWidth(s));
        }
        System.out.println(fullLine(s));

    }


    private static String cubeWidth(int w){
        String line = "";

        line += "*";
        line += numberOfBlanks(w);
        line += "*";

        return line;
    }

    private static String numberOfBlanks(int numB) {
        String blanks = "";
        for (int i = 1; i <= numB-2; i++) {
            blanks += " ";
        }
        return blanks;
    }


}

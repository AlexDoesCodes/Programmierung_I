package de.fhdw.prg1.hoh.set.cube;

public class Cube {
    public static void main(String[] args) {
        drawCube(10); //Quadrat Größe
    }

    private static void drawCube(int b) {
        System.out.println(fullLine(b)); //Erste volle Reihe
        if (b != 1) {
            cubeHeight(b); //Quadrathöhe Methodik
        }
    }

    private static String fullLine(int f) { //Obere und untere volle Linie
        String line = "";
        for (int i = 0; i < f; i++) {
            line += "*";
        }
        return line;
    }

    public static void cubeHeight(int s){
        for(int i = 1; i <= s-2; i++){ //-2 um obere und untere Reihe ab zu ziehen
            System.out.println(cubeWidth(s));
        }
        System.out.println(fullLine(s));// untere volle Linie (aber nur wenn != 1

    }


    private static String cubeWidth(int w){ //Würfelbreite
        String line = "";

        line += "*";
        line += numberOfBlanks(w);
        line += "*";

        return line;
    }

    private static String numberOfBlanks(int numB) { //Leerzeichen zwischen den Sternen
        String blanks = "";
        for (int i = 1; i <= numB-2; i++) {
            blanks += " ";
        }
        return blanks;
    }


}

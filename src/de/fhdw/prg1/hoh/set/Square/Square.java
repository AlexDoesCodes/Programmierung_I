package de.fhdw.prg1.hoh.set.Square;

public class Square {
    public static void main(String[] args) {
        System.out.println("Enter square size:");
        String input = System.console().readLine();
        int size = Integer.valueOf(input);
        drawSquare(size); //Quadrat Größe
    }

    private static void drawSquare(int b) {
        System.out.println(fullLine(b)); //Erste volle Reihe
        if (b != 1) {
            squareHeight(b); //Quadrathöhe Methodik
        }
    }

    private static String fullLine(int f) { //Obere und untere volle Linie
        String line = "";
        for (int i = 0; i < f; i++) {
            line += "*";
        }
        return line;
    }

    public static void squareHeight(int s){
        for(int i = 1; i <= s-2; i++){ //-2 um obere und untere Reihe ab zu ziehen
            System.out.println(squareWidth(s));
        }
        System.out.println(fullLine(s));// untere volle Linie (aber nur wenn != 1

    }


    private static String squareWidth(int w){ //Würfelbreite
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

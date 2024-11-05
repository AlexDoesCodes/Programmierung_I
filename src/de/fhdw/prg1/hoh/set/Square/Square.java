package de.fhdw.prg1.hoh.set.Square;

public class Square {
    public static void main(String[] args) {

        System.out.println("Enter square size:");
        String input = System.console().readLine();
        int size = Integer.parseInt(input);

        drawSquare(size); //Quadrat Größe
    }

    private static void drawSquare(int b) {
        System.out.println(fullLine(b)); //Erste volle Reihe
        squareHeight(b); //Quadrathöhe Methodik
        if (b != 1) {
            System.out.println(fullLine(b));// untere volle Linie (aber nur wenn != 1
        }
    }

    private static String fullLine(int f) { //Obere und untere volle Linie
        String line = "";
        for (int i = 1; i <= f; i++) {
            line += "*";
        }
        return line;
    }

    private static void squareHeight(int s){
        for(int i = 1; i <= s-2; i++){ //-2 um obere und untere Reihe ab zu ziehen
            System.out.println(squareWidth(s));
        }
    }


    private static String squareWidth(int w){ //Würfelbreite
        String line = "";

        line += "*";
        for (int i = 1; i <= w-2; i++) {
            line += " ";
        }
        line += "*";
        return line;
    }
}

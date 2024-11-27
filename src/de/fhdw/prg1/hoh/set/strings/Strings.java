package de.fhdw.prg1.hoh.set.strings;

public class Strings {
    public static void main(String[] args) {
        String s = "pizza ist lecker";
        String[] a = {"a","s","d","f","g","h","j","k","l", "pizza ist lecker"};

        System.out.println(contains(s,a));
    }

    static boolean contains(String str, String[] sub) {

        str = str.toLowerCase();

        for (String e: sub){
            if (str.contains(e)){
                return true;
            }
        }
        return false;
    }
}

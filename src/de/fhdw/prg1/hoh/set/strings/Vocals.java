package de.fhdw.prg1.hoh.set.strings;

public class Vocals {
    public static void main(String[] args) {
        String s = "Hallo Welt!";
        char[] vocals = {'a','e','i','o','u'};

        System.out.println(countVocals(s, vocals));
    }
    static int countVocals(String s, char[] vocals) {
        s = s.toLowerCase();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (char vocal : vocals) {
                if (s.charAt(i) == vocal) {
                    count++;
                }
            }
        }
        return count;
    }
}

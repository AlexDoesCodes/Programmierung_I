package de.fhdw.prg1.hoh.set.myfirsttries;

import org.w3c.dom.ls.LSOutput;

public class switchAnweisung {
    public static void main(String[] args) {
        char v = 'a';
        int z = 23;
        String s = "abc";

        System.out.println("The char is:");

        switch (v){
            case 'a':
                System.out.println('a');
                break;
            case 'b':
                System.out.println('b');
                break;
            case 'c':
                System.out.println('c');
                break;
            default:

        }

        System.out.println("The number is:");

        switch (z){
            case 23:
                System.out.println("23");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
        }

        System.out.println("the String is:");

        switch (s){
            case "abc":
                System.out.println("abc");
                break;
            case "xyz":
                System.out.println("xyz");
                break;
            case "LeckEierDuHund":
                System.out.println("LeckEierDuHund");
                break;
            default:
                System.out.println("nichts");
        }



    }



}

package de.fhdw.prg1.hoh.set.lists;

public class TestList {

    public static void main(String[] args) {
        //List l;

        Stack s = new Stack();

        s.push(1);
        s.push(4);
        s.push(3);
        s.push(5);
        s.push(-6);
        s.push(-7);

        System.out.println(s.toString());
        System.out.println(s.checkNegative());
        System.out.println(s.toString());

    }
}

package de.fhdw.prg1.hoh.set.lists;

public class TestList {

    public static void main(String[] args) {
        //List l = new List();
        //Stack s = new Stack();

        Queue q = new Queue();

        q.append(1);
        q.append(2);
        q.append(3);
        q.append(4);
        q.append(5);
        System.out.println(q.isEmpty());
        System.out.println(q.toString());
        System.out.println(q.pop());
        System.out.println(q.toString());
        System.out.println(q.pop());
        System.out.println(q.toString());
        q.append(6);
        System.out.println(q);
    }
}

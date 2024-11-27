package de.fhdw.prg1.hoh.set.listsTry;

public class DemoListNodes {

    public static void main(String[] args) {
        String out = "";
        de.fhdw.prg1.hoh.set.listsTry.ListNode n1;
        de.fhdw.prg1.hoh.set.listsTry.ListNode n2;
        de.fhdw.prg1.hoh.set.listsTry.ListNode n3;
        de.fhdw.prg1.hoh.set.listsTry.ListNode n4;
        de.fhdw.prg1.hoh.set.listsTry.ListNode n5;
        de.fhdw.prg1.hoh.set.listsTry.List size;
        de.fhdw.prg1.hoh.set.listsTry.ListNode startNode;
        de.fhdw.prg1.hoh.set.listsTry.ListNode val;


        n1 = new de.fhdw.prg1.hoh.set.listsTry.ListNode();
        n1.setVal(3);

        n2 = new de.fhdw.prg1.hoh.set.listsTry.ListNode();
        n2.setVal(8);

        n1.setNext(n2);

        n3 = new ListNode();
        n3.setVal(6);
        n2.setNext(n3);



        n4 = new de.fhdw.prg1.hoh.set.listsTry.ListNode();
        n4.setVal(15);
        n3.setNext(n4);

        n5 = new de.fhdw.prg1.hoh.set.listsTry.ListNode();
        n5.setVal(99);
        n4.setNext(n5);
        n5.setNext(null);



        startNode = n1;

        out = printList(startNode).toString();
        System.out.println("Your List is: " + out);
    }

    private static StringBuilder printList(ListNode startNode) {
        StringBuilder result = new StringBuilder();
        ListNode currentNode = startNode;
        int i = 0;

        while (currentNode != null) {
            result.append(currentNode.getVal(i)).append(" ");
            currentNode = currentNode.getNext();
            i++;
        }

        return result;
    }
}

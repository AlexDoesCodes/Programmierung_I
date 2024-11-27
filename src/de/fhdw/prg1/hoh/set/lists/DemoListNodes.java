package de.fhdw.prg1.hoh.set.lists;

public class DemoListNodes {

    public static void main(String[] args) {
        ListNode n1;
        ListNode n2;
        ListNode n3;
        ListNode startNode;

        n1 = new ListNode();
        n1.setContent(3);

        n2 = new ListNode();
        n2.setContent(8);

        n1.setSuccessor(n2);

        n3 = new ListNode();
        n3.setContent(6);
        n2.setSuccessor(n3);

        n3.setSuccessor(null);
        startNode = n1;
    }
}

package de.fhdw.prg1.hoh.set.listsTry;

public class ListNode {
    ListNode next;
    int val;

    void setNext(ListNode next) {
        this.next = next;
    }

    void setVal(int val) {
        this.val = val;
    }

    ListNode getNext() {
        return next;
    }

    int getVal(int i) {
        return val;
    }

}

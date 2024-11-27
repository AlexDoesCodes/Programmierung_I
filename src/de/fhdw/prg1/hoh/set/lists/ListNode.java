package de.fhdw.prg1.hoh.set.lists;

public class ListNode {

    int mContent;
    ListNode mSuccessor;

    public void setSuccessor(ListNode successor) {
        mSuccessor = successor;
    }

    public void setContent(int content) {
        mContent = content;
    }

    ListNode getSuccessor() {
        return mSuccessor;
    }

    int getContent() {
        return mContent;
    }

}

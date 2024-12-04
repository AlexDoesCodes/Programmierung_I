package de.fhdw.prg1.hoh.set.listsTry;

public class List {

    ListNode mHead;
    int mSize;

    List() {
        clear();
    }

    void clear() {
        mHead = null;
        mSize = 0;
    }



    ListNode getNode(int index) {
        ListNode result;
        result = mHead;
        if (index <= 0 || index >= mSize) {

            while (index > 0) {
                result = result.getNext();
                index--;
            }
        }
        return result;
    }

    int size() { //== getSize
        return mSize;
    }

    void setNode(int index) {
        ListNode newNode;
        ListNode oldNode;

        if (index <= 0 || index >= mSize) {
            newNode = new ListNode();

            if (index == 0) {
                newNode.setNext(mHead);
                mHead = newNode;
            } else {
                oldNode = getNode(index - 1);
                newNode.setNext(oldNode.getNext());
                oldNode.setNext(newNode);

            }
        }
        mSize++;
    }


}

package de.fhdw.prg1.hoh.set.lists;

public class List {

    ListNode mStartNode;
    int mSize;

    List() {
        clear();
    }

    void clear() {
        mStartNode = null;
        mSize = 0;
    }

    int size() {
        return mSize;
    }

    ListNode getNode(int position) {
        ListNode result;

        assert 0 <= position && position < size();

        result = mStartNode;
        while (position>0) {
            result = result.getSuccessor();
            position--;     // position = position - 1;
        }
        return result;
    }

    void insert(int position, int newValue) {
        ListNode newNode;
        ListNode predecessor;

        assert 0<=position && position<=size();

        newNode = new ListNode();
        newNode.setContent(newValue);
        if (position==0) {
            newNode.setSuccessor(mStartNode);
            mStartNode = newNode;
        }
        else {     // position >= 1
            predecessor = getNode(position-1);
            newNode.setSuccessor(predecessor.getSuccessor());
            predecessor.setSuccessor(newNode);
        }
        mSize++;  // setSize(size()+1)
    }

}

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

    int get(int position) {
        return getNode(position).getContent();
    }

    int getFirst() {
        return getNode(0).getContent();
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

    void remove(int position) {
        ListNode predecessor;

        if (position==0) {
            mStartNode = getNode(0).getSuccessor();
        } else {
            predecessor = getNode(position-1);
            predecessor.setSuccessor(getNode(position).getSuccessor());
        }
        mSize--;
    }

    public String toString() {
        String result;

        result = "";
        for (int i=0; i<mSize; i++) {
            result += get(i) + " ";
        }
        return result;
    }

}
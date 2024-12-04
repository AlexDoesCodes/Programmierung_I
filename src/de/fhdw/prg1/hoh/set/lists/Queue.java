package de.fhdw.prg1.hoh.set.lists;

public class Queue {
    List mList;

    Queue () {
        mList = new List();
    }

    boolean isEmpty () {
        return mList.size() == 0;
    }

    int first() {
        return mList.getFirst();
    }

    void append(int newValue) {
        mList.insert(mList.size(), newValue);
    }

    int pop() {
        int help = mList.getFirst();
        mList.remove(0);
        return help;
    }

    public String toString() {
        String result;
        int size = mList.size();

        result = "";
        for (int i = 0; i < size; i++) {
            result = result + mList.get(i) + " ";
        }
        return result;
    }

}

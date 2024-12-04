package de.fhdw.prg1.hoh.set.lists;

public class Stack {
    List mList;

    Stack () {
        mList = new List();
    }

    boolean isEmpty () {
        return mList.size() == 0;
    }

    int top() {
        return mList.get(mList.size()-1);
    }

    int pop () {
        int top = top();
        mList.remove(mList.size()-1);
        return top;
    }

    void push (int newValue) {
        mList.insert(mList.size(), newValue);
    }

    public String toString() {
        String result;
        int size = mList.size();

        result = "";
        for (int i = size - 1; i >= 0; i--) {
            result = result + mList.get(i) + " ";
        }
        return result;
    }

    boolean checkNegative () {
        int numNeg = 0;
        int numPos = 0;

        for (int i = 0; i < mList.size(); i++) {
            if (mList.get(i) < 0) {
                numNeg++;
            } else if (mList.get(i) > 0) {
                numPos++;
            }
        }

        return numPos >= numNeg;
    }
}

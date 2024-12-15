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

        System.out.println(sumOfElements(q));
    }
    static int sumOfElements(Queue q){
        Queue newQ;
        newQ = q;
        int sum = 0;
        while(newQ.size() > 0){
            sum += newQ.pop();
        }
        return sum;
    }
}

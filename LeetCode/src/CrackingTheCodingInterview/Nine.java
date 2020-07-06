package CrackingTheCodingInterview;

import java.util.LinkedList;

public class Nine {
    LinkedList<Integer> a ;
    LinkedList<Integer> b ;
    public Nine() {
       a = new LinkedList<>();
      b = new LinkedList<>();
    }

    public void appendTail(int value) {
        a.add(value);
    }

    public int deleteHead() {
        if(!b.isEmpty())
        {
            return b.removeLast();
        }
        if(a.isEmpty())
        {
            return -1;
        }
        while (!a.isEmpty())
        {
            b.addLast(a.removeLast());
        }
        return b.removeLast();
    }
}

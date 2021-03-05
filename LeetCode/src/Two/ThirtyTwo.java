package Two;

import java.util.Deque;
import java.util.LinkedList;

public class ThirtyTwo {
    Deque<Integer> a ;
    Deque<Integer> b ;
    public ThirtyTwo() {
        a= new LinkedList<>();
        b=new LinkedList<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        a.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
    if (!b.isEmpty())
    {
        return b.pop();
    }else
    {
        while (!a.isEmpty())
        {
            Integer pop = a.pop();
            b.push(pop);
        }
    }
    return b.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (!b.isEmpty())
        {
            return b.peek();
        }else
        { while (!a.isEmpty())
        {
            Integer pop = a.pop();
            b.push(pop);
        }
        }
        return b.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return a.isEmpty()&&b.isEmpty();
    }
}

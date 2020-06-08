package One;

import java.util.Stack;

public class LeFiftyFive {
    int Length;
    int Top;

    Stack a = new Stack();
    Stack b = new Stack();

    /**
     * initialize your data structure here.
     */
    public LeFiftyFive() {

    }

    public void push(int x) {
        if (a.isEmpty()) {
            b.push(x);

        } else {
            if (x <= this.getMin()) {
                b.push(x);
            }
        }
        a.push(x);
    }

    public void pop() {
        int m = Integer.parseInt(a.peek().toString());
        a.pop();
        if (m == Integer.parseInt(b.peek().toString())) {
            b.pop();
        }
    }

    public int top() {
        return Integer.parseInt(a.peek().toString());
    }

    public int getMin() {
        if (!b.isEmpty()) {
            return Integer.parseInt(b.peek().toString());
        }
        return 0;
    }

    public static void main(String[] args) {
        LeFiftyFive a = new LeFiftyFive();
        a.push(0);
        a.push(1);
        a.push(0);
        a.getMin();
        a.pop();
        a.top();
        a.getMin();
    }
}

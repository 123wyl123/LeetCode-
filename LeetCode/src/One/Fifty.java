package One;

import java.util.Deque;
import java.util.LinkedList;

public class Fifty {
    public int evalRPN(String[] tokens) {
        Deque<String> a = new LinkedList<>();
        for (int i = 0; i <tokens.length ; i++) {
            if (tokens[i].equals("+"))
            {
                String pop = a.pop();
                String pop1 = a.pop();
                long temp = Long.parseLong(pop)+Long.parseLong(pop1);
                a.push(temp+"");
            }else if (tokens[i].equals("-"))
            {
                String pop = a.pop();
                String pop1 = a.pop();
                long temp = Long.parseLong(pop1)-Long.parseLong(pop);
                a.push(temp+"");
            }else if (tokens[i].equals("*"))
            {
                String pop = a.pop();
                String pop1 = a.pop();
                long temp = Long.parseLong(pop1)*Long.parseLong(pop);
                a.push(temp+"");
            }else if (tokens[i].equals("/"))
            {
                String pop = a.pop();
                String pop1 = a.pop();
                long temp = Long.parseLong(pop1)/Long.parseLong(pop);
                a.push(temp+"");
            }else
            {
                a.push(tokens[i]);
            }
        }
        return (int) Long.parseLong(a.peek());
    }
}

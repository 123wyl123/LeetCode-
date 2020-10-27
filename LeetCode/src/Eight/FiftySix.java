package Eight;

import java.util.Deque;
import java.util.LinkedList;

public class FiftySix {
    public int scoreOfParentheses(String S) {
        Deque<String> a = new LinkedList<>();
        char[] chars = S.toCharArray();
        if (chars.length==0)
        {return 0;
        }
        for (int i = 0; i <chars.length ; i++) {
            if (chars[i]=='(')
            {
              a.push(chars[i]+"");
            }else if (chars[i]==')')
            {
                if (!a.isEmpty())
                {   if (a.peek().equals("("))
                {
                    a.pop();
                    a.push("1");
                }else
                {    int b = 0;
                    while (!a.isEmpty()&&!(a.peek().equals("(")))
                    {
                        String pop = a.pop();
                        b+=Integer.parseInt(pop);
                    }
                    if (!a.isEmpty())
                    {
                        a.pop();
                        a.push(b*2+"");
                    }
                }

                }else
                {
                    a.push(chars[i]+"");
                }
            }
        }
        if (a.size()!=1)
        {   int b =0;
            while (!a.isEmpty())
            {
                b+=Integer.parseInt(a.pop());
            }
            return b;
        }
        return Integer.parseInt(a.peek());
    }

    public static void main(String[] args) {
        new FiftySix().scoreOfParentheses("()()");
    }
}

package Ten;

import java.util.Deque;
import java.util.LinkedList;

public class TwentyOne {
    public String removeOuterParentheses(String S) {
        Deque<Character> a = new LinkedList<>();
        int l=0,m=0;
        for (int i = 0; i < S.length()-1 ; i++) {
            if(i==0)
            {
                continue;
            }
            else
            {
                if(S.charAt(i)=='(')
                {
                    a.push(S.charAt(i));
                    l++;
                }else
                {
                    if(m>l)
                    {   i++;
                        continue;
                    }
                    a.push(S.charAt(i));
                    m++;
                }
            }
        }
        StringBuffer stringBuffer=new StringBuffer();
        while (!a.isEmpty())
        {
            Character pop = a.pop();
            stringBuffer.append(pop);
        }
        return stringBuffer.reverse().toString();
    }
}

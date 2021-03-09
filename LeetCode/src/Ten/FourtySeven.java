package Ten;

import java.util.Deque;
import java.util.LinkedList;

public class FourtySeven {
    public String removeDuplicates(String S) {
        Deque<Character> a = new LinkedList<Character>();
        char[] b = S.toCharArray();
        int i =0;
        while(i<b.length)
        {
            if(a.isEmpty())
            {
                a.push(b[i]);
                i++;
            }else
            {
                if(b[i]==a.peek())
                {
                    a.pop();
                    i++;
                }else{
                    a.push(b[i]);
                    i++;
                }
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        while(!a.isEmpty())
        {
            stringBuffer.append(a.pop());
        }
        return  stringBuffer.reverse().toString();
    }

    public static void main(String[] args) {
        new FourtySeven().removeDuplicates("abbaca");
    }
}

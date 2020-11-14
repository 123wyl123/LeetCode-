package Three;

import java.util.Deque;
import java.util.LinkedList;

public class NinetyFour {
    public String decodeString(String s) {
        char[] chars = s.toCharArray();
        Deque<String > a = new LinkedList<>();
        int i=0;
        while (i<s.length())
        {
            if (chars[i]==']')
            {
                StringBuffer stringBuffer = new StringBuffer();
                while (!a.isEmpty()&&!a.peek().equals("["))
            {
                String pop = a.pop();
                stringBuffer.append(pop);
            }
                a.pop();
                String pop = a.pop();

                String aa  = stringBuffer.toString();

                for (int j = 0; j <Integer.valueOf(pop)-1 ; j++) {
                    stringBuffer.append(aa);
                }
                a.push(stringBuffer.toString());
            }else   if ('0'<chars[i]&&chars[i]<'9')
            {
                StringBuffer stringBuffer = new StringBuffer();
                while ('0'<=chars[i]&&chars[i]<'9')
                {
                    stringBuffer.append(chars[i]);
                    i++;
                }
                i--;
                a.push(stringBuffer.toString());
            }else
            {
                a.push(chars[i]+"");
            }
            i++;
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (!a.isEmpty())
        {
            stringBuffer.append(a.pop());
        }
    return     stringBuffer.reverse().toString();
    }

    public static void main(String[] args) {
        new NinetyFour().decodeString("100[leetcode]");
    }

}

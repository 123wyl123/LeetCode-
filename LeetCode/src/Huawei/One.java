package Huawei;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class One {
    public static void main(String[] args)throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        Deque<Character> deque = new LinkedList<>();
        deque.push('/');
        char[] chars = string.toCharArray();
            int i=0;
         while (i<chars.length)
         {
            if (chars[i]=='/')
            {
                if (deque.size()!=0&&deque.peek()=='/')
                {

                }else
                {
                    deque.push('/');
                }
            }else if (chars[i]=='.')
            {
                if (i+1<chars.length&&chars[i+1]=='.'&&i+2<chars.length&&chars[i+2]=='.')
                {  deque.push('.');
                    deque.push('.');
                    deque.push('.');
                    i+=3;
                    while (i<chars.length)
                    {
                        if (chars[i]!='/')
                        {
                            deque.push(chars[i]);
                            i++;
                        }else
                        {   i--;
                            break;
                        }
                    }

                }else if (i+1<chars.length&&chars[i+1]=='/')
                {   i++;

                }else if (i+1<chars.length&&chars[i+1]=='.')
                {
                    if (deque.size()>2)
                    {
                        deque.pop();
                        deque.pop();
                    }
                }
            }else
            {
                deque.push(chars[i]);
            }
            i++;
        }
        if (deque.peek()=='/'&&deque.size()>1)
        {
            deque.pop();
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (deque.size()!=0)
        {
            Character pop = deque.pop();
            stringBuffer.append(pop);
        }
        System.out.println(stringBuffer.reverse().toString());
    }
}

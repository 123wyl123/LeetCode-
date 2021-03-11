package Two;

import java.util.Deque;
import java.util.LinkedList;

public class TwentyFour {
    public int calculate(String s) {

        char[] chars = s.toCharArray();
        Deque<String> a = new LinkedList<>();
        Deque<String >b = new LinkedList<>();
        int i=0;
            while (i<chars.length)
            {
                if (chars[i]=='-')
                {
                    if (a.size()==0||a.peek().equals("("))
                    {
                        int j;
                        StringBuffer stringBuffer = new StringBuffer("-");
                        for (j = i+1; j <chars.length ; j++) {
                            if (chars[j]>='0'&&chars[j]<='9')
                            {
                                stringBuffer.append(chars[j]);
                            }else if (chars[j]==' ')
                            {
                                continue;
                            }else
                            {
                                break;
                            }
                        }
                        i=j;
                        a.push(stringBuffer.toString());
                    }else
                    {
                        a.push("-");
                        i++;
                    }
                }else if (chars[i]=='+')
                {
                    if (a.size()==0||a.peek().equals("("))
                    {
                        int j;
                        StringBuffer stringBuffer = new StringBuffer("+");
                        for (j = i+1; j <chars.length ; j++) {
                            if (chars[j]>='0'&&chars[j]<='9')
                            {
                                stringBuffer.append(chars[j]);
                            }else if (chars[j]==' ')
                            {
                                continue;
                            }else
                            {
                                break;
                            }
                        }
                        i=j;
                        a.push(stringBuffer.toString());
                    }else
                    {
                        a.push("+");
                        i++;
                    }
                }else if (chars[i]=='(')
                {
                a.push("(");
                i++;
                }else if (chars[i]==')')
                {
                    i++;
                while (!a.isEmpty()&&!a.peek().equals("("))
                {
                    b.push(a.pop());
                }
                a.pop();
                if (b.size()==1)
                {
                    a.push(b.pop());
                    continue;
                }
                while (b.size()>1)
                {   long temp=0;
                    String pop = b.pop();
                    String pop1 = b.pop();
                    String pop2 = b.pop();
                    if (pop1.equals("-"))
                    {
                        temp+=Long.parseLong(pop)-Long.parseLong(pop2);
                    }else
                    {
                        temp+=Long.parseLong(pop)+Long.parseLong(pop2);
                    }
                    b.push(temp+"");
                }
                a.push(b.pop());
                }else
                {   int j;
                    StringBuffer stringBuffer = new StringBuffer();
                    for (j = i; j <chars.length ; j++) {
                        if (chars[j]>='0'&&chars[j]<='9')
                        {
                            stringBuffer.append(chars[j]);
                        }else if (chars[j]==' ')
                        {
                            continue;
                        }else
                        {
                            break;
                        }
                    }
                    i=j;
                    if (stringBuffer.length()==0)
                    {
                        continue;
                    }
                    a.push(stringBuffer.toString());
                }
            }
        while (a.size()>2)
        {   long temp=0;
            String pop = a.removeLast();
            String pop1 = a.removeLast();
            String pop2 = a.removeLast();
            if (pop1.equals("-"))
            {
                temp+=Long.parseLong(pop)-Long.parseLong(pop2);
            }else
            {
                temp+=Long.parseLong(pop)+Long.parseLong(pop2);
            }
            a.addLast(temp+"");
        }
        if (a.size()==2)
        {
            return -(int)Long.parseLong(a.peek());
        }else
        {
            return (int)Long.parseLong(a.peek());
        }
        }
    }


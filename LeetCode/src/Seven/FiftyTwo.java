package Seven;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;

public class FiftyTwo {

    public int openLock(String[] deadends, String target) {
        HashSet<String> stringBuffers = new HashSet<>();
        for (String deadend : deadends) {
            stringBuffers.add(deadend);
        }
        if(stringBuffers.contains("0000"))
        {
            return -1;
        }
        if(target.equals("0000"))
        {
            return 0;
        }
        Deque< String> characters = new LinkedList<>();
        StringBuffer stringBuffer1 = new StringBuffer();
        String ss ="0000";
        characters.addLast(ss);
        stringBuffers.add(ss);
        int temp =0;
        while (!characters.isEmpty())
        {
            temp++;

            int size = characters.size();
            for (int i = 0; i <size ; i++) {
                String s1 = characters.removeFirst();
                char[] chars = s1.toCharArray();
                for (int j = 0; j <4 ; j++) {
                    char aChar = chars[j];
                    chars[j]=aChar=='9'?'0':(char)(aChar+1);
                    String s = new String(chars);
                    if (stringBuffers.contains(s))
                    {

                    }else
                    {       if (target.equals(s))
                    {
                        return temp;
                    }

                        stringBuffers.add(s);
                        characters.addLast(s);
                    }


                    chars[j]=aChar=='0'?'9':(char)(aChar-1);
                    String sss = new String(chars);
                    if (stringBuffers.contains(sss))
                    {

                    }else
                    {   if (target.equals(sss))
                    {
                        return temp;
                    }
                        stringBuffers.add(sss);
                        characters.addLast(sss);
                    }
                    chars[j]=aChar;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
       String a[]= {"0201","0101","0102","1212","2002"};
        System.out.println(new FiftyTwo().openLock(a, "0202"));
    }
}

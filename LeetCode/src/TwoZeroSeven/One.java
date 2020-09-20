package TwoZeroSeven;

import java.util.Deque;
import java.util.LinkedList;

public class One {
    public String reorderSpaces(String text) {
            int x = 0;
            int kongge =0;
            Deque<String> strings = new LinkedList<>();
        String  a = "";
        for (int i = 0; i <text.length() ; i++) {
        if (text.charAt(i)==' ')
        {   if (a.length()!=0)
        {
            strings.add(a);
            a="";
        }
            kongge++;
        }else
        {
            a+=text.charAt(i);
        }
        }
        if (a.length()!=0)
        {
            strings.add(a);
        }
        if (kongge==0)
        {
            return text;
        }
        a="";
        int temp = 0;
        if (strings.size()-1>=1)
        {
            int aa=   kongge/(strings.size()-1);
            temp = kongge%(strings.size()-1);
            while (!strings.isEmpty())
            {

                a+=strings.removeFirst();
                if (!strings.isEmpty())
                {
                    for (int i = 0; i <aa ; i++) {
                        a+=" ";
                    }
                }

            }

        }else
        {
            a+=strings.removeFirst();
            for (int i = 0; i <kongge ; i++) {
                a+=" ";
            }
            return a;
        }
        for (int i = 0; i <temp ; i++) {
            a+=" ";
        }
        return a;
    }

    public static void main(String[] args) {
        new One().reorderSpaces("  hello");
    }
}


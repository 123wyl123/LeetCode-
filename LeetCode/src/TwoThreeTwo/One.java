package TwoThreeTwo;

import java.util.LinkedList;

public class One {
    public boolean areAlmostEqual(String s1, String s2) {
        char[] chars = s1.toCharArray();
        char[] chars1 = s2.toCharArray();
        if (chars.length!=chars1.length)
        {
            return false;
        }
        LinkedList<Integer> integers = new LinkedList<>();
        for (int i = 0; i <chars.length ; i++) {
            if (chars[i]!=chars1[i])
            {
                integers.add(i);
            }
        }
        if (integers.size()>2)
        {
            return false;
        }else if (integers.size()==2)
        {
            Integer first = integers.removeFirst();
            Integer first1 = integers.removeFirst();
            if (chars[first]==chars1[first1]&&chars[first1]==chars1[first])
            {
                return true;
            }else
            {
                return false;
            }
        }else if (integers.size()==1)
        {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        new One().areAlmostEqual("bank","kanb");
    }
}

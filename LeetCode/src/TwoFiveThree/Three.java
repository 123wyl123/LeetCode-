package TwoFiveThree;

import java.util.Deque;
import java.util.LinkedList;

public class Three {
    public int minSwaps(String s) {
//        char[] chars = s.toCharArray();
//        if (s.length()==0)
//        {
//            return 0;
//        }
//

        char a[]=s.toCharArray();
        int n =s.length();
        StringBuffer stringBuffer = new StringBuffer();
        Deque<Character> aa= new LinkedList<>();
        aa.addLast(a[0]);
        for (int i = 1; i <n ; i++) {
            if (aa.size()!=0&&aa.getLast()=='['&&a[i]==']')
            {
                aa.removeLast();
            }else if (aa.size()!=0&&aa.getFirst()=='['&&a[i]==']')
            {
               aa.removeFirst();
            }else
            {
                aa.addLast(a[i]);
            }
        }
        int temp=aa.size()/2;
        return temp/2+temp%2;

    }

    public static void main(String[] args) {
        new Three().minSwaps("][][");
    }
}

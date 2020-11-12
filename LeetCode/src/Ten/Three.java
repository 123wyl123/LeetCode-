package Ten;

import java.util.Deque;
import java.util.LinkedList;

public class Three {
    public boolean isValid(String s) {
        Deque<Character> a = new LinkedList<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar=='c')
            {
                if (a.isEmpty()||a.pop()!='b')return false;
                if (a.isEmpty()||a.pop()!='a')return false;
            }else
            {
                a.push(aChar);
            }
        }
return a.isEmpty();
    }

    public static void main(String[] args) {
        new Three().isValid("abcabcababcc");
    }
}

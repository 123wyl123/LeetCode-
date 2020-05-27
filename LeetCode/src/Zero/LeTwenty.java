package Zero;

import java.util.Stack;

public class LeTwenty {
    public boolean isValid(String s) {
        Stack b =new Stack();
        if(s.length()%2!=0)
        {
            return  false;
        }
        for (int i =0;i<s.length();i++)
        {   if(String.valueOf(s.charAt(i)).equals("[")||String.valueOf(s.charAt(i)).equals("{")||String.valueOf(s.charAt(i)).equals("("))
            b.push(s.charAt(i));
        else
        {       if(b.isEmpty())
        {
            return  false;
        }
            String a = String.valueOf(b.pop());
            if(String.valueOf(s.charAt(i)).equals("]"))
            {
                if(!a.equals("["))
                {
                    return false;
                }
            }
            else if(String.valueOf(s.charAt(i)).equals("}"))
            {
                if(!a.equals("{"))
                {
                    return  false;
                }
            }
            else
            {
                if(!a.equals("("))
                {
                    return  false;
                }
            }
        }
        }
        if(b.isEmpty()) {
            return true;
        }
        else
        {
            return  false;
        }
    }


    public static void main(String[] args) {
        LeTwenty m = new LeTwenty();
        m.isValid( "()");
    }
}

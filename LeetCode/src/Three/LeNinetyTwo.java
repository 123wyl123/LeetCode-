package Three;

public class LeNinetyTwo {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)
        {
            return true;
        }
        if(t.length()==0)
        {
            return  false;
        }
        for (int i = 0,j=0; i <t.length() ; i++) {
            if(s.charAt(j)==s.charAt(i))
            {
                j++;
            }
            if(j==s.length())
            {
                return true;
            }
        }
        return false;
    }
}



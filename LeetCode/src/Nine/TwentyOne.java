package Nine;

public class TwentyOne {
    public int minAddToMakeValid(String S) {
        char[] chars = S.toCharArray();
        int l =0;
        int r = 0;
        for (int i = 0; i <chars.length ; i++) {
            if (chars[i]=='(')
            {
                l++;
            }else
            {   if (l>0)
            {
                l--;
            }else
            {
                r++;
            }

            }
        }
        return l+r;
    }
}

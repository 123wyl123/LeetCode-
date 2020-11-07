package Zero;

public class FiftyEight {
    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int k=0;
        for (int i = s.length()-1; i >=0 ; i--) {
            if (chars[i]!=' ')
            {
               k++;
            }else
            {
                if (k==0)
                {
                    continue;
                }else
                {
                    return k;
                }
            }
        }
        return k;
    }
}

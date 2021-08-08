package BiweeklyFiftyEight;

public class One {
    public String makeFancyString(String s) {
        char[] chars = s.toCharArray();
        int l=0;
        int r=0;
        StringBuffer stringBuffer = new StringBuffer();
        while (r<s.length())
        {
            if (chars[l]==chars[r])
            {
                r++;
                if (r-l>=2)
                {

                }else
                {
                    stringBuffer.append(chars[r]);
                }
            }else
            {
                l=r;

            }
        }
        return stringBuffer.toString();
    }

}

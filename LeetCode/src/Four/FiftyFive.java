package Four;

import java.util.Arrays;

public class FiftyFive {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int si = 0;
        int gi=0;
        int res = 0;
        while (gi<g.length&&si<s.length)
        {
            if(s[si]>=g[gi])
            {
                si++;
                gi++;
                res++;
            }else
            {
                si++;
            }
        }
        return res;
    }
}

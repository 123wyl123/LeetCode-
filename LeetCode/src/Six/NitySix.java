package Six;

public class NitySix {
    public int countBinarySubstrings(String s) {
        int prev = 0;
        int cur = 1;
        int ans =0;
        for (int i = 1; i <s.length() ; i++) {
            if(s.charAt(i-1)==s.charAt(i))
            {
                cur++;
            }else
            {
                prev = cur;
                cur = 1;
            }
            if(prev>=cur)
            {
                ans++;
            }
        }

        return ans;
    }
}

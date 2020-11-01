package One;

import java.util.LinkedList;
import java.util.List;

public class ThirtyNine {
    public boolean wordBreak(String s, List<String> wordDict) {
        char[] chars = s.toCharArray();
        boolean dp [] = new boolean[chars.length+1];
        dp[0] = true;
        for (int i = 1; i <dp.length ; i++) {
            for (int j = i-1; j >=0 ; j--) {
                if (wordDict.contains(s.substring(j,i))&&dp[j])
                {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[chars.length];
    }

    public static void main(String[] args) {
        String  a = "leetcode";
        String ab [] = {"leet","code"};
        LinkedList<String > es = new LinkedList<String >();
        es.add("leet");
        es.add("code");
        new ThirtyNine().wordBreak(a,es);
    }
}

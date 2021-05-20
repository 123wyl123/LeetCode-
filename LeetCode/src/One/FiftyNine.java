package One;

import java.util.HashMap;

public class FiftyNine {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
        char[] chars = s.toCharArray();
        int l=0;int r=0;
        int max =0;
        while (r<chars.length){
            if (characterIntegerHashMap.size()<2||characterIntegerHashMap.containsKey(chars[r]))
            {
                characterIntegerHashMap.put(chars[r],characterIntegerHashMap.getOrDefault(chars[r],0)+1);
                r++;
            }else
            {   max =Math.max(r-l,max);
                for (int i = l; i <=r ; i++) {
                    characterIntegerHashMap.put(chars[i],characterIntegerHashMap.get(chars[i])-1);
                    if (characterIntegerHashMap.get(chars[i])==0)
                    {
                        characterIntegerHashMap.remove(chars[i]);
                        l=i+1;
                        break;
                    }
                }
                characterIntegerHashMap.put(chars[r],1);
                r++;
            }
        }
        max=Math.max(max,r-l);
        return max;
    }
}

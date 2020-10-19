package TwoOneOne;

import java.util.HashMap;

public class One {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
        int length = s.length();
        char[] chars = s.toCharArray();
        int max = 0;
        for (int i = 0; i <length ; i++) {
            if (characterIntegerHashMap.containsKey(chars[i]))
            {
                max = Math.max(i-characterIntegerHashMap.get(chars[i]),max);
            }else
            {
                characterIntegerHashMap.put(chars[i],i);
            }
        }
        return max==0?-1:max-1;
    }

    public static void main(String[] args) {
        new One().maxLengthBetweenEqualCharacters("aa");
    }
}

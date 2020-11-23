package Thirteen;

import java.util.HashMap;

public class FourtySeven {
    public int minSteps(String s, String t) {
        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            if (characterIntegerHashMap.containsKey(chars[i]))
            {
                characterIntegerHashMap.put(chars[i],characterIntegerHashMap.get(chars[i])+1);
            }else
            {
                characterIntegerHashMap.put(chars[i],1);
            }
        }
        int sum =0;
        for (int i = 0; i <chars1.length ; i++) {
            if (characterIntegerHashMap.containsKey(chars1[i]))
            {
                Integer integer = characterIntegerHashMap.get(chars1[i]);


                if (integer==1)
                {
                    characterIntegerHashMap.remove(chars1[i]);
                }else
                {
                    characterIntegerHashMap.put(chars1[i],integer-1);
                }
            }else
            {
             sum++;
            }
        }
        return sum;
    }
}

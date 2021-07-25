package BiweeklyFourtySeven;

import java.util.HashMap;

public class One {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            characterIntegerHashMap.put(chars[i],characterIntegerHashMap.getOrDefault(chars[i],0)+1);
        }
        int max =0;
        for (Character character : characterIntegerHashMap.keySet()) {
            if (max==0)
            {
                max =characterIntegerHashMap.get(character);
            }else
            {
                Integer integer = characterIntegerHashMap.get(character);
                if (max!=integer)
                {
                    return false;
                }
            }
        }
        return true;
    }
}

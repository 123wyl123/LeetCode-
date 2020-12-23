package Three;

import java.util.HashMap;

public class EightyNine {
    public char findTheDifference(String s, String t) {
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();
        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
        for (char aChar : chars) {
            characterIntegerHashMap.put(aChar,characterIntegerHashMap.getOrDefault(aChar,0)+1);
        }
        for (char c : chars1) {
            characterIntegerHashMap.put(c,characterIntegerHashMap.getOrDefault(c,0)-1);

        }
        for (Character character : characterIntegerHashMap.keySet()) {
            if (characterIntegerHashMap.get(character)<0)
            {
                return character;
            }
        }
        return 'z';
    }
}

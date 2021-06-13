package TwoFourFive;

import java.util.HashMap;

public class One {
    public boolean makeEqual(String[] words) {
        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
        for (int i = 0; i <words.length ; i++) {
            char[] chars = words[i].toCharArray();
            for (int j = 0; j <words[i].length() ; j++) {
                characterIntegerHashMap.put(chars[j],characterIntegerHashMap.getOrDefault(chars[j],0)+1);
            }
        }
        int length = words.length;
        for (Character character : characterIntegerHashMap.keySet()) {
            if (characterIntegerHashMap.get(character)%length!=0)
            {
                return false;
            }
        }
        return true;
    }
}

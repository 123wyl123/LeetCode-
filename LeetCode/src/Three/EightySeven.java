package Three;

import java.util.HashMap;

public class EightySeven {
    public int firstUniqChar(String s) {
        int visit[] = new int[26];
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            visit[chars[i]-'a']++;
            integerIntegerHashMap.put(chars[i]-'a',i);
        }

        for (int i = 0; i <chars.length ; i++) {
            if (visit[chars[i]-'a']==1)
            {
                return integerIntegerHashMap.get(chars[i]-'a');
            }
        }
        return -1;
    }
}

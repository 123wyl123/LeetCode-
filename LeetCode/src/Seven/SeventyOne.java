package Seven;

import java.util.HashSet;

public class SeventyOne {
    public int numJewelsInStones(String J, String S) {
        char[] chars = J.toCharArray();
        char[] chars1 = S.toCharArray();
        HashSet<Character> characters = new HashSet<>();

        for (int i = 0; i <chars.length ; i++) {
            characters.add(chars[i]);
        }
        int sum=0;
        for (int i = 0; i <chars1.length ; i++) {
            if (characters.contains(chars1[i]))
            {
              sum++;
            }
        }
        return sum;
    }
}

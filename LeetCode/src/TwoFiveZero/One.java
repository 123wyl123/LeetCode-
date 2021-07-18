package TwoFiveZero;

import java.util.HashSet;

public class One {
    public int canBeTypedWords(String text, String brokenLetters) {
        char[] chars = brokenLetters.toCharArray();
        HashSet<Character> characters = new HashSet<>();
        for (int i = 0; i <chars.length ; i++) {
            characters.add(chars[i]);
        }
        int t=0;
        String[] s = text.split(" ");
        for (int i = 0; i <s.length ; i++) {
            String s1 = s[i];
            for (int j = 0; j <s1.length() ; j++) {
                if (characters.contains(s1.charAt(j)))
                {   t++;
                    break;
                }
            }

        }
        return s.length-t;
    }


}

package Two;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Ninety {
    public boolean wordPattern(String pattern, String s) {
        char[] chars = pattern.toCharArray();
        String[] s1 = s.split(" ");
        if (chars.length!=s1.length)
        {return false;
        }
        HashSet<String > characters = new HashSet<>();

        LinkedList<Integer> integers = new LinkedList<>();
        HashMap<Character, LinkedList<Integer>> characterLinkedListHashMap = new HashMap<>();
        for (int i = 0; i <chars.length ; i++) {
            if (characterLinkedListHashMap.containsKey(chars[i]))
            {
                LinkedList<Integer> integers1 = characterLinkedListHashMap.get(chars[i]);
                integers1.addLast(i);
            }else
            {
                LinkedList<Integer> integers1 = new LinkedList<>();
                integers1.addLast(i);
                characterLinkedListHashMap.put(chars[i],integers1);
            }
        }
        for (Character character : characterLinkedListHashMap.keySet()) {
            LinkedList<Integer> integers1 = characterLinkedListHashMap.get(character);
            String s2 = s1[integers1.getFirst()];

            if (integers1.size()==1)
            {    characters.add(s2);
                continue;
            }else
            {
                characters.add(s2);
                for (Integer integer : integers1) {
                   if (s2.equals(s1[integer]))
                   {
                       continue;
                   }else
                   {
                       return false;
                   }
                }
            }
        }
        if (characters.size()!=characterLinkedListHashMap.size())
        {
            return false;
        }
        return true;

    }


}

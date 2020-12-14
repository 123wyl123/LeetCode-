package Zero;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class FourtyNine {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> stringListHashMap = new HashMap<>();
        int length = strs.length;
        for (int i = 0; i <length ; i++) {
            String str = strs[i];
            char[] chars = str.toCharArray();
            Arrays.sort(chars) ;
            String s = Arrays.toString(chars);
            if (stringListHashMap.containsKey(s))
            {
                List<String> strings = stringListHashMap.get(s);
                strings.add(strs[i]);
            }else
            {
                LinkedList<String> strings = new LinkedList<>();
                strings.addLast(strs[i]);
                stringListHashMap.put(s,strings);
            }
        }
        LinkedList<List<String>> linkedLists = new LinkedList<>();
        for (String s : stringListHashMap.keySet()) {
            List<String> strings = stringListHashMap.get(s);
            linkedLists.addLast(strings);
        }
        return linkedLists;
    }

    public static void main(String[] args) {
        String a[] = {"eat","tea","tan","ate","nat","bat"};
        new FourtyNine().groupAnagrams(a);
    }
}

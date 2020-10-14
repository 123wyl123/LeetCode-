package Ten;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Two {
    public List<String> commonChars(String[] A) {
        int length = A.length - 1;
        int a[][] = new int[length][26];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < A[i].length(); j++) {
                a[i][A[i].charAt(j) - 'a']++;
            }
        }
        List<String> strings = new LinkedList<>();
        HashMap<Character, Integer> characterIntegerHashMap1 = new HashMap<>();
        for (int i = 0; i < A[length].length(); i++) {
            characterIntegerHashMap1.put(A[length].charAt(i), characterIntegerHashMap1.getOrDefault(A[length].charAt(i), 0) + 1);
        }
        boolean flag = true;
        for (Character character : characterIntegerHashMap1.keySet()) {
            flag = true;
            Integer integer = characterIntegerHashMap1.get(character);
            for (int i = 0; i < length; i++) {
                if (a[i][character - 'a'] <= integer) {
                    integer = a[i][character - 'a'];
                    continue;
                } else if (a[i][character - 'a'] > integer) {
                    continue;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                for (int i = 0; i < integer; i++) {
                    strings.add(String.valueOf(character));
                }
            }


        }
        return strings;
    }

    public static void main(String[] args) {
        String a[] = {"bella", "label", "roller"};
        new Two().commonChars(a);
    }
}


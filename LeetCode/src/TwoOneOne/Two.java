package TwoOneOne;

import java.util.HashSet;
import java.util.PriorityQueue;

public class Two {
    HashSet<String> temp;
    PriorityQueue<String> strings;

    public String findLexSmallestString(String s, int a, int b) {
        strings = new PriorityQueue<String>((String o1, String o2) -> {
            for (int i = 0; i < o1.length(); i++) {
                if (o1.charAt(i) == o2.charAt(i)) {
                    continue;
                } else if (o1.charAt(i) < o2.charAt(i)) {
                    return -1;
                } else {
                    return 1;
                }
            }
            return -1;
        });
        temp = new HashSet<>();
        char[] chars = s.toCharArray();
        dfs(chars, a, b);
        return strings.poll();
    }

    void dfs(char[] chars, int a, int b) {
        if (temp.contains(new String(chars))) {
            return;
        } else {
            strings.add(new String(chars));
            temp.add(new String(chars));
            String ab = new String(chars);
            for (int i = 1; i < chars.length; i += 2) {
                chars[i] += a;
                if (chars[i] > '9') {
                    chars[i] -= 10;
                } else {
                    continue;
                }
            }
            if (temp.contains(new String(chars))) {

            } else {
                dfs(chars, a, b);
            }


            String s = ab;
            s = s.substring(s.length() - b) + s.substring(0, s.length() - b);
            chars = s.toCharArray();
            if (temp.contains(new String(chars))) {
                return;
            } else {
                dfs(chars, a, b);
            }
        }
        return;
    }

    public static void main(String[] args) {
        new Two().findLexSmallestString("5525", 9, 2);
    }
}

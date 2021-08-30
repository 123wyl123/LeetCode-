package TwoFiveSix;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Two {
    public String kthLargestNumber(String[] nums, int k) {

        PriorityQueue<String> strings = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    if (o1.equals(o2)) {
                        return -1;
                    }
                    char[] chars = o1.toCharArray();
                    char[] chars1 = o2.toCharArray();

                    for (int i = 0; i < o1.length(); i++) {
                        if (chars[i] == chars1[i]) {
                            continue;
                        } else if (chars[i] < chars1[i]) {
                            return -1;
                        } else {
                            return 1;
                        }
                    }
                } else {
                    return o1.length() - o2.length();
                }
                return -1;
            }
        });
        for (String num : nums) {
            strings.add(num);
        }
        while (strings.size()>k)
        {
            strings.poll();
        }
        return strings.poll();
    }
}

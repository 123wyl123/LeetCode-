package Zero;

import java.util.LinkedList;
import java.util.Queue;

public class Three {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.equals("")) {
            return 0;
        }
        char[] chas = s.toCharArray();
        // map 替代了哈希表   假设字符的码是0~255
        int[] map = new int[256];
        for (int i = 0; i < 256; i++) {
            map[i] = -1;
        }
        int len = 0;
        int pre = -1;
        int cur = 0;
        for (int i = 0; i != chas.length; i++) {
            pre = Math.max(pre, map[chas[i]]);
            cur = i - pre;
            len = Math.max(len, cur);
            map[chas[i]] = i;
        }
        return len;
    }
    public int lengthOfLongestSubstring1(String s) {
        if (s == null || s.equals("")) {
            return 0;
        }
        Queue <Character> a = new LinkedList<>();
        char[] chars = s.toCharArray();
        a.offer(chars[0]);
        int size =0;
        for (int i = 1; i <chars.length ; i++) {
            while (a.contains(chars[i]))
            {
                Character poll = a.poll();
            }
            a.offer(chars[i]);
            size = Math.max(size,a.size());
        }
        size = Math.max(size,a.size());
        return size;
    }

   
}

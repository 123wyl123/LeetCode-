package Seven;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class SixtyThree {
    public List<Integer> partitionLabels(String S) {
        LinkedList<Integer> integers = new LinkedList<>();
        char[] chars = S.toCharArray();
        int a[] = new int[26];
        for (int i = 0; i <chars.length ; i++) {
            a[chars[i]-'a'] ++;
        }
        int pre =-1;
        HashSet<Character> characters = new HashSet<>();
        for (int i = 0; i <S.length() ; i++) {
            a[chars[i]-'a']--;
            if (a[chars[i]-'a']==0)
            {
                characters.remove(chars[i]);
            }else
            {
                characters.add(chars[i]);
            }
            if (characters.isEmpty())
            {
                integers.add(i-pre);
                pre = i;
            }
        }
        return integers;
    }
    public List<Integer> partitionLabels1(String S) {
        if (S ==null  || S.length() == 0) {
            return null;
        }
        int len = S.length();

        // 做映射表，记录每个字母最后出现的位置
        int[] ma = new int[26];
        for (int i = 0; i < len; ++i) {
            ma[S.charAt(i) - 'a'] = i;
        }

        List<Integer> ans = new ArrayList<>();
        int left = 0;
        while (left < len) {
            char curLeft = S.charAt(left);
            // 最小右边界
            int right = ma[curLeft - 'a'];
            for (int i = left + 1; i < right; ++i) {
                // 枚举当前分段中的字符，更新右边界
                if (ma[S.charAt(i) - 'a'] > right) {
                    right = ma[S.charAt(i) - 'a'];
                }
            }
            // 至此，一个新的片段生成了
            ans.add(right - left + 1);
            // 分析下一段
            left = right + 1;
        }
        return ans;
    }
}

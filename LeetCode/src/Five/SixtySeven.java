package Five;

import java.util.HashMap;

public class SixtySeven {
    public boolean checkInclusion(String s1, String s2) {
        char[] chars = s1.toCharArray();
        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
        int a[]=new int[26];
        int length = chars.length;
        for (int i = 0; i <length ; i++) {
           a[chars[i]-'a']++;
        }
        int temp =length;
        char[] chars1 = s2.toCharArray();
        int length1 = chars1.length;
        int left =0;
        int right =0;
        while (right<length1)
        {   if (length1-left<length)
        {
            return false;
        }

            int b =(int ) chars1[right]- 'a';
            if (a[b]>0)
            {
                a[b]--;
                temp--;
                right++;
            }else
            {
                a[chars1[left]-'a']++;
                 left++;
                temp++;
            }
            if (temp==0)
            {
                return true;
            }

        }
    return false;
    }

    public static void main(String[] args) {
        new SixtySeven().checkInclusion("adc",
                "dcda");
    }
}

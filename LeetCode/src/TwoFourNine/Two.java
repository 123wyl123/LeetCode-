package TwoFourNine;

import java.util.HashSet;

public class Two {
    public int countPalindromicSubsequence(String s) {
        char[] chars = s.toCharArray();
        HashSet<String> strings = new HashSet<>();
        int a[][]=new int[26][2];
        for (int i = 0; i <26 ; i++) {
            a[i][0]=Integer.MAX_VALUE;
        }



        for (int i = 0; i <chars.length ; i++) {

            a[chars[i]- 'a'][0]=Math.min(a[chars[i]-'a'][0],i);
            a[chars[i]-'a'][1]=Math.max(a[chars[i]-'a'][1],i);
        }
        int sum =0;
        for (int i = 0; i <26 ; i++) {
            if (a[i][0]>=a[i][1])
            {
                continue;
            }
            HashSet<Character> characters = new HashSet<>();
            for (int j = a[i][0]+1; j <a[i][1] ; j++) {
                characters.add(chars[j]);
            }
            sum+=characters.size();
        }
        return sum;
    }

    public static void main(String[] args) {
        new Two().countPalindromicSubsequence("aabca");
    }
}

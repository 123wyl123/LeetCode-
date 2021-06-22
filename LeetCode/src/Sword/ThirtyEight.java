package Sword;

import java.util.HashSet;

public class ThirtyEight {
    HashSet<String > a;
    public String[] permutation(String s) {
        a = new HashSet<>();
        char[] chars = s.toCharArray();
        dfs(chars,0,chars.length);
        String  ss[]=new String[a.size()];
        int i =0;
        for (String s1 : a) {
            ss[i++]=s1;
        }
        return ss;
    }
    public void dfs(char[] chars,int n ,int l)
    {
        if (l<n||n==l)
        {
            a.add(new String(chars));
            return;
        }
        for (int i = n; i <l ; i++) {
            if (chars[n]==chars[i])
            {       dfs(chars,n+1,l);

            }else
            {
                char temp = chars[i];
                chars[i]=chars[n];
                chars[n]=temp;
                dfs(chars,n+1,l);
                temp = chars[i];
                chars[i]=chars[n];
                chars[n]=temp;
            }
        }
        a.add(new String(chars));
        return;
    }



    public static void main(String[] args) {
        new ThirtyEight().permutation("abc");
    }
}

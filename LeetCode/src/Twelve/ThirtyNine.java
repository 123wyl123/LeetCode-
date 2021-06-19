package Twelve;

import java.util.List;

public class ThirtyNine {
    int length=0;
    public int maxLength(List<String> arr) {
        int a[]=new int[26];
        int temp=0;
        dfs(arr,0,a,temp);
        return length;
    }
    public  void dfs(List<String> arr, int n, int a[], int temp)
    {
        for (int i = n; i <arr.size() ; i++) {
            String s = arr.get(i);
            char[] chars = s.toCharArray();
            int j=0;
            int tt =0;
            for (j = 0; j <chars.length ; j++) {
                if (a[chars[j]-'a']==0)
                {
                    a[chars[j]-'a']++;
                    tt++;
                }else
                {
                    break;
                }
            }
            if (j==chars.length)
            {   length=Math.max(length,temp+tt);
                dfs(arr,i+1,a,temp+tt);
                for (int k = 0; k <chars.length ; k++) {
                    a[chars[k]-'a']--;
                }
            }else
            {
                for (int k = 0; k <j ; k++) {
                    a[chars[k]-'a']--;
                    tt--;
                }
            }
        }

    }
}
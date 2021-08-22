package TwoFiveFive;

import java.util.HashSet;

public class Two {
    boolean flag= false;
    String cur =null;
    public String findDifferentBinaryString(String[] nums) {

        int length = nums[0].length();
        HashSet<String> strings = new HashSet<>();
        char[] chars = nums[0].toCharArray();
        HashSet<String> b = new HashSet<>();
        for (int i = 0; i <nums.length ; i++) {
            b.add(nums[i]);
        }
        flag=false;
        dfs(b,length,0,chars);

       return cur;
    }
    public void dfs(HashSet<String >a ,int n,int i,char b[])
    {       if (flag)
    {
        return;
    }
        if (i==n)
        {
           if (!a.contains(String.valueOf(b)))
            {
               flag=true;
               cur=new String(b);

            }
            return;
        }
        for (int j = i; j <n ; j++) {
          b[j]='1';
          dfs(a,n,j+1,b);
          if (flag)
          {
              return;
          }
          b[j]='0';
        }
        if (!a.contains(String.valueOf(b)))
        {
            flag=true;
            cur=new String(b);

        }
    }

    public static void main(String[] args) {
        String a[]={"1"};
        new Two().findDifferentBinaryString(a);
    }
}

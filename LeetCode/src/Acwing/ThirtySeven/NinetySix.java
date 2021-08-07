package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NinetySix {
    static int max =0;
    public static void main(String[] args) throws Exception{
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int T =Integer.valueOf(scan.readLine());
        while(T>0)
        {
            T--;
            String s = scan.readLine();
            char[] chars = s.toCharArray();
            max =0;
          dfs(0,chars,0,0);
          if (max==0)
          {
              System.out.println(-1);
          }else
          {
              System.out.println(s.length()-max);
          }
        }
    }

    public static void dfs(int n,char c[],int m,int yong)
    {
        if (m==c.length)
        {   int temp = (int)Math.sqrt(n);
            if (temp*temp==n) {
                max = Math.max(max, yong);
            }


        }
        for (int i = m; i <c.length ; i++) {
            if (c[i]=='0'&&n==0)
            {
               continue;
            }
            dfs(n*10+c[i]-'0',c,i+1,yong+1);

        }
         int temp = (int)Math.sqrt(n);
            if (temp*temp==n) {
                max = Math.max(max, yong);
            }

    }
}

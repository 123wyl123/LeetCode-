package Five;

import java.util.HashMap;

public class SeventySix {

    HashMap<Integer,Long> a[][];
    public int findPaths(int m, int n, int N, int i, int j) {
       a = new HashMap[m][n];
        long dfs = dfs(m, n, N, i, j, N);
        return (int)(dfs%1000000007);
    }
    public long dfs(int m ,int n , int N , int i ,int j ,int cur)
    {    if (a[i][j]==null)
    {
        a[i][j] = new HashMap<Integer, Long>();
    }
        long temp=0;
    if ( a[i][j].containsKey(cur))
    {
        return a[i][j].get(cur);
    }


        if (cur==0)
        {
           return 0;
        }
        if (i+cur<m&&j+cur<n&&i-cur>=0&&j-cur>=0)
        {
            return 0;
        }
        if (i+1<m)
        {
       temp+=     dfs(m,n,N,i+1,j,cur-1);
        }else
        {
        temp++;
        }
        if (i-1>=0)
        {
        temp+=    dfs(m,n,N,i-1,j,cur-1);
        }else
        {
            temp++;
        }

        if (j+1<n)
        {
        temp+=    dfs(m,n,N,i,j+1,cur-1);
        }else
        {
            temp++;
        }

        if (j-1>=0)
        {
          temp+=  dfs(m,n,N,i,j-1,cur-1);
        }else
        {
           temp++;
        }
        a[i][j].put(cur,temp%1000000007);
        return temp%1000000007;
    }


}

package Five;

public class erliu {
    int sum=0;
    public int countArrangement(int n) {
        int a[]=new int[n];
        
        dfs(a,0,n);
        return sum;
    }
    public void dfs (int a[],int i, int n)
    {
        if (i==n)
        {   sum++;
            return;
        }
        for (int j = 0; j <n ; j++) {
            if (a[j]==1)
            {
                continue;
            }else if ((j+1)%(i+1)==0||(i+1)%(j+1)==0)
            {
                a[j]=1;
                dfs(a,i+1,n);
                a[j]=0;
            }else
            {
                continue;
            }
        }
    }

    public static void main(String[] args) {
        new erliu().countArrangement(2);
    }
}

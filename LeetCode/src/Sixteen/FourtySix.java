package Sixteen;

public class FourtySix {
    public int getMaximumGenerated(int n) {
        int a[]=new int[n+1];
        if(n==0)
        {
            return 0;
        }else if(n==1)
        {
            return 1;
        }
        a[0]=0;
        a[1]=1;
        int max =1;
        for(int i=2;i<=n;i++)
        {
            if(i%2==0)
            {
                a[i]=a[i/2];
            }else
            {
                a[i]=a[i/2]+a[(i/2)+1];
            }
            max =Math.max(max,a[i]);
        }
        return max;
    }
}
package Three;

public class FourtyThree {
    public int integerBreak(int n) {
        int a[] = new int[n+1];
        if(n==2)
        {
            return 1;
        } else if(n==3)
        {
            return 2;
        }
        a[1]=1;
        a[2] = 2;
        a[3] = 3;
        for (int i = 4; i <=n ; i++) {
            int max = 0;
            for (int j = 1; j <=i/2 ; j++) {
                max = Math.max(a[i-j]*a[j],max);
            }
            a[i]=max;
        }
        return a[n];
    }
}

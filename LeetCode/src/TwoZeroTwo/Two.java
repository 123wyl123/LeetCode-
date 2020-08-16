package TwoZeroTwo;

public class Two {
    public int minOperations(int n) {
        int a[]=new int[n];
        int sum=0;
        for (int i = 0; i <n ; i++) {
            a[i] = 2*i+1;
            sum+=a[i];
        }
      sum=  sum/n;
        int k=0;
        for (int i = 0; i <n ; i++) {
            if(a[i]<sum)
            {
                k+=sum-a[i];
            }else
            {
                return k;
            }

        }
        return k;
    }
}

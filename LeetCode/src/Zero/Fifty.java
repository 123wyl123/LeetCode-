package Zero;

public class Fifty {
    public double myPow(double x, int n) {
        if (x==1)
        {
            return 1;
        }
        if (x==-1)
        {
            if (n%2==0){
                return 1;
            }
            return -1;
        }
        long nn=n;
        if(n<0)
        {
            x=1/x;
            nn=-nn;
        }

        return quick(x,nn);
    }

    public double quick(double x ,long n )
    {   double temp=1;
        while (n!=0)
        {   if ((n&1)!=0) {
            temp *= x;
        }
            x=x*x;
            n=n>>1;
        }
        return temp;
    }
}

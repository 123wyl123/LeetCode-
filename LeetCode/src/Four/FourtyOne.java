package Four;

public class FourtyOne {
    public int arrangeCoins(int n) {
        long temp = n;
        long l=1;
        long r=n;

        while(l<=r)
        {
            long mid = (l+r)/2;
            if((mid+1)*mid/2>n)
            {
                r=mid-1;
            }else
            {   temp=mid;
                l=mid+1;
            }
        }
        return  (int)temp;
    }
}
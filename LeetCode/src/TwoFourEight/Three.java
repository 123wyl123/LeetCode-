package TwoFourEight;

public class Three {
    public int countGoodNumbers(long n) {
        int d=5;//偶数
        int s=4;
        long sums =1;
        if (n%2==0)
        {
            long l = n / 2;
            long temp=5;
 sums=(sums%1000000007* sum(5,l)%1000000007)%1000000007;;
     sums=(sums%1000000007*    sum(4,l)%1000000007)%1000000007 ;;

        }else
        {
            long l=(n/2)+1;
        sums=(sums%1000000007*    sum(5,l)%1000000007)%1000000007 ;
            sums=(sums%1000000007*sum(4,l-1)%1000000007)%1000000007 ;
        }
        return (int)sums%1000000007;
    }
    public long sum(int a,long b)
    {
        if (b==0)
        {
            return 1;
        }
        long sum=1;
        long temp=a;
        while (b!=0) {

            if ((b & 1) == 1) {
                sum = (sum %1000000007*temp%1000000007)%1000000007;
            }
            temp = (temp%1000000007 * temp%1000000007)%1000000007;
            ;b=b>>1;
        }
        return sum;
    }

    public static void main(String[] args) {
        new Three().countGoodNumbers(50);
    }
}

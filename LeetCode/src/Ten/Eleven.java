package Ten;

public class Eleven {
    public int shipWithinDays(int[] weights, int D) {
        long l = 0;
        long r = 0;

        for (int i = 0; i <weights.length ; i++) {
        r+=weights[i];
        }
        l = r/D;
        while (l<r)
        {
            long mid = (l+r)/2;
            int cishu = 1;
            long temp  = mid;
            for (int i = 0; i <weights.length ; i++) {
                if (temp-weights[i]>=0)
                {
                    temp = temp- weights[i];
                }else
                {   i--;
                    cishu++;
                    if (cishu>D)
                    {
                        break;
                    }
                    temp=mid;
                }
            }
            if (cishu>D)
            {
                l= mid+1;
            }else
            {
                r=mid;
            }
        }
        return (int) l;
    }

    public static void main(String[] args) {
        int a[] ={1,2,3,4,5,6,7,8,9,10};
        new Eleven().shipWithinDays(a,5);
    }
}

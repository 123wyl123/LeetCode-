package Zero;

public class SixtyNine {
    public int mySqrt(int x) {
        int l =0;
        int r = x;
        while (l<r)
        {
            int mid = (l+r)/2;
            if (mid*mid>x)
            {
                r=mid-1;
            }else
            {
                l=mid;
            }

        }
        return l;
    }
}

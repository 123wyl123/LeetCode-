package Six;

public class ThirtyThree {
    public boolean judgeSquareSum(int c) {
        int l =0;
        int r =(int) Math.sqrt(c);
        if (l*l+r*r==c)
        {
            return true;
        }
        l++;
        while (l<=r)
        {
            if (l*l+r*r==c)
            {
                return true;
            }else if (l*l+r*r<c)
            {
                l++;
            }else
            {
                r--;
            }
        }
        return false;
    }

}

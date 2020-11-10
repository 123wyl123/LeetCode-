package Nine;

public class SeventyEight {
    public int maxTurbulenceSize(int[] A) {
        if (A.length<=1)
        {
            return A.length;
        }
        boolean flag ;
        int max = 1;
        int l = 0;
        int r = 0;
        while (r<A.length-1&&A[r]==A[r+1])
        {
            r++;
        }
        if (r==A.length-1)
        {
            return 1;
        }
        l=r;
        if (A[r]<A[r+1])
        {
            flag = true;
        }else
        {
            flag = false;
        }
        r++;

        while (l<=r&&r<A.length-1)
        {
            if (flag&&A[r]>A[r+1])
            {
                r++;

                flag = false;
            }else if (!flag&&A[r]<A[r+1])
            {
                r++;

                flag=true;
            }else
            {
                max = Math.max(r-l+1,max);
                flag = !flag;

                while (r+1<A.length&&A[r]==A[r+1])
                {
                    r++;
                }
                l=r;
            }
        }
        return Math.max(max,r-l+1);
    }

    public static void main(String[] args) {
        int a[] ={9,9};
        new SeventyEight().maxTurbulenceSize(a);
    }
}

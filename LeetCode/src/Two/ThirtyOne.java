package Two;

public class ThirtyOne {
    public boolean isPowerOfTwo(int n) {
        int k=0;
        if (n>0)
        {
            for (int i = 31; i >=0 ; i--) {
                if (((n>>i)&1)==1)
                {
                    k++;
                }
            }
            return k==1;
        }else
        {
            return false;
        }
    }


}

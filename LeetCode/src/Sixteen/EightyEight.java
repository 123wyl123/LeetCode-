package Sixteen;

public class EightyEight {
    public int numberOfMatches(int n) {
        int sum=0;
        while(n!=1)
        {
            if((n&1)==0)
            {
                sum+=n/2;
                n=n/2;
            }else
            {
                sum+=n/2;
                n=(n/2)+1;
            }
        }
        return sum;
    }
}
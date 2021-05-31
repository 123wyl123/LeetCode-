package Three;

public class FourtyTwo {
    public boolean isPowerOfFour(int n) {
            if (n<=0)
            {
                return false;
            }
            if ((n&n-1)!=0)
            {
                return false;
            }
       int a=0;
        for (int i = 1; i <31 ; i+=2) {
            a+=Math.pow(2,i);
        }
        return (a&n)==0?true:false;
    }
}

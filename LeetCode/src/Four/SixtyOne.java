package Four;

public class SixtyOne {
    public int hammingDistance(int x, int y) {
        int temp =x^y;
        int sum=0;
        for (int i = 31; i >0 ; i--) {
            if (((temp>>i)&1)==0)
            {
                continue;
            }else
            {
                sum++;
            }
        }
        return sum;
    }


}

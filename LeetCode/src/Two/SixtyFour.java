package Two;

public class SixtyFour {
    public int nthUglyNumber(int n) {
        int index[] = new int[n];
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        index[0]=1;
        for (int i = 1; i <n ; i++) {
            int temp=  Math.min(index[i3]*3,index[i5]*5);
            index[i] = Math.min(index[i2]*2,temp);

            if (index[i]==index[i2]*2)
            {
                i2++;
            }
            if (index[i]==index[i3]*3)
            {
                i3++;
            }
            if (index[i]==index[i5]*5)
            {
                i5++;
            }
        }
        return index[n-1];
    }
}

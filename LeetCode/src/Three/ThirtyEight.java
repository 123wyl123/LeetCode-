package Three;

public class ThirtyEight {
    public int[] countBits(int num) {
        int a[] = new int[num+1];
        if (num==0)
        {
            return a;
        }
        a[0]=0;
        a[1]=1;
        for (int i = 2; i <num ; i++) {
            if (i%2==0)
            {
                a[i]=a[i/2];
            }else
            {
                a[i]=a[i-1]+1;
            }
        }
        return a;
    }
}

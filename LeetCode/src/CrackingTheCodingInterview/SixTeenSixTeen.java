package CrackingTheCodingInterview;

public class SixTeenSixTeen {
    public int[] divingBoard(int shorter, int longer, int k) {
        if(k==0)
        {
            return new int[0];
        }

        if(shorter==longer)
        {
            return new int[]{shorter*k};
        }
        int [] a = new int[k+1];
        for (int i = 0; i <=k ; i++) {
            a[i] =shorter*(k-i)+longer*i;
        }
        return a;
    }
}

package One;

public class ThirtyFive {
    public int candy(int[] ratings) {
        int length = ratings.length;
        int left[] = new int[length];
        for (int i = 0; i <length ; i++) {
            if (i>0&&ratings[i]>ratings[i-1])
            {
                left[i] = left[i-1]+1;
            }else
            {
                left[i]=1;
            }
        }
        int sum =0;
        int right =0;
        for (int i = length-1; i >=0 ; i--) {
            if (i<length-1&&ratings[i]>ratings[i+1])
            {
                right ++;
            }else
            {
             right=1;
            }
            sum= sum+Math.max(left[i],right);
        }

        return sum;
    }

  //
}

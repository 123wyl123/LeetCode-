package TwoZeroFour;

public class Two {
    public int getMaxLen(int[] nums) {
        int length = nums.length;
        int[][]a = new int[length][2];
        if(nums[0]==0)
        {
            a[0][0] = 0;
            a[0][1] = 0;
        }else if(nums[0]<0)
        {
            a[0][0]=1;
            a[0][1] = 0;
        }else
        { a[0][0]=0;
            a[0][1] = 1;

        }
        for (int i = 1; i <length ; i++) {
            if(nums[i]<0)
            {
                a[i][0]=a[i-1][0]+1;
                a[i][1] = a[i-1][1];
            }else  if(nums[i]==0)
            {
                a[i][0] = 0;
                a[i][1] = 0;
            }else
            {
                a[i][0]=a[i-1][0];
                a[i][1] = a[i-1][1]+1;
            }
        }
        int max = 0;
        int temp = 0;
        max = Math.max(max,a[0][1]);

        for (int i = 1; i <length ; i++) {
            if(a[i][0]%2!=0)
            {   if(a[i-1][0]==0)
            {
                temp = i;
            }

                max = Math.max(max,a[i][1]+a[i][0]-1-a[temp][1]);



            }else
            {
                max = Math.max(max,a[i][1]+a[i][0]);
            }

        }
        return max;
    }

    public static void main(String[] args) {
      int aa[] = {5,-20,-20,-39,-5,0,0,0,36,-32,0,-7,-10,-7,21,20,-12,-34,26,2};
      new Two().getMaxLen(aa);
    }
}

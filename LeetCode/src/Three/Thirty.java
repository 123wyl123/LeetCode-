package Three;

public class Thirty {
    public int minPatches(int[] nums, int n) {
        int k=0;
        int length = nums.length;
        long sum =0;
        if (length==0)
        {
            while (sum<n)
            {   k++;
                sum=sum+sum+1;
            }
                return k;
        }
        if (nums[0]!=1)
        {
            k++;
            sum=1;
        }
        int i=0;
        while (i<length)
        {
            if (nums[i]>sum+1)
            {
                sum=sum+1+sum;
                k++;
            }else
            {
                sum=sum+nums[i];
                i++;
            }
            if (sum>n)
            {
                return k;
            }
        }
        while (sum<n)
        {
            sum=sum+sum+1;
            k++;
        }
   return k;
    }


}

package TwoOneSix;

public class Three {
    public int waysToMakeFair(int[] nums) {

        int length = nums.length;
        if (length==1)
        {
            return length;
        }else if(length==2)
        {
            return 0;
        }
        int dp[] = new int [length];
        dp[0] = nums[0];
        dp[1] = nums[1];
        int sum=0;
        int a= 0;
        int b=0;
    for (int i = 2; i <length ; i++) {
            dp[i] = dp[i-2]+nums[i];
        }
    if (length%2==1)
    {
        if (dp[length-1]-nums[0]==dp[length-2])
        {
            sum++;
        }
    }else
    {
        if (dp[length-2]-nums[0]==dp[length-1])
        {
            sum++;
        }
    }

        for (int i =1; i <length ; i++) {
         if (i%2==0)
         {
             if (length%2==0)
             {
                 a= dp[i] -nums[i]+dp[length-1]-dp[i-1];
                 b= dp[i-1]+dp[length-2]-dp[i];
             }else
             {
                 a= dp[i] -nums[i]+dp[length-2]-dp[i-1];
                 b= dp[i-1]+dp[length-1]-dp[i];
             }
             if (a==b)
             {
        sum++;
             }
         }else
         {      if (length%2==0)
         {
             a= dp[i] -nums[i]+dp[length-2]-dp[i-1];
             b= dp[i-1]+dp[length-1]-dp[i];
         }else
         {
             a= dp[i] -nums[i]+dp[length-1]-dp[i-1];
             b= dp[i-1]+dp[length-2]-dp[i];
         }

             if (a==b)
             {
                 sum++;
             }
         }

        }
        return sum;
    }

    public static void main(String[] args) {
    int a[]=    {3,5,5,2,3,4,1,2,4,3,5,3,2,5,4,4,1,5,3,1,3,3,5,2,1,1,5,2,3,2,2,5,3,2,4,5,3,4,4,4,4,1,1,4,1,1,1,3,3,2,3,4,5,1,3,5,1,4,2,1,2,2,4,4,2,1,1,5,3,1,4,2,2,3,4,3,3,2,3,2,4,2,4,2,1,3};
        new Three().waysToMakeFair(a);
    }
}

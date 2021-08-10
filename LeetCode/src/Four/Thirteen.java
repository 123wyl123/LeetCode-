package Four;

public class Thirteen {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3)
        {
            return 0;
        }
        int l=0;
        int r=1;
        int temp=nums[r]-nums[l];
        r++;
        int sum=0;
        while(r<nums.length)
        {
            if(nums[r]-nums[r-1]==temp)
            {
                r++;
            }else
            {
                int tempo= r-l;
                if(tempo>=3)
                {
                    sum=sum+dfs(tempo);

                }
                l=r-1;
                temp=nums[r]-nums[r-1];
                r++;
            }

        }
        sum =sum+dfs(r-l);
        return sum;

    }
    public int dfs(int aa)
    {   int su=0;
        for(int i=1;i<=aa-2;i++)
        {
            su+=i;
        }
        return su;
    }
}
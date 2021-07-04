package Six;

public class FourtyFive {
    public int[] findErrorNums(int[] nums) {
        int a[]=new int[2];
        int l=1;
        int r=nums.length;
        while(l<=r)
        {
            int temp =l;
            if(nums[l-1]==-1)
            {   l++;
                continue;
            }
            while(nums[l-1]!=l)
            {
                int ex=nums[l-1];
                if(nums[ex-1]==ex)
                {
                    a[0]=ex;
                    nums[ex-1]=-1;
                }
                nums[l-1]=nums[ex-1];
                nums[ex-1]=ex;
                if(nums[l-1]==-1)
                {
                    break;
                }
            }
            l++;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==-1)
            {   a[1]=i+1;
                break;
            }
        }
        return a;
    }
}
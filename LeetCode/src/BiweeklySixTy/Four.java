package BiweeklySixTy;

public class Four {
    public int findMiddleIndex(int[] nums) {
        int arr[]=new int[nums.length];
        if (arr.length==1)
        {
            return 0;
        }
        arr[0]=nums[0];

        for (int i = 1; i <nums.length ; i++) {
            arr[i]=arr[i-1]+nums[i];
        }
        int num=-1;
        for (int i = 0; i <nums.length ; i++) {
            if (i==0)
            {
                if (arr[arr.length-1]-nums[0]==0)
                {
                    return 0;
                }
            }else
            {
            if (arr[arr.length-1]-arr[i]==arr[i-1])
            {
                return i;
            }
            }
        }
        return -1;
    }
}


package Three;

public class TwentySeven {
    public int countRangeSum(int[] nums, int lower, int upper) {
        if (nums.length==0)
        {
            return 0;
        }
       long arr[] =  new long[nums.length];
        int k=0;
        arr[0] = nums[0];
        if (arr[0]>=lower&&arr[0]<=upper)
        {
            k++;
        }
        for (int i = 1; i <nums.length ; i++) {
            arr[i]=arr[i-1]+nums[i];
            if (arr[i]>=lower&&arr[i]<=upper)
            {
                k++;
            }
        }
        for (int i = 0; i <nums.length -1; i++) {
            for (int j = i+1; j <nums.length ; j++) {

                if (arr[j]-arr[i]>=lower&&arr[j]-arr[i]<=upper)
                {
                    k++;
                }
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int a[] ={-2,5,-1};
        new TwentySeven().countRangeSum(a,-2,2);
    }
}

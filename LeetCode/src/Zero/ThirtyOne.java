package Zero;

public class ThirtyOne {
    public void nextPermutation(int[] nums) {


        int j;
        for ( j = nums.length-1; j >0 ; j--) {
            if (nums[j]<=nums[j-1])
            {
                continue;
            }else
            {
                break;
            }
        }
        if (j==0)
        {
            for (int i = nums.length; i >0 ; i--) {
                for (int k = 0; k <i-1 ; k++) {
                    if (nums[k]>nums[k+1])
                    {  int temp1 = nums[k];
                        nums[k] = nums[k+1];
                        nums[k+1] = temp1;
                    }
                }
            }
        }else
        {   int min =j;
            for (int i = j; i <nums.length ; i++) {
                if (nums[i]>nums[j-1]&&nums[i]<nums[min])
                {
                   min = i;
                }
            }
            int temp = nums[min];
            nums[min] = nums[j-1];
            nums[j-1] = temp;
            for (int i = nums.length-j; i >=0 ; i--) {
                for (int k = j; k <i+j-1 ; k++) {
                    if (nums[k]>nums[k+1])
                    {   temp = nums[k];
                        nums[k] = nums[k+1];
                        nums[k+1] = temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
       int a[] = {3,2,1};
        new ThirtyOne().nextPermutation(a);
    }
}

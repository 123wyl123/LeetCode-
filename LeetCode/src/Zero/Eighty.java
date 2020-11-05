package Zero;

public class Eighty {
    public int removeDuplicates(int[] nums) {
        if (nums.length <=2)
        {
            return nums.length;
        }
        boolean flag = true;
        int k =0;
        for (int i = 0; i <nums.length-1 ; i++) {
            if (nums[i]==nums[i+1]&&flag)
            {   nums[k++] = nums[i];
                flag = false;

            }else if (nums[i]!=nums[i+1])
            {
                nums[k++] = nums[i];
                flag=true;
            }else
            {

            }
        }
        if (nums[nums.length-1]!=nums[nums.length-2])
        {
          nums[k++] = nums[nums.length-1];
        }else if(!flag)
        {
            nums[k++] = nums[nums.length-1];
        }
        return k;
    }
}

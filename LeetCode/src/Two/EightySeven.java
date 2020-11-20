package Two;

public class EightySeven {
    public int findDuplicate(int[] nums) {
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]==i+1)
            {
                continue;
            }else
            {
              while (nums[i]!=i+1)
              {
                  int num = nums[i]-1;
                   int temp = nums[num];
                   if (temp==nums[i])
                   {
                       return temp;
                   }
                   nums[num] = nums[i];
                   nums[i] = temp;
              }
            }
        }
        return -1;
    }
}

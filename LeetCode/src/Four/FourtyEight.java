package Four;

import java.util.LinkedList;
import java.util.List;

public class FourtyEight {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> integers = new LinkedList<>();


        for (int i = 0; i <nums.length ; i++) {
            while (nums[i]!=i+1&&nums[i]!=nums[nums[i]-1])
            {
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;

            }
        }
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]!=i+1)
            {
                integers.add(i+1);
            }
        }
        return integers;
    }
}

package Four;


import java.util.LinkedList;
import java.util.List;

public class FourtyTwo {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> integers = new LinkedList<>();


        for (int i = 0; i <nums.length ; i++) {
            while (i<nums.length&&nums[i]!=i+1&&nums[i]!=nums[nums[i]-1])
            {
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;

            }
        }
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]!=i+1)
            {
                integers.add(nums[i]);
            }
        }
        return integers;
    }

    public static void main(String[] args) {
        int a[] ={2,1};
        new FourtyTwo().findDuplicates(a);
    }
}

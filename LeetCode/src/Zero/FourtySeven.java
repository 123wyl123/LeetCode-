package Zero;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class FourtySeven {
    HashSet<LinkedList<Integer>> a;
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        a = new HashSet<>();
        List<List<Integer>> b;
        b = new LinkedList<>();
        h(nums,0,nums.length,new LinkedList<>());
        for (LinkedList<Integer> integers : a) {
            b.add(integers);
        }
        return b;
    }
    public void h(int[] nums,int i ,int k ,LinkedList<Integer> integers)
    {
        if (i==k)
        {
            a.add(new LinkedList<>(integers));
            return;
        }
        for (int j = i; j <nums.length ; j++) {
          
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            integers.add(nums[i]);
            h(nums,i+1,k,integers);
            integers.removeLast();
            temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;

        }

    }

    public static void main(String[] args) {
        int a[] = {1,1,2};
        new FourtySeven().permuteUnique(a);
    }
}

package Zero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FourtySix {
    List<List<Integer>> lists;
    int n;
    public List<List<Integer>> permute(int[] nums) {
            lists = new ArrayList<>();
            n=nums.length;
        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            integers.add(nums[i]);
        }

        god(integers,0);
        return lists;
    }
    public void god(ArrayList<Integer> nums,int l )
    {
        if(l==n)
        {

            lists.add(new ArrayList<Integer>(nums));
            return;
        }
        for (int i = l; i <n ; i++) {
            Collections.swap(nums, l, i);
            god(nums,l+1);
            Collections.swap(nums, l, i);
        }

        return;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3};
        new FourtySix().permute(a);
    }
}

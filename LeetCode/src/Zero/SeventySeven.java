package Zero;

import java.util.ArrayList;
import java.util.List;

public class SeventySeven {
    List<List<Integer>> lists;
    public List<List<Integer>> combine(int n, int k) {
        lists = new ArrayList<>();
        int nums[] = new int[n];
        for (int i = 0; i <n ; i++) {
            nums[i] = i+1;
        }
        ArrayList<Integer> integers = new ArrayList<>();
        god(integers,0,k,nums);
        return lists;
    }
    public void god(ArrayList nums,int l,int k,int[] nums1)
    {
        if(nums.size()==k)
        {
            lists.add(new ArrayList<>(nums));
            return;
        }
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = l; i <nums1.length ; i++) {
            nums.add(nums1[i]);
            god(nums,i+1,k,nums1);
            nums.remove(nums.size()-1);
        }
        return;
    }

    public static void main(String[] args) {
        new SeventySeven().combine(4, 2);

    }
}

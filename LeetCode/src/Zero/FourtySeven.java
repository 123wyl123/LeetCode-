package Zero;

import java.util.*;

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
            return ;
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
    boolean[] vis;

    public List<List<Integer>> permuteUnique1(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> perm = new ArrayList<Integer>();
        vis = new boolean[nums.length];
        Arrays.sort(nums);
        backtrack(nums, ans, 0, perm);
        return ans;
    }

    public void backtrack(int[] nums, List<List<Integer>> ans, int idx, List<Integer> perm) {
        if (idx == nums.length) {
            ans.add(new ArrayList<Integer>(perm));
            return;
        }
        for (int i = 0; i < nums.length; ++i) {
            if (vis[i] || (i > 0 && nums[i] == nums[i - 1] && !vis[i - 1])) {
                continue;
            }
            perm.add(nums[i]);
            vis[i] = true;
            backtrack(nums, ans, idx + 1, perm);
            vis[i] = false;
            perm.remove(idx);
        }
    }
}

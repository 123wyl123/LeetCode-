package Zero;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Ninety {
    HashSet<List<Integer>> a;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
     a = new HashSet<>();
     dfs(nums,new LinkedList<>(),0);
     List<   List<Integer>> bb=    new LinkedList<>();
        for (List<Integer> list : a) {
            bb.add(list);
        }
        return bb;
    }
    public void dfs(int nums[], LinkedList <Integer> b,int n )
    {
        if (n==nums.length)
        {
            List<Integer> list = new LinkedList<Integer>(b);
            a.add(list);
            return;
        }
        for (int i = n; i <nums.length ; i++) {
            b.add(nums[i]);
            dfs(nums,b,i+1);
            b.removeLast();
        }
        a.add(new LinkedList<Integer>(b));
    }


}

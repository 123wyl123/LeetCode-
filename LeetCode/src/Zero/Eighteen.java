package Zero;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Eighteen {

    List<List<Integer>> a1;
    HashSet<List<Integer>> a;
    int temp1;
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        a = new HashSet<>();
        if (nums.length<4)
        {
            return new LinkedList<>();
        }
        temp1 = target;
        dfs(nums,0,0,new LinkedList<>());
        a1 = new LinkedList<>();
        for (List<Integer> list : a) {
            a1.add(list);
        }
        return a1;
    }
    void dfs(int[] nums,int temp,int n,LinkedList<Integer> b)
    {
        if (b.size()==4)
        {   if (temp==temp1)
        {
            a.add(new LinkedList<>(b));
            return;
        }

            return;


        }
        for (int i = n; i <nums.length ; i++) {
            b.add(nums[i]);
            temp+=nums[i];
            if (temp>temp1&&nums[i+1]>0)
            {  temp-=nums[i];
                b.removeLast();
                return;

            }
            dfs(nums,temp,i+1,b);
            temp-=nums[i];
            b.removeLast();
        }
    }

    public static void main(String[] args) {
      int a[]= {1,-2,-5,-4,-3,3,3,5};

        new Eighteen().fourSum(a,-11);
    }
}

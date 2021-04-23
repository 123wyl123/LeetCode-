package Three;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SixtyEIght {
    LinkedList<Integer> b;
    public List<Integer> largestDivisibleSubset(int[] nums) {
        b= new LinkedList<>();
        Arrays.sort(nums);
        dfs(nums,nums.length,0,new LinkedList<>());
        return b;
    }
    public void dfs(int nums[], int n, int m, LinkedList<Integer> a)
    {
        if (m==n)
        {
            if (a.size()>b.size())
            {
                b= new LinkedList<>(a);
            }
            return;
        }
        if (b.size()>a.size()+n-m)
        {
            return;
        }
        for (int i = m; i <n ; i++) {
            if (a.size()==0)
            {
                a.addLast(nums[i]);
                dfs(nums,n,i+1,a);
                a.removeLast();
            }else if (nums[i]%a.getLast()==0||a.getLast()%nums[i]==0)
            {
                a.addLast(nums[i]);
                dfs(nums,n,i+1,a);
                a.removeLast();
            }
        }
        if (a.size()>b.size())
        {
            b= new LinkedList<>(a);
        }
        return;
    }


}

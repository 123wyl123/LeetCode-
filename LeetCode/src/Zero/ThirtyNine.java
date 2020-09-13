package Zero;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThirtyNine {
    List<List<Integer>> a;
    int temp;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        a=new LinkedList<>();
        temp = target;
        LinkedList<Integer> integers = new LinkedList<>();
        com(candidates,0,integers,0);

        return a;



    }
    public void com(int [] candidates,int target,LinkedList<Integer> integers,int n)
    {
        if(target>temp)
        {
            return;
        }else if(target==temp)
        {
        a.add(new LinkedList<>(integers));
        return;
        }
        for (int i = n; i <candidates.length ; i++) {
            target+=candidates[i];
            if(target>temp)
            {
                target-=candidates[i];
                return;
            }else
            {
                integers.add(candidates[i]);
                com(candidates,target,integers,i);
                integers.removeLast();
                target-=candidates[i];
            }


        }

    }

    public static void main(String[] args) {
     int aa[]=   {2,3,6,7};
        new ThirtyNine().combinationSum(aa,7);
    }
}

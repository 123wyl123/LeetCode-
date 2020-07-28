package Zero;

import java.util.ArrayList;
import java.util.List;

public class SeventyEight {
    List<List<Integer>> linkedLists ;
    public List<List<Integer>> subsets(int[] nums) {
        linkedLists = new ArrayList<>();
        List<Integer> objects = new ArrayList<>() ;
        search(nums,0,objects);
    return linkedLists;
    }
    public List<Integer> search(int[] nums,int n,List a)
    {

       List<Integer> objects = new ArrayList<>();
        objects = a ;
        if(n==nums.length)
        {

            linkedLists.add(new ArrayList<>(objects));
            return null;
        }
        for (int i = n; i <nums.length ; i++) {

            search(nums,i+1,new ArrayList(a));
            a.add(nums[i]);
        }
        linkedLists.add(new ArrayList<>(objects));
        return null;
    }

    public static void main(String[] args) {
        int[]a = {1,2,3};
        new SeventyEight().subsets(a);
    }
}

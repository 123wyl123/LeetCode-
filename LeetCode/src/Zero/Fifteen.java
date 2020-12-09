package Zero;

import java.util.*;

public class Fifteen {
    HashSet<LinkedList<Integer>> a ;
    public List<List<Integer>> threeSum(int[] nums) {
       a = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i <nums.length-2 ; i++) {
            if (i!=0&&nums[i]==nums[i-1])
            {
                continue;
            }
            for (int j = i+1; j <nums.length-1 ; j++) {
             if (j!=i+1&&nums[j]==nums[j-1])
             {
                 continue;
             }
                if (nums[i]+nums[i+1]+nums[i+2]>0)
                {
                    break;
                }else
                {
                    int temp = -nums[i]-nums[j];
                    int l=j+1;
                    int r= nums.length-1;
                    if (nums[l]>temp)
                    {
                        break;
                    }
                    while (l<=r)
                    {
                        int mid = (l+r)/2;
                        if (nums[mid]>temp)
                        {
                            r = mid-1;
                        }else if (temp>nums[mid])
                        {
                            l = mid+1;
                        }else
                        {
                            LinkedList<Integer> integers = new LinkedList<>();
                            integers.addLast(nums[i]);
                            integers.addLast(nums[j]);
                            integers.addLast(nums[mid]);
                            a.add(integers);
                            break;
                        }
                    }
                }
            }
        }
        List<List<Integer>> ab = new LinkedList<>();
        for (List<Integer> list : a) {
            ab.add(list);
        }
        return ab;
    }

    public static void main(String[] args) {
      int aa[] =  {-1,0,1,2,-1,-4};
        new Fifteen().threeSum(aa);
    }
}

package Zero;

import java.util.Arrays;

public class Sixteen {
    public int threeSumClosest(int[] nums, int target) {
        int min =100000;
        int sum;
        Arrays.sort(nums);

        int k,l;
        for (int i = 0; i <nums.length ; i++) {

           k=i+1;
           l=nums.length-1;
           while (k<l)
           {
              sum = nums[i]+nums[k]+nums[l];
              if(sum==target)
              {
                  return target;
              }
              if(Math.abs(sum-target)<Math.abs(min-target))
              {
                  min = sum;
                  if (sum<target)
                  {    k++;
                      while (k<l&&nums[k]==nums[k-1])
                      {
                         k++;
                      }
                  }
                  if (sum>target)
                  {    l--;
                      while (k<l&&nums[l]==nums[l+1])
                      {
                          l--;
                      }
                  }
              }
        }



    }

      return min;
   
}

    public static void main(String[] args) {
        int[] a= {-1,2,1,-4};
        new Sixteen().threeSumClosest(a,1);
    }
    }

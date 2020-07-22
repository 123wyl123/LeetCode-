package Two;

import java.util.ArrayList;

public class Nine {
    public int minSubArrayLen(int s, int[] nums) {

        int j=1;
        int sum = 0;
        int k =0;
        int min =0;
        for (int i = 0; i <nums.length+1 ;) {


            if(sum<s)
            {
                sum+=nums[i];
                i++;
            }
            else
            {   if(min==0)
            {
                min = i-k;
            } else  if(i-k<min)
            {
                min = i-k;
            }

                sum-=nums[k];
               k++;
            }
            if(i==nums.length&&sum<s)
            {
                break;
            }
        }
    return min;

    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayLists = new ArrayList<>();
        arrayLists.add(1);
        int a=    arrayLists.get(0);
        a++;
        System.out.println(arrayLists.get(0));
    }


}

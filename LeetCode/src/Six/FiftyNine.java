package Six;

import java.util.HashMap;

public class FiftyNine {
    public boolean isPossible(int[] nums) {
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        int length = nums.length;
        int num = nums[length -1];

        for (int i = 0; i <length ; i++) {
            integerIntegerHashMap.put(nums[i],integerIntegerHashMap.getOrDefault(nums[i],0)+1);
        }


        int temp =0;
        for (int i = nums[0]; i <=num; i++) {
            Integer integer ;
            if (integerIntegerHashMap.containsKey(i))
            {
                integer = integerIntegerHashMap.get(i);
            }else
            {
                continue;
            }

            if (integer==0)
            {
                continue;
            }

            if (integer<0)
            {
                return false;
            }


            temp = integer ;
            integerIntegerHashMap.put(i,0);

            int j;
            for ( j= i+1; j <=num ; j++) {
                Integer integer1;
                if (integerIntegerHashMap.containsKey(j))
                {
                    integer1= integerIntegerHashMap.get(j);
                }else
                {
                    break;
                }

                if (j-i<3)
                {       if (integer1<temp)
                {
                    return false;
                }

                    integerIntegerHashMap.put(j,integer1-temp);
                    continue;
                }
                if (j<=num)
                {
                    int remain;
                    if (integerIntegerHashMap.containsKey(j-1))
                    {
                        remain = integerIntegerHashMap.get(j-1);
                    }else
                    {
                        break;
                    }


                    temp = Math.min(integer1-remain,temp);
                    if (temp<=0)
                    {   if (j-1-i<2)
                    {
                        return false;
                    }
                        break;
                    }
                    integerIntegerHashMap.put(j,integer1-temp);

                }
            }

            if (j-i<3)
            {

                return false;
            }

        }
        for (Integer integer : integerIntegerHashMap.keySet()) {
            if (integerIntegerHashMap.get(integer)!=0)
            {
                return false;
            }
        }
        return true;
    }


}

package Nine;

import java.util.Arrays;
import java.util.HashMap;

public class FiftyFour {
    public boolean canReorderDoubled(int[] A) {
        Arrays.sort(A);
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        int length = A.length;
        int l=0;
        for (int i = 0; i <length ; i++) {
            integerIntegerHashMap.put(A[i],integerIntegerHashMap.getOrDefault(A[i],0)+1);
            if (A[i]<0)
            {
                if(integerIntegerHashMap.containsKey(A[i]*2)&&integerIntegerHashMap.getOrDefault(A[i]*2,0)!=0)
                {integerIntegerHashMap.put(A[i]/2,integerIntegerHashMap.get(A[i]/2)-1);
                    integerIntegerHashMap.put(A[i],integerIntegerHashMap.get(A[i])-1);
                    l++;
                }
            }else
            {
                if (A[i]%2==0&&integerIntegerHashMap.getOrDefault(A[i]/2,0)!=0)
                {   integerIntegerHashMap.put(A[i]/2,integerIntegerHashMap.get(A[i]/2)-1);
                    integerIntegerHashMap.put(A[i],integerIntegerHashMap.get(A[i])-1);
                    l++;
                }
            }
        }
        return l>=length/2?true:false;
    }
    public boolean canReorderDoubled1(int[] nums) {
        int maxLength = 0;
        for (int index = 0;index<nums.length;index++)
        {
            maxLength = Math.max(maxLength,Math.abs(nums[index]));
        }
        maxLength ++;
        int[] aboveZero = new int[maxLength];
        int[] belowZero = new int[maxLength];
        for (int index=0;index<nums.length;index++)
        {
            if (nums[index]>=0)
            {
                aboveZero[nums[index]]  =  aboveZero[nums[index]]+1;
            }
            else
            {
                belowZero[-nums[index]] =  belowZero[-nums[index]]+1;
            }
        }
        if(aboveZero[0]!=0 && aboveZero[0]%2 != 0)
        {
            return  false;
        }


        for (int index =1;index<maxLength;index++)
        {
            if (aboveZero[index]!=0)
            {
                if (2*index>=maxLength || aboveZero[2*index]<aboveZero[index])
                {
                    return false;
                }
                aboveZero[2*index] = aboveZero[2*index]-aboveZero[index];
                aboveZero[index] = 0;
            }
        }
        for (int index =1;index<maxLength;index++)
        {
            if (belowZero[index]!=0)
            {
                if ((2*index) >= maxLength  || belowZero[2*index]<belowZero[index])
                {
                    return false;
                }

                belowZero[2*index] = belowZero[2*index]-belowZero[index];
                belowZero[index] = 0;
            }
        }

        return true;

    }
    public static void main(String[] args) {
        int a[] = {4,-4,4,-2,-4,-8};
        new FiftyFour().canReorderDoubled(a);
    }
}

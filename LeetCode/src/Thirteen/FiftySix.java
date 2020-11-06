package Thirteen;

import java.util.HashMap;

public class FiftySix {
    public int[] sortByBits(int[] arr) {
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            int l=0;
            int k=arr[i];
            while (k!=0)
            {
                if ((k&1)==1)
                {
                    l++;

                }
                k=k>>1;
            }
            integerIntegerHashMap.put(arr[i],l);
        }
        boolean flag = true;
        for (int i = arr.length-1; i >0 ; i--) {
            for (int j = 0; j <i ; j++) {
                if (integerIntegerHashMap.get(arr[i])>integerIntegerHashMap.get(arr[i+1]))
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = arr[i];
                    flag=false;
            }else if (integerIntegerHashMap.get(arr[i])==integerIntegerHashMap.get(arr[i+1])&&arr[i]>arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = arr[i];
                    flag = false;
                }else
                {
                    continue;
                }
        }
            if (flag)
            {
                return arr;
            }else
            {
                flag=!flag;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int a[] = {0,1,2,3,4,5,6,7,8};
        new FiftySix().sortByBits(a);
    }
}

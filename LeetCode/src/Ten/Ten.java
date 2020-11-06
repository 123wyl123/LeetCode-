package Ten;

import java.util.HashMap;

public class Ten {
    public int numPairsDivisibleBy60(int[] time) {
        int k =0;
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        for (int i = 0; i <time.length ; i++) {
            int a = time[i]%60;
            if (a==0)
            {
               if (integerIntegerHashMap.containsKey(60))
               {
                   k+=integerIntegerHashMap.get(60);
                   integerIntegerHashMap.put(60,integerIntegerHashMap.get(60)+1);
               }else
               {
                   integerIntegerHashMap.put(60,1);
               }
            }else
            {
                if (integerIntegerHashMap.containsKey(60-a))
                {
                    k+=integerIntegerHashMap.get(60-a);
                    integerIntegerHashMap.put(a,integerIntegerHashMap.getOrDefault(a,0)+1);
                }else
                {
                    integerIntegerHashMap.put(a,integerIntegerHashMap.getOrDefault(a,0)+1);
                }
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int a[] ={418,204,77,278,239,457,284,263,372,279,476,416,360,18};
        new Ten().numPairsDivisibleBy60(a);
    }
}

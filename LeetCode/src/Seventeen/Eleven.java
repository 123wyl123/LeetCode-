package Seventeen;

import java.util.HashMap;
import java.util.TreeMap;

public class Eleven {
    public int countPairs(int[] deliciousness) {
        HashMap<Integer, Long> integerIntegerHashMap = new HashMap<>();
        for (int i = 0; i <deliciousness.length ; i++) {
            integerIntegerHashMap.put(deliciousness[i],integerIntegerHashMap.getOrDefault(deliciousness[i],0L)+1);
        }
        long sum =0;
        for (Integer integer : integerIntegerHashMap.keySet()) {
            for (int i = 0; i <32 ; i++) {
                int temp = 1<<i;
          temp=      temp-integer;
                if (temp>integer)
                {
                    break;
                }else
                {
                    if (integerIntegerHashMap.containsKey(temp))
                    {
                        if (temp==integer)
                        {   if (integerIntegerHashMap.get(temp)!=1)
                        {
                            long integer1 = integerIntegerHashMap.get(temp);
                          long ii= ((integer1*(integer1-1)))/(2);
                            sum=(sum+ii)%1000000007;
                        }

                        }else
                        {
                            sum=(sum+integerIntegerHashMap.get(integer)*integerIntegerHashMap.get(temp))%1000000007;
                        }
                    }
                }
            }
        }
        return (int)(sum%1000000007);
    }


}

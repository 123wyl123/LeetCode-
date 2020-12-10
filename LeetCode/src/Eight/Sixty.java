package Eight;

import java.util.HashMap;

public class Sixty {
    public boolean lemonadeChange(int[] bills) {

        int length = bills.length;
        if (length==0)
        {
            return true;
        }
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        int bill = bills[length - 1];
        for (int i = 0; i <length ; i++) {
                if (bills[i]==5)
                {
                    integerIntegerHashMap.put(bills[i],integerIntegerHashMap.getOrDefault(bills[i],0)+1);
                }else
                {   int temp = bills[i]-5;
                    for (int j = temp; j >5 ; j-=5) {
                        if (j<temp&&integerIntegerHashMap.containsKey(j)&&integerIntegerHashMap.get(j)!=0)
                        {
                            integerIntegerHashMap.put(j,integerIntegerHashMap.get(j)-1);
                            temp-=j;
                        }
                        if (temp==0)
                        {   integerIntegerHashMap.put(bills[i],1);
                            break;
                        }

                    }
                    if (temp/5<=integerIntegerHashMap.getOrDefault(5,0))
                    { integerIntegerHashMap.put(5,integerIntegerHashMap.get(5)-temp/5);
                        integerIntegerHashMap.put(bills[i],integerIntegerHashMap.getOrDefault(bills[i],0)+1);
                    }else
                    {
                        return false;
                    }

                }
        }
        return true;
    }

    public static void main(String[] args) {
        int[]a = {5,5,5,5,10,5,10,10,10,20};
        new Sixty().lemonadeChange(a);
    }
}

package Eight;

import java.util.Arrays;
import java.util.HashMap;

public class FourtySix {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        HashMap<Integer,Integer> jilu= new HashMap<Integer,Integer>();
        Arrays.sort(hand);
        if(hand.length%groupSize!=0)
        {
            return false;
        }
        for(int i =0;i<hand.length;i++)
        {
            jilu.put(hand[i],jilu.getOrDefault(hand[i],0)+1);
        }
        for(int i=0;i<hand.length;i++)
        {
            int temp = hand[i];
            if(jilu.containsKey(temp))
            {
                for(int j =0;j<groupSize;j++)
                {
                    if(jilu.containsKey(temp+j))
                    {
                        jilu.put(temp+j,jilu.get(temp+j)-1);
                    }else
                    {
                        return false;
                    }
                    if(jilu.get(temp+j)==0)
                    {
                        jilu.remove(temp+j);
                    }
                }
            }else
            {
                continue;
            }
        }

        return true;
    }
}
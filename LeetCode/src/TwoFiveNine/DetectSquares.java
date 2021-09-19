package TwoFiveNine;

import java.util.HashMap;
import java.util.HashSet;

public class DetectSquares {
    boolean flag =true;
    HashMap<Integer, HashMap<Integer,Integer>> hang;
    HashMap<Integer,HashMap<Integer,Integer>> lie;

    HashMap<Integer,HashMap<Integer,Integer>> hanghangcount;
    HashMap<Integer,HashMap<Integer,Integer>> lieliecount;
    public DetectSquares() {
        hang = new HashMap<>();
       lie=new HashMap<>();
   hanghangcount =new HashMap<>();
   lieliecount=new HashMap<>();
    }

    public void add(int[] point) {
       if (hang.containsKey(point[0]))
       {
           HashMap<Integer, Integer> integerIntegerHashMap = hang.get(point[0]);
            integerIntegerHashMap.put(point[1],integerIntegerHashMap.getOrDefault(point[1],0)+1);

       }else
       {
           HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
           integerIntegerHashMap.put(point[1],1);
           hang.put(point[0],integerIntegerHashMap);
       }
       if (lie.containsKey(point[1]))
       {
           HashMap<Integer, Integer> integerIntegerHashMap = lie.get(point[1]);
           integerIntegerHashMap.put(point[0],integerIntegerHashMap.getOrDefault(point[0],0)+1);
       }else
       {
           HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
           integerIntegerHashMap.put(point[0],1);
           lie.put(point[1],integerIntegerHashMap);
       }
        if (hanghangcount.containsKey(point[0]))
        {
            hanghangcount.remove(point[0]);
        }
        if (lieliecount.containsKey(point[1]))
        {
            lieliecount.remove(point[1]);
        }
        flag =false;
       lieliecount=null;
       hanghangcount=null;
    }

    public int count(int[] point) {
        int sum=0;
        if (hanghangcount.containsKey(point[0]))
        {
            HashMap<Integer, Integer> integerIntegerHashMap = hanghangcount.get(point[0]);
            if (integerIntegerHashMap.containsKey(point[1]))
            {
                sum =integerIntegerHashMap.get(point[1]);
            }

        }
        if (lieliecount.containsKey(point[1]))
        {
            HashMap<Integer, Integer> integerIntegerHashMap = lieliecount.get(point[1]);
            if (integerIntegerHashMap.containsKey(point[0]))
            {
                sum= sum==integerIntegerHashMap.get(point[0])?sum:0;
            }
            if (sum!=0)
            {
                return sum;
            }
        }

        if (!lie.containsKey(point[1])||!hang.containsKey(point[0]))
        {
            return 0;
        }
        HashMap<Integer, Integer> integerIntegerHashMap = lie.get(point[1]);
        HashMap<Integer, Integer> integerIntegerHashMap2 = hang.get(point[0]);

        int x=point[0];
        int y=point[1];

        for (Integer integer : integerIntegerHashMap2.keySet()) {
            if (integer==y)
            {
                continue;
            }
            Integer integer2 = integerIntegerHashMap2.get(integer);
            for (Integer integer1 : integerIntegerHashMap.keySet()) {
                if (integer1==x)
                {
                    continue;
                }
                if (Math.abs(integer-y)==Math.abs(integer1-x))
                {
                    if (hang.containsKey(integer1))
                    {
                        HashMap<Integer, Integer> integerIntegerHashMap1 = hang.get(integer1);
                        if (integerIntegerHashMap1.containsKey(integer))
                        {
                            sum+=integer2*integerIntegerHashMap.get(integer1)*integerIntegerHashMap1.get(integer);
                        }
                    }
                }
            }
        }
        HashMap<Integer,Integer> hangmap=new HashMap<>();
        HashMap<Integer,Integer> liemap=new HashMap<>();
        if (hanghangcount.containsKey(point[0]))
        {
            hangmap = hanghangcount.get(point[0]);
        }
        if (lieliecount.containsKey(point[1]))
        {
            liemap=lieliecount.get(point[1]);
        }
        hangmap.put(point[1],sum);
        liemap.put(point[0],sum);
        hanghangcount.put(point[0],hangmap);
        lieliecount.put(point[1],liemap);
        return sum;
    }



    public static void main(String[] args) {
        DetectSquares detectSquares = new DetectSquares();
        int a[]={3,10};
        int a1[]={11,2};
        int a2[]={3,2};
        int a3[]={11,10};
        int a4[]={14,8};
        int a5[]={11,2};
        int a6[]={11,10};
        detectSquares.add(a);
        detectSquares.add(a1);
        detectSquares.add(a2);
        detectSquares.count(a3);
        detectSquares.count(a4);
        detectSquares.add(a5);
        detectSquares.count(a6);

    }
}

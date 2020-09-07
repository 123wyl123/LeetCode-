package TwoZeroFive;

public class Three {
    public int minCost(String s, int[] cost) {
        int length = s.length();
        int sum=0;
        int temp=0;
        int max = 0;
        for (int i = 0; i <length-1 ; i++) {
            if(s.charAt(i)==s.charAt(i+1))
            {
               temp = temp+cost[i];
               max =Math.max(max,cost[i]);
            }else
            {   if(temp!=0)
            { max =Math.max(max,cost[i]);
                sum+=temp+cost[i]-max;
            }

                temp=0;
                max = 0;
            }

        }
        if(s.charAt(length-1)!=s.charAt(length-2))
        {
            return sum;
        }else
        {
            temp = temp+cost[length-1];
            max =Math.max(max,cost[length-1]);
        }
        sum+=temp-max;
        return sum;
    }


}


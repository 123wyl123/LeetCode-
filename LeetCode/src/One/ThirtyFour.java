package One;

public class ThirtyFour {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int length = gas.length;
        int length1 = length*2;
        int end[]=  new int[length*2];

        end[length1-1] = gas[length-1] -cost[length-1];
        int max =end[length1-1];
        int maxi=length-1;
        for (int i = length1-2; i >=0 ; i--) {
            end[i] = gas[i%length] - cost[i%length];
            if (end[i+1]>0)
            {
                end[i]+=end[i+1];

            }
            if (max<end[i])
            {
                max = end[i];
                maxi = i;
            }
        }
        int sum =0;
        int k =maxi%length;
        while (k!=(maxi+length))
        {
            sum+=(gas[k%length]-cost[k%length]);
            k++;
            if (sum<0)
            {
                return -1;
            }
        }
        return maxi%length;
    }


}

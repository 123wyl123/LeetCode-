package FiftyFour;

public class FiftySeven {

    public int numOfSubarrays(int[] arr) {

        int sum =0;
        int even =0;
        int res =1;
        int ans =0;
        for (int i = 0; i <arr.length ; i++) {
           sum+=arr[i];
           if(sum%2==0)
           {
                res++;
                ans+=even;
           }else
           {
               even++;
               ans+=res;
           }
            ans%=1000000007;
        }


        return ans;

    }


}

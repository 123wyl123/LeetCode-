package Eleven;


public class Thirty {
    public int mctFromLeafValues(int[] arr) {
        int dp[][] = new int[arr.length][arr.length];
        int max[][] = new int[arr.length][arr.length];
        max[0][0] =arr[0];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j <arr.length ; j++) {
                if (j==0)
                {
                    continue;
                }
                max[i][j] = Math.max(arr[j],max[i][j-1]);

            }
        }

        for (int i = 2; i <=arr.length ; i++) {
            for (int j = 0; j <arr.length-i+1 ; j++) {
                int k = j+i-1;
                dp[j][k] = Integer.MAX_VALUE;
                for (int l = j; l <arr.length&&l<k&&k<arr.length ; l++) {
                dp[j][k] = Math.min(dp[j][l]+dp[l+1][k]+max[j][l]*max[l+1][k],dp[j][k]);
                }
            }
        }
        return dp[0][arr.length-1];
    }
    public int mctFromLeafValues1(int[] arr) {
        int ans=0;
        int i=0;
        for(int j=1; j<arr.length;j++){
            while(i>=0 && arr[j]>=arr[i]){
                if(i==0){
                    ans+=arr[i]*arr[j];
                }else {
                    ans+=arr[i]*Math.min(arr[i-1],arr[j]);
                }
                i--;
            }
            i++;
            arr[i]=arr[j];
        }
        for(int j=1;j<=i;j++){
            ans+=arr[j]*arr[j-1];
        }
        return ans;
    }
    public static void main(String[] args) {
       int a[]  = {6,2,4,3};
        new Thirty().mctFromLeafValues1(a);
    }
}

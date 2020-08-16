package TwoZeroTwo;

public class One {
    public boolean threeConsecutiveOdds(int[] arr) {
        int k=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]%2==0)
            {
                k=0;
            }else
            {
                k++;
            }
            if(k==3)
            {
                return true;
            }
        }
        return false;
    }
}

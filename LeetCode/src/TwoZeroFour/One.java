package TwoZeroFour;

public class One {
    public boolean containsPattern(int[] arr, int m, int k) {
        int x =0;
        for (int i = 0; i <arr.length ; i++) {
            int len = m;
            int kk =i;
            int temp = m+i;
            for (int j = m+i; j <arr.length ;j++ ) {
                if(arr[kk]==arr[j])
                {
                    kk++;

                }else
                {
                    break;
                }
                if(kk-i==m)
                {
                    x++;
                    kk=i;
                }
            }
            if(x-1>=k)
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
      int[] a= {1,2,1,2,1,3};
        new One().containsPattern(a,2,3);
    }
}

package nowcoder.Eight;

import java.util.Arrays;

public class two {
    public int solve (int n, int x, int[] a) {
        // write code here
        // write code here
        Arrays.sort(a);
        int sum = 0;
        int m= a.length;
        int k=0;
        for (int i = a.length-1; i >=0 ; i--) {
            sum+=a[i];
            if(sum>=x)
            {    sum-=x;
                k++;
            } else
            {
                return k;
            }
        }
        return k;
    }


    public static void main(String[] args) {
        int a[] ={9,4,9};
        new two().solve(3,7,a);

    }
}

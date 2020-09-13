package LCCUP;

import java.util.Arrays;

public class Two {
    public int breakfastNumber(int[] staple, int[] drinks, int x) {
        Arrays.sort(staple);
        Arrays.sort(drinks);
        int length = drinks.length;
        int length1 = staple.length;
        int r = length1;
        int l = 0;
        long sum =0;
        for (int i =0 ; i <length ; i++) {

            while (l<r)
            {
                int mid = ((r-l)/2+l);
                if (staple[mid]+drinks[i]<=x)
                {
                    l=mid+1;
                }else
                {
                    r=mid;
                }
            }
            sum=(sum+(long)r)%1000000007;
            l=0;
        }
   return (int)sum;
    }

    public static void main(String[] args) {
        int a[]= {2,1,1};
        int [] drinks = {8,9,5,1};
        int x = 9;
        new Two().breakfastNumber(a,drinks,9);
    }
}

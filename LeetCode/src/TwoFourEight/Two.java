package TwoFourEight;

import java.util.Arrays;

public class Two {
    public int eliminateMaximum(int[] dist, int[] speed) {
    int[] temp=new int[dist.length];
        for (int i = 0; i <dist.length ; i++) {
            temp[i]=dist[i]/speed[i]+(dist[i]%speed[i]==0?0:1);
        }
        Arrays.sort(temp);

        for (int i = 0; i <temp.length ; i++) {
                if (i>=temp[i])
                {
                    return i;
                }
        }
        return dist.length;
    }

    public static void main(String[] args) {
        int a[]={1,1,2,3};
        int b[]={1,1,1,1};
        new Two().eliminateMaximum(a,b);
    }
}

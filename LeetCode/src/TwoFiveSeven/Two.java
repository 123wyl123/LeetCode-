package TwoFiveSeven;

import java.util.Arrays;
import java.util.Comparator;

public class Two {
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0]==o2[0])
                {
                    return o1[1]-o2[1];
                }
                return o2[0]-o1[0];
            }
        });
        int max =-1;
        int sum=0;
        for (int i = 0; i <properties.length ; i++) {
            if (properties[i][1]<max)
            {
                sum++;
            }else
            {
                max = properties[i][1];
            }
        }
        return sum;
    }
}

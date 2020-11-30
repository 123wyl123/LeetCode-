package Nine;

import java.util.Arrays;

public class SeventySix {
    public int largestPerimeter(int[] A) {
        if (A.length<3)
        {
            return 0;
        }
        Arrays.sort(A);
        int length = A.length;

        for (int j = length-1; j >=2 ; j--) {
            if (A[j]<A[j-1]+A[j-2])
            {
                return A[j]+A[j-1]+A[j-2];
            }
        }
      return 0;
    }
}

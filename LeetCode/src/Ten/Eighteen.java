package Ten;

import java.util.LinkedList;
import java.util.List;

public class Eighteen {
    public List<Boolean> prefixesDivBy5(int[] A) {
        int length = A.length;
        long sum =0;
        LinkedList<Boolean> booleans = new LinkedList<>();
        for (int i = 0; i <length ; i++) {
            sum=(sum*2+A[i])%10;
            booleans.addLast(sum%5==0);
        }
        return booleans;
    }
}


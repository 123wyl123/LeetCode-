package Nine;

public class FourtyOne {
    public boolean validMountainArray(int[] A) {
        if(A.length<3)
        {
            return false;
        }
        boolean flag = false;
        if (A[1]>A[0])
        {
            flag = false;
        }else
        {
            return false;
        }
        int i = 2;
        while (i<A.length&&A[i]>A[i-1])
        {
            i++;
        }
        if (i==A.length)
        {
            return false;
        }
        while (i<A.length&&A[i]<A[i-1])
        {
            i++;
        }
        if (i<A.length)
        {
            return false;
        }
        return true;
    }
}

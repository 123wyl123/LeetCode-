package Eight;

public class NinetySix {
    public boolean isMonotonic(int[] A) {
        int r=0;
        int l= A.length-1;
        boolean flag =true;
        while(r<l)
        {
            if(A[r]==A[r+1])
            {
                r++;
            }else
            {
                if(A[r]>A[r+1])
                {
                    flag = true;
                }else
                {
                    flag = false;
                }
                break;
            }
        }
        if(flag)
        {
            while(r<l)
            {
                if(A[r]>=A[r+1])
                {
                    r++;
                }else{
                    return false;
                }
            }
        }else
        { while(r<l)
        {
            if(A[r]<=A[r+1])
            {
                r++;
            }else{
                return false;
            }
        }

        }
        return true;
    }
}

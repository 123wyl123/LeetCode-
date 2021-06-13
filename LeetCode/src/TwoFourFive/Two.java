package TwoFourFive;

public class Two {
    public int maximumRemovals(String s, String p, int[] removable) {
    int len = removable.length;
    int lo =0,hi=len-1;
    int res=-1;
    while (lo<=hi)
    {
        int mid = lo+(hi-lo)/2;
        if (isValids(s,p,removable,mid))
        {
            res=mid;
            lo=mid+1;
        }else
        {
            hi=mid-1;
        }
    }
    return res+1;
    }

    public boolean isValids(String  s , String  p ,int [] removable,int mid)
    {
        char[] chars = s.toCharArray();
        for (int i = 0; i <=mid ; i++) {
            chars[removable[i]]=' ';
        }
        char[] chars1 = p.toCharArray();
        int l=0;
        int r =0;
        for (int i = 0; i <p.length() ; i++) {
            boolean flag =true;
            for (int j = r; j <chars.length ; j++) {
                if (chars1[i]==chars[j])
                {   flag  =false;
                    r=j+1;
                    break;
                }
            }
            if (flag)
            {
                return false;
            }
        }
        return true;
    }
}
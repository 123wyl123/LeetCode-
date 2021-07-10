package FiftySix;

public class Three {
    public boolean sumGame(String num) {
        char[] chars = num.toCharArray();
        int l = 0;
        int r = 0;
        int lsum = 0;
        int rsum = 0;
        for (int i = 0; i < num.length() / 2; i++) {
            if (chars[i] == '?') {
                l++;
            } else {
                lsum += chars[i] - '0';
            }
        }
        for (int i = num.length() / 2; i < num.length(); i++) {
            if (chars[i] == '?') {
                r++;
            } else {
                rsum += chars[i] - '0';
            }
        }
        if ((l+r)%2==1)
        {
            return true;
        }
        if (l == 0 && r == 0)
        {
            return lsum!=rsum;
        }
        if (l>r)
        {
             l=l-r;
            if (l%2==0)
            {
                if (lsum+(l/2)*9==rsum)
                {
                    return false;
                }else
                {
                    return true;
                }
            }else
            {
                return true;
            }
        }else
        {
             r= r-l;
             if (r%2==0)
             {
                 if (lsum==rsum+(r/2)*9)
                 {
                     return false;
                 }else
                 {
                     return true;
                 }
             }
        }
        return true;
    }
}

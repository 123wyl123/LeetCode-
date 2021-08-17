package Five;

public class FIftyOne {
    public boolean checkRecord(String s) {
        char[] chars = s.toCharArray();
        int a =0;
        int l=0;
        for (int i = 0; i <chars.length ; i++) {
            if (chars[i]=='A')
            {
                a++;
                l=0;
            }else if (chars[i]=='L')
            {
                l++;
            }else
            {
                l=0;
            }
            if (l==3)
            {
                return false;
            }
        }
        if (a<2)
        {
            return true;
        }
        return false;
    }
}

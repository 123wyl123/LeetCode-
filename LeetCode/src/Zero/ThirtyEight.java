package Zero;

public class ThirtyEight {
    public String countAndSay(int n) {
        if (n==0)
        {
            return "";
        }
        if (n==1)
        {
            return "1";
        }else if (n==2)
        {
            return "11";
        }
        String a[] = new String[n];
        a[0] = "1";
        int l =0;
        a[1] = "11";
        for (int i = 2; i <n ; i++) {

            String s = a[i - 1];
            char[] chars = s.toCharArray();
            a[i] = "";
            for (int j = 0; j <s.length()-1;  j++) {
                if (chars[j]==chars[j+1])
                {   l++;
                    continue;
                }else
                {   l++;
                    a[i]+=l+""+chars[j];
                    l=0;
                }
            }
            if (l!=0)
            {   l++;
                a[i]+=l+""+chars[chars.length-1];
                l=0;
            }else
            {
                a[i]+=1+""+chars[chars.length-1];
            }
        }
        return a[n-1];
    }

    public static void main(String[] args) {
        new ThirtyEight().countAndSay(4);
    }
}

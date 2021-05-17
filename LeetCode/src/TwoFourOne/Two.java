package TwoFourOne;

public class Two {
    public int minSwaps(String s) {
        char[] chars = s.toCharArray();
        char[] a= new char[s.length()];
        char[] b= new char[s.length()];
        int pre =0;
        int sum=0;
        for (int i = 0; i <chars.length ; i++) {
            a[i]= (char) ('0'+pre);
            sum+=pre;
            pre=pre^1;
        }
        int sum1=0;
        pre=1;
        for (int i = 0; i <chars.length ; i++) {
            b[i]=(char)('0'+pre);
            sum1+=pre;
            pre=pre^1;
        }
        int temp=0;
        for (int i = 0; i <a.length ; i++) {
            sum-=chars[i]-'0';
            if (a[i]!=chars[i])
            {
                temp++;
            }
        }
        if (temp%2!=0||sum!=0)
        {
            temp=Integer.MAX_VALUE;
        }
        int temp1=0;
        for (int i = 0; i <b.length ; i++) {
            sum1-=chars[i]-'0';
            if (b[i]!=chars[i])
            {
                temp1++;
            }
        }
        if (temp1%2==0&&sum1==0)
        {
            return Math.min(temp1/2,temp/2);
        }else
        {
            if (temp==Integer.MAX_VALUE)
            {
                return -1;
            }
            return temp/2;
        }

    }

    public static void main(String[] args) {
        new Two().minSwaps("111000");

    }
}

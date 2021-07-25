package TwoFiveOne;

public class Two {
    public String maximumNumber(String num, int[] change) {
        char[] chars = num.toCharArray();
        int  flag =0;
        for (int i = 0; i <num.length() ; i++) {
            if (change[chars[i]-'0']>=chars[i]-'0')
            {
                if (change[chars[i]-'0']==chars[i]-'0')
                {
                    continue;
                }else
                {
                    flag++;
                }
                chars[i]=(char) (change[chars[i]-'0']+'0');
            }else
            {   if (flag==0)
            {
                continue;
            }else
            {
                break;
            }

            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {

        int a[]=
        {9,8,5,0,3,6,4,2,6,8};
//        int a[]={9,8,5,0,3,6,4,2,6,8};
        new Two().maximumNumber(        "132",a);
    }
}

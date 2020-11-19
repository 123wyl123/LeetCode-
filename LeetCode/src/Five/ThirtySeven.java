package Five;

public class ThirtySeven {
    public String complexNumberMultiply(String a, String b) {
        char[] chars = a.toCharArray();
        char[] chars1 = b.toCharArray();
        int i =0;
        int j=0;
        boolean flag =true;
        int aa[] = new int[4];
        StringBuffer stringBuffer = new StringBuffer();

        int sum =0;
        int sum1 = 0;
        if (chars[i]=='-')
        {
            i++;
            flag = false;
        }
        while ('0'<=chars[i]&&chars[i]<='9')
        {
            sum= sum*10+chars[i]-'0';
            i++;
        }

        aa[0] = flag?sum:-sum;
        sum=0;
        flag = true;
        if (chars1[j]=='-')
        {
            j++;
            flag=!flag;
        }
        while ('0'<=chars1[j]&&chars1[j]<='9')
        {
            sum1= sum1*10+chars1[j]-'0';
            j++;
        }
        aa[2] = flag?sum1:-sum1;

        sum1 = 0;
        flag = true;
        while (j<chars1.length&&chars1[j]=='+')
        {
            j++;
        }

        if (chars1[j]=='-')
        {
            flag = !flag;
            j++;
        }
        while (j<chars1.length&&'0'<=chars1[j]&&chars1[j]<='9')
        {
            sum1= sum1*10+chars1[j]-'0';
            j++;
        }
        aa[3] =flag? sum1:-sum1;
        while (i<chars.length&&chars[i]=='+')
        {
            i++;
        }
        flag = true;
        sum=0;
        if (chars[i]=='-')
        {
            i++;
            flag = false;
        }
        while (i<chars.length&&'0'<=chars[i]&&chars[i]<='9')
        {
            sum= sum*10+chars[i]-'0';
            i++;
        }
        aa[1] = flag? sum:-sum;


        int sum11 = aa[0]*aa[2]-(aa[1]*aa[3]);
        int sum22 = aa[0]*aa[3]+aa[1]*aa[2];
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1.append(sum11);
        stringBuffer1.append('+');
        stringBuffer1.append(sum22);
        stringBuffer1.append('i');
        return stringBuffer1.toString();
    }


}

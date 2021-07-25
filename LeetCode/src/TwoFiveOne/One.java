package TwoFiveOne;

public class One {
    public int getLucky(String s, int k) {
        char[] chars = s.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i <s.length() ; i++) {
            if ('a'<=chars[i]&&chars[i]<='z')
            {
                stringBuffer.append((chars[i]-'a')+1);
            }else
            {
                stringBuffer.append((chars[i]-'A')+1);
            }
        }

        while (k>0)
        {k--;
            String string = stringBuffer.toString();
            char[] chars1 = string.toCharArray();
            int sum=0;
            for (int i = 0; i <chars1.length ; i++) {
                sum+=(chars1[i]-'0');
            }
            stringBuffer=new StringBuffer();
            stringBuffer.append(sum);
        }
        return Integer.valueOf(stringBuffer.toString());
    }

    public static void main(String[] args) {
        new One().getLucky("iiii",1);
    }
}

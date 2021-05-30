package TwoFourThree;

public class Two {
    public String maxValue(String n, int x) {
        char c = n.charAt(0);
        StringBuffer stringBuffer = new StringBuffer();
        if (c!='-')
        {
        boolean flag=true;
            for (int i = 0; i <n.length() ; i++) {
                if (n.charAt(i)-'0'>=x)
                {
                    stringBuffer.append(n.charAt(i));
                }else
                {   flag = false;
                    stringBuffer.append(x);

                    stringBuffer.append(n.substring(i));
                    break;
                }
            }
            if (flag)
            {
                stringBuffer.append(x);
            }
        }else if (c=='-')
        {   boolean flag = true;
            for (int i = 0; i <n.length() ; i++) {
                if (n.charAt(i)-'0'>x)
                {   flag = false;
                    stringBuffer.append(x);
                    stringBuffer.append(n.substring(i));
                    break;
                }else
                {
                    stringBuffer.append(n.charAt(i));
                }
            }
            if (flag)
            {
                stringBuffer.append(x);
            }
        }else
        {
        stringBuffer.append(n);
        stringBuffer.append(0);
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        new Two().maxValue("28824579515"
                ,8);
    }
}

package Eight;

public class FourtyFour {
    public boolean backspaceCompare(String S, String T) {
        char[] chars = S.toCharArray();
        char[] chars1 = T.toCharArray();
        int length = chars.length-1;
        int length1 = chars1.length-1;
        String s1 = "";
        String s2 = "";
        int temp=0;
        int temp1=0;
        for (int i = length; i >=0 ; i--) {
            if (chars[i]=='#')
            {
                temp++;
            }else
            {
                if (temp==0)
                {
                    s1=chars[i]+s1;
                }else
                {   temp--;
                    continue;
                }
            }
        }
        for (int i = length1; i >=0 ; i--) {
            if (chars1[i]=='#')
            {
                temp1++;
            }else
            {
                if (temp1==0)
                {
                    s2=chars1[i]+s2;
                }else
                {   temp1--;
                    continue;
                }
            }
        }
        if (s1.length()!=s2.length())
        {
            return false;
        }
        for (int i = 0; i <s1.length() ; i++) {
            if (s1.charAt(i)==s2.charAt(i))
            {
                continue;
            }else
            {
                return false;
            }
        }
        return true;

    }
    public boolean a(String T,String  S)
    {
        int s = S.length() - 1;
        int t = T.length() - 1;

        int sBack = 0;
        int tBack = 0;

        while (s >= 0 && t >= 0) {
            while (s >= 0) {
                if (S.charAt(s) == '#') {
                    sBack++;
                    s--;
                } else {
                    if (sBack == 0) {
                        break;
                    }
                    sBack--;
                    s--;
                }
            }
            while (t >= 0) {
                if (T.charAt(t) == '#') {
                    tBack++;
                    t--;
                } else {
                    if (tBack == 0) {
                        break;
                    }
                    tBack--;
                    t--;
                }
            }

            //都到了真实字符
            if (s >= 0 && t >= 0 ) {
                if (S.charAt(s) != T.charAt(t)) {
                    return false;
                }
                s--;
                t--;
            }

        }
        //对于剩余的字符串，因为全部退格后可能为空字符串，所以继续处理
        while (s >= 0) {
            if (S.charAt(s) == '#') {
                sBack++;
                s--;
            } else {
                if (sBack == 0) {
                    break;
                }
                sBack--;
                s--;
            }
        }
        while (t >= 0) {
            if (T.charAt(t) == '#') {
                tBack++;
                t--;
            } else {
                if (tBack == 0) {
                    break;
                }
                tBack--;
                t--;
            }
        }
        //都到了末尾
        if (s < 0 && t < 0) {
            return true;
        }
        //只有一个到了末尾
        return false;
    }

    public static void main(String[] args) {
        new FourtyFour().backspaceCompare("ab#c","ad#c");
    }
}

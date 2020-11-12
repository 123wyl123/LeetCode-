package One;



public class FiftyOne {
    public String reverseWords(String s) {

        char[] chars = s.toCharArray();
        String string = new String();
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = chars.length-1; i >=0 ; i--) {
            if (chars[i]!=' ')
            {
                stringBuffer.append(chars[i]);
            }else
            {
                if (stringBuffer.length()==0)
                {
                    continue;
                }else
                {
                    string+=stringBuffer.reverse();
                    string+=" ";
                    stringBuffer = new StringBuffer();
                }
            }
        }
        if (stringBuffer.length()==0)
        {
            StringBuffer stringBuffer1 = new StringBuffer(string);
            stringBuffer1.deleteCharAt(string.length()-1);
            return stringBuffer1.toString();
        }else
        {
           return string+stringBuffer.reverse();
        }

    }
    public String reverseWords1(String s) {
        if(s == null || s.length() == 0) {
            return s;
        }
        s = s.trim();
        char[] ch = s.toCharArray();
        int j = 0;
        for(int i = 0; i < ch.length; i++) {
            if(ch[i] != ' ' || (j > 0 && ch[j - 1] != ' ')) {
                ch[j++] = ch[i];
            }
        }
        int end = j - 1;
        int pre = 0;
        for(int i = 0; i <= end; i++) {
            if(ch[i] == ' ') {
                reverse(ch, pre, i - 1);
                pre = i + 1;
            }
        }
        reverse(ch, pre, end);
        reverse(ch, 0, end);
        return new String(ch, 0, end + 1);
    }

    private void reverse(char[] ch, int i, int j) {
        while(i < j) {
            char tmp = ch[i];
            ch[i] = ch[j];
            ch[j] = tmp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        new FiftyOne().reverseWords1("  hello world!  ");
    }
}

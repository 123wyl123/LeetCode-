package Thirteen;

import java.util.Arrays;
import java.util.HashMap;

public class Seventy {
    public String sortString(String s) {
        char[] chars = s.toCharArray();
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        int pre =0;
        Arrays.sort(chars);
        if (chars[0]==chars[s.length()-1])
        {
            return s;
        }
        StringBuffer stringBuffer = new StringBuffer();



        pre =0;
        int after = s.length();
        while (stringBuffer.length()<s.length()) {
            for (int i = 0; i <s.length() ; i++) {
                if (!integerIntegerHashMap.containsKey(i))
                {
                    pre =i;
                    stringBuffer.append(chars[i]);
                    integerIntegerHashMap.put(i,1);
                    break;
                }
            }

            for (int i = pre+1; i < s.length(); i++) {
                if (chars[i] > chars[pre] && !integerIntegerHashMap.containsKey(i)) {
                    stringBuffer.append(chars[i]);
                    pre = i;
                    integerIntegerHashMap.put(i, 1);
                }
            }
            if (stringBuffer.length()==s.length())
            {
                break;
            }
            for (int i = s.length()-1; i>=0 ; i--) {
                if (!integerIntegerHashMap.containsKey(i))
                {
                    after =i;
                    stringBuffer.append(chars[i]);
                    integerIntegerHashMap.put(i,1);
                    break;
                }
            }
            if (stringBuffer.length()==s.length())
            {
                break;
            }
            for (int i = after-1; i >0; i--) {
                if (chars[i] < chars[after] && !integerIntegerHashMap.containsKey(i)) {
                    stringBuffer.append(chars[i]);
                    after = i;
                    integerIntegerHashMap.put(i, 1);
                }
            }
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        new Seventy().sortString("spo");
    }
}

package TwoFiveThree;

public class One {
    public boolean isPrefixString(String s, String[] words) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i <words.length ; i++) {
            char[] chars = words[i].toCharArray();
            for (int j = 0; j <chars.length ; j++) {
                stringBuffer.append(chars[j]);
            }
            if (s.equals(stringBuffer.toString()))
            {
                return true;
            }
        }
        return false;
    }
}

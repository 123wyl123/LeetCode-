package TwoFourThree;

public class One {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer1 = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        for (int i = 0; i <firstWord.length() ; i++) {
            stringBuffer.append(firstWord.charAt(i)-'a');
        }
        for (int i = 0; i <secondWord.length() ; i++) {
            stringBuffer1.append(secondWord.charAt(i)-'a');
        }
        for (int i = 0; i <targetWord.length() ; i++) {
            stringBuffer2.append(targetWord.charAt(i)-'a');
        }
        Integer integer = Integer.valueOf(stringBuffer.toString());
        Integer integer1 = Integer.valueOf(stringBuffer1.toString());
        Integer integer2 = Integer.valueOf(stringBuffer2.toString());
        if (integer+integer1==integer2)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        new One().isSumEqual("acb","cba","cdb");
    }
}

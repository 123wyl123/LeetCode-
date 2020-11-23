package TwoOneSix;

public class One {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuffer stringBuffer = new StringBuffer();
        for (String s : word1) {
            stringBuffer.append(s);
        }
        char[] chars = stringBuffer.toString().toCharArray();
        int k=0;
        for (String s : word2) {
            char[] chars1 = s.toCharArray();
            for (char c : chars1) {
                if(c==chars[k])
                {
                    k++;
                }else
                {
                    return false;
                }
            }
        }
        return k==chars.length?true:false;
    }
}

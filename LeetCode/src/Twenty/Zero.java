package Twenty;

public class Zero {
    public String reversePrefix(String word, char ch) {
        int end =0;
        char[] chars = word.toCharArray();
        for (int i = 0; i <word.length() ; i++) {
            if (chars[i]==ch)
            {
                end=i;
                break;
            }
        }
        int start = 0;
        while (start<end)
        {
            char temp = chars[start];
            chars[start]=chars[end];
            chars[end]=temp;
            start++;
            end--;
        }
        return new String(chars);
    }
}
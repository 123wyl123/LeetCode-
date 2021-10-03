package TwoSixOne;

public class Four {
    public int minimumMoves(String s) {
        char[] chars = s.toCharArray();
        int temp=0;
        for (int i = 0; i <s.length() ; i++) {
            if (chars[i]=='X')
            {
                temp++;
                chars[i]='O';
                if (i+1<s.length()) {


                    chars[i + 1] = 'O';
                }
                if (chars[i+2]<s.length()) {
                    chars[i + 2] = 'O';
                }
            }
        }
        return temp;
    }
}
package TwoFourSix;

public class One {
    public String largestOddNumber(String num) {
        char[] chars = num.toCharArray();
        int i=0;
        for ( i = num.length()-1; i >=0 ; i--) {
                if ((chars[i]-'0')%2==1)
                {
                    break;
                }
        }
        if (i==-1)
        {
            return "";
        }else
        {
            return num.substring(0,i+1);
        }
    }

    public static void main(String[] args) {
        new One().largestOddNumber("52");
    }
}

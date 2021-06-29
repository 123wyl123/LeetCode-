package One;

public class SixtyEight {
    public String convertToTitle(int columnNumber) {
        char a[]=new char[26];
        for (int i = 0; i <26 ; i++) {
            a[i]=(char)('A'+i);
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (columnNumber!=0)
        {
            int temp = columnNumber%26;

            columnNumber=columnNumber/26;
            if (temp==0)
            {
                columnNumber--;
            }
            stringBuffer.append(temp==0?'Z':a[temp-1]);

        }
        return stringBuffer.reverse().toString();
    }

    public static void main(String[] args) {
        new SixtyEight().convertToTitle(701);
    }
}

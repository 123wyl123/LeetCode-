package Zero;

import java.util.ArrayList;
import java.util.List;

public class Six {
    public String convert(String s, int numRows) {
        int length = s.length();
        if(length==0)
        {
            return "";
        }
        if(numRows<2)
        {
            return s;
        }
        int n= (length/(numRows+numRows-2))*(numRows-1)+(length%(numRows+numRows-2))/numRows+(length%(numRows+numRows-2))%numRows;

        char [][]a = new char[numRows][n];
        int j=0;
        int l=0;
        for (int i = 0; i <length ; ) {
            for (int k = 0; k <numRows; k++) {
                a[k][l] = s.charAt(i);
                i++;
                if(i==length)
                {
                    break;
                }
            }
            if(i==length)
            {
                break;
            }
            l++;
            for (int k = numRows-2;k>0 ; k--) {
                a[k][l] = s.charAt(i);
                i++;
                l++;
                if(i==length)
                {
                    break;
                }
            }
        }
        String s1 = "";


        for (int i = 0; i <numRows ; i++) {
            for (int k = 0; k <n ; k++) {
                if(a[i][k]!=0)
                {
                    s1+=a[i][k];
                }
            }

        }

        return s1;
    }
    public String convert1(String s, int numRows) {

        if (numRows == 1) return s;

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++)
            rows.add(new StringBuilder());

        int curRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows) ret.append(row);
        return ret.toString();
    }



    public static void main(String[] args) {
        new Six().convert1("PAYPALISHIRING",4);
    }
}

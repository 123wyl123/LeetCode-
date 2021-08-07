package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NinetyFour {
    public static void main(String[] args) throws Exception{
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(scan.readLine());
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i <n ; i++) {
            if (n%4==0)
            {
                stringBuffer.append("a");
            }else if (n%4==3)
            {
                stringBuffer.append("a");
            }else
            {
                stringBuffer.append("b");
            }
        }
    }
}

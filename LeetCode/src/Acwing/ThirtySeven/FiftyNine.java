package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FiftyNine {
    public static void main(String[] args)
    throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.valueOf(reader.readLine());
        while (T>0)
        {
                T--;
            String s = reader.readLine();
            String[] s1 = s.split(" ");
            int n= Integer.parseInt(s1[0]);
            int k= Integer.parseInt(s1[1]);
            if (k==1)
            {
                StringBuffer stringBuffer = new StringBuffer();
                for (int i = 0; i <n-2 ; i++) {
                    stringBuffer.append("a");
                }
                for (int i = 0; i <2 ; i++) {
                    stringBuffer.append("b");
                }
                System.out.println(new String(stringBuffer));
            }else {
                int sum = 1;
                int temp = 2;
                while (sum < k) {
                    sum += temp;
                    temp++;
                }
                temp--;
                sum -= temp;
                k = k - sum;
                StringBuffer stringBuffer = new StringBuffer();
                for (int i = 0; i < n-2-(temp - 1); i++) {
                    stringBuffer.append("a");
                }
                stringBuffer.append("b");
                StringBuffer stringBuffer1 = new StringBuffer();
                for (int i = 0; i < k-1; i++) {
                    stringBuffer1.append("a");
                }
                stringBuffer1.append("b");
                stringBuffer1.reverse();

                int length = stringBuffer.length();
                for (int i = length+k; i < n; i++) {
                    stringBuffer.append("a");
                }
                stringBuffer.append(stringBuffer1);
                System.out.println(new String(stringBuffer));
            }
        }
    }

}

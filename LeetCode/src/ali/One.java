package ali;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class One {
    public static void main(String[] args) throws  Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] split = bufferedReader.readLine().split(" ");
        int d= Integer.valueOf(split[0]);
        int m= Integer.valueOf(split[1]);
        int w= Integer.valueOf(split[2]);
        String[] s = bufferedReader.readLine().split(" ");
        int i = Integer.valueOf(s[0]);
        int j=Integer.valueOf(s[1]);
        int k =Integer.valueOf(s[2]);

        long sum= m*d%w;
        long sum1=((long)m*(long)d*(long)((k-1)%w)+(j-1)*d+i)%w;
        if (sum1==0)
        {
            System.out.println((char)(w-1+'a'));
        }else
        {
            System.out.println((char)(sum1-1+'a'));
        }
    }
}



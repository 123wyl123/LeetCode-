package ali;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Three {
    public static void main(String[] args)throws Exception {
      BufferedReader shuru=  new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter writer= new BufferedWriter(new OutputStreamWriter(System.out));
        String[] zhi = shuru.readLine().split(" ");

        int n= Integer.valueOf(zhi[0]);
        int l=Integer.valueOf(zhi[1]);
        int r = Integer.valueOf(zhi[2]);
        int b[]=new int[r+1];
        int a[]=new int[r+1];
        for (long i = 1; i <=n ; i++) {
            if (n%i==0)
            {
                continue;
            }else
            {
                long temp=n-(n%i)+1;
                if (temp<=r)
                {
                    a[(int)temp]++;
                }
            }
        }
        for (int i = 1; i <= r; i++)
        {
            b[i] = a[i] + b[i - 1];
        }
        for (int i = l; i <=r ; i++) {
            writer.write(b[i]+" ");
        }
        writer.write("\n");
        writer.flush();
    }

}

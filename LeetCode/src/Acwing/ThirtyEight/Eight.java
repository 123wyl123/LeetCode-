package Acwing.ThirtyEight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Eight {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int T =Integer.valueOf(reader.readLine());
        while (T>0)
        {
            T--;
            int n = Integer.valueOf(reader.readLine());

            if (n==1)
            {
                writer.write(2+"\n");
                writer.flush();
            }else if (n==2)
            {
                writer.write(3+"\n");
                writer.flush();
            }else
            {
              int s=  (int ) Math.sqrt(n);
              if (s*s==n)
              {
                  writer.write((s*2)+"\n");
              }else if (s*s<n)
              {
                    if ((s*(s+1))>=n)
                    {
                        writer.write((s+s+1)+"\n");
                    }else
                    {
                        writer.write(2*(s+1)+"\n");
                    }
              }else
              {
                  if ((s*(s-1))>=n)
                  {
                      writer.write((s+s-1)+"\n");
                  }else
                  {
                      writer.write(2*(s-1)+"\n");
                  }
              }
              writer.flush();
            }

        }

    }
}

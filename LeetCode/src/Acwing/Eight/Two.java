package Acwing.Eight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Two {
    public static void main(String[] args)throws Exception
    {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.valueOf(scan.readLine());
        while(T>0)
        {
            T--;
            int N = Integer.valueOf(scan.readLine());
            char temp[]=scan.readLine().toCharArray();
            int M= Integer.valueOf(scan.readLine());
            char sex[]=scan.readLine().toCharArray();


            PriorityQueue<Integer> kong = new PriorityQueue<Integer>((Integer a,Integer b)->
            {
                return a-b;
            });
            PriorityQueue<Integer> youyige = new PriorityQueue<Integer>((Integer a,Integer b)->
            {
                return a-b;
            });

            int b[]=new int[M];
            for(int i=0;i<N;i++)
            {
                if(temp[i]=='0')
                {
                    kong.add(i+1);
                }else if(temp[i]=='1')
                {
                    youyige.add(i+1);
                }
            }

            for(int i=0;i<M;i++)
            {
                if(sex[i]=='M')
                {
                    if(youyige.size()!=0)
                    {
                        b[i]= youyige.poll();
                    }else
                    {
                        b[i]= kong.poll();
                        youyige.add(b[i]);
                    }
                }else
                {
                    if(kong.size()!=0)
                    {
                        b[i]= kong.poll();
                        youyige.add(b[i]);
                    }else
                    {
                        b[i]=  youyige.poll();
                    }
                }
            }

            for(int i=0;i<M;i++)
            {
              writer.write(b[i]+"\n");

              writer.flush();
            }
        }
    }

}
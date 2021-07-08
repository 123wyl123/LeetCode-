package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class SixtyOne {

    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.valueOf(bufferedReader.readLine());
        while(t>0)
        {t--;
            int bbbbb=   Integer.valueOf(bufferedReader.readLine());
            String a=     bufferedReader.readLine();
            int b[]=new int[bbbbb];
            HashMap <Integer,Integer> bb =new HashMap<>();
            String aa[]=a.split(" ");
            for(int i=0;i<bbbbb;i++)
            {
                b[i]=Integer.valueOf(aa[i]);
                bb.put(b[i],bb.getOrDefault(b[i],0)+1);
            }
            int min =-1;
            for(int i=0;i<bbbbb;i++)
            {
                if(bb.get(b[i])==1)
                {
                    if(min!=-1&&b[i]<b[min])
                    {
                        min=i;
                    }else if(min==-1)
                    {
                        min=i;
                    }
                }
            }
            System.out.println(min==-1?-1:min+1);
        }
    }



}
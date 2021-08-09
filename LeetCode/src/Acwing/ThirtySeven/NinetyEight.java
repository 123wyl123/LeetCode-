package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NinetyEight {


        public static void main(String[] args)throws Exception
        {
            BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
            int T=Integer.valueOf(scan.readLine());
            while(T>0)
            {
                T--;
                String a=    scan.readLine();
                int temp =Integer.valueOf(a);
                char b[]=    a.toCharArray();
                b[0]=(char)(b[0]+1);
                for(int i=1;i<b.length;i++)
                {
                    b[i]='0';
                }
                int ab=0;
                for(int i=0;i<b.length;i++)
                {
                    ab=ab*10+(b[i]-'0');
                }
                System.out.println(ab-temp);
            }
        }

    }


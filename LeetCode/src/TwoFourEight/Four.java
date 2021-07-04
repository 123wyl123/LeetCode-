package TwoFourEight;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class Four {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        HashSet<Integer> integers = new HashSet<>();

        for (int i = 2; i <100 ; i++) {
            if (isD(i))
            {
                integers.add(i);
            }

        };
        int T= Integer.valueOf(s);
        while (T>0)
        {
            T--;
            int n =Integer.valueOf(bufferedReader.readLine());
            int a[][]=new int[n][n];
            if (integers.contains(n))
            {

                for (int i = 0; i <n ; i++) {
                    for (int j = 0; j <n ; j++) {
                        a[i][j]=1;
                    }
                }
            }else
            {
                int temp = n-1;
                while (true)
                {   temp++;
                    if (isD(temp)&&!isD(temp-n+1))
                    {
                        break;
                    }

                }
                for (int i = 0; i <n ; i++) {
                    for (int j = 0; j <n ; j++) {
                        a[i][j]=1;
                    }
                }
                for (int i = 0; i <n ; i++) {
                    a[i][i]=temp-n+1;
                }
            }
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <n ; j++) {
                    System.out.print(a[i][j]);
                    System.out.print(" ");
                }
                System.out.println("");
            }
        }
    }
    public static boolean isD(int a)
    {
        for (int i = 2; i <a ; i++) {
            if (a%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ThirtyTwo {
    public static void main(String[] args) throws   Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = bufferedReader.readLine();
        int T = Integer.valueOf(s);
        while (T>0)
        {
            T--;
            String s1 = bufferedReader.readLine();
            String[] s2 = s1.split(" ");
            int n = Integer.valueOf(s2[0]);
            int m = Integer.valueOf(s2[1]);
            int a[][]=new int[n][m];
            int b[][]=new int[m][n];
            HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
            for (int i = 0; i <n ; i++) {

                String s3 = bufferedReader.readLine();
                String[] s4 = s3.split(" ");
                for (int j = 0; j <m ; j++) {
                    a[i][j]=Integer.valueOf(s4[j]);
                }
                    integerIntegerHashMap.put(a[i][0],i);
            }
            int c[][]=new int[n][m];
            for (int i = 0; i <m ; i++) {
                String s3 = bufferedReader.readLine();
                String[] s4 = s3.split(" ");
                for (int j = 0; j <n ; j++) {
                    b[i][j]=Integer.valueOf(s4[j]);
                    if (integerIntegerHashMap.containsKey(b[i][j]))
                    {
                        Integer integer = integerIntegerHashMap.get(b[i][j]);
                        for (int k = 0; k <m ; k++) {
                            c[j][k]=a[integer][k];
                        }
                    }
                }

            }


            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <m ; j++) {
                    bw.write(c[i][j] + " ");
                }
                bw.write("\n");
            }
        }
    }


}

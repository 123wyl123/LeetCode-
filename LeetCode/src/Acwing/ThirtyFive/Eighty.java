package Acwing.ThirtyFive;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Eighty {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.valueOf(bufferedReader.readLine());
        String s = bufferedReader.readLine();
        String[] s1 = s.split(" ");
        int a[]=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=Integer.valueOf(s1[i]);
        }
        Arrays.sort(a);
        int sum=0;
        for (int i = 0; i <n ; i+=2) {
            sum+=a[i+1]-a[i];
        }
        System.out.println(sum);
    }
}

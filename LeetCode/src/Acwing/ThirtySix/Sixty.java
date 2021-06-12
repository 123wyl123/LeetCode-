package Acwing.ThirtySix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sixty {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        Integer integer = Integer.valueOf(s);
        while (integer > 0) {
            integer--;
            String s1 = bufferedReader.readLine();
            String[] s2 = s1.split(" ");
            int n = Integer.valueOf(s2[0]);
            int m = Integer.valueOf(s2[1]);
            int r = Integer.valueOf(s2[2]);
            int c = Integer.valueOf(s2[3]);
            int sum = Math.max(n - r, r-1) + Math.max(m - c, c-1);
            System.out.println(sum);


        }

    }
}

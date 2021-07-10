package Acwing.ThirtySeven;
import java.util.*;
import java.io.*;

public class FiftyEight {
    public static void main(String[] args) throws  Exception{
       BufferedReader a= new BufferedReader(new InputStreamReader(System.in));
       int T=Integer.parseInt( a.readLine());
       while (T>0)
       {
           T--;
           String s = a.readLine();
           String[] s1 = s.split(" ");
            int h = Integer.parseInt(s1[0]);
            int m = Integer.parseInt(s1[1]);
            int sum=60-m;
            h++;
            sum=sum+(24-h)*60;
           System.out.println(sum);
       }
    }
}

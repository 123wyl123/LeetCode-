package Acwing.ThirtySix;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class FiftyFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
        while (T>0)
        {
            T--;
            String s = scanner.nextLine();
            String[] s1 = s.split(" ");
            int a[]=new int[2];
            for (int i=0;i<2;i++)
            {
                a[i]=Integer.valueOf(s1[i]);
            }
            if (a[0]<=2)
            {
                System.out.println(1);
            }else
            {   int temp=a[0]-2;

                System.out.println(1+temp/a[1]+(temp%a[1]==0?0:1));
            }
        }
    }
}

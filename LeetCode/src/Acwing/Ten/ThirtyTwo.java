package Acwing.Ten;

import java.util.Scanner;

public class ThirtyTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        long sum =1;
        long temp =1;
        for (int j = 1; j <=i ; j++) {


            if (sum*j%10==0)
            {   sum=sum*j;
               while (sum%10==0)
               {
                   sum=sum/10;
               }
               sum=sum%10;
            }else
            {
                sum=sum*j;
            }



        }

        System.out.println(sum%10);
    }

}

package Acwing.Zero;

import java.util.Arrays;
import java.util.Scanner;

public class Lanterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int i1 = scanner.nextInt();
        int a[] = new int[i];
        for (int j = 0; j <i ; j++) {
            a[j]=scanner.nextInt();
        }
        Arrays.sort(a);
        double min = 0;
        for (int j = 0; j <i-1 ; j++) {
        min = Math.max(a[j+1]-a[j],min);
        }
        min = Math.max(min,2*a[0]);
        min = Math.max(min,2*(i1-a[i-1]));
        System.out.println(String.format("%.10f",min/2));
    }
}

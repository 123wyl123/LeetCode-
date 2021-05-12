package Acwing.ThirtyFour;

import java.util.Scanner;

public class NinetyThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int i1 = scanner.nextInt();
        int a[] = new int[i];
        int b[] = new int[i];
        int temp =i;
        int j=0;
        while (i>0)
        {
            a[j]=scanner.nextInt();
            j++;
            i--;
        }
        scanner.nextLine();
        i=temp;
        j=0;
        while (i>0)
        {
            b[j]=scanner.nextInt();
            j++;
            i--;
        }
        i=temp;
        long ans =0;
        long s[] = new long[i+1];
        for (int k = 1; k <=i ; k++) {
            if (b[k-1]==1)
            {
               ans+=a[k-1];
               a[k-1]=0;
            }
                s[k]=s[k-1]+a[k-1];
              }
        int l=0;
        long max =0;
        while (l<i)
        {
            int r = l+i1;
            if (r>i)
            {
                r=i;
            }
            max =Math.max(max,s[r]-s[l]);
            l++;
        }

        System.out.println(max+ans);

    }
}

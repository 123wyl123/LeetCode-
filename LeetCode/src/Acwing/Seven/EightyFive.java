package Acwing.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class EightyFive {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter printWriter = new PrintWriter(System.out);
        Integer integer = Integer.valueOf(bufferedReader.readLine());
        int a[]=new int[integer];
        String s = bufferedReader.readLine();
        String[] s1 = s.split(" ");
        for (int i = 0; i <integer ; i++) {
            a[i]=Integer.valueOf(s1[i]);
        }
        fast(a,0,a.length-1);
        for (int i = 0; i <integer-1 ; i++) {
            printWriter.print(a[i]+" ");
        }
        printWriter.print(a[integer-1]);
        printWriter.flush();
    }
    public static void fast(int a[],int l,int r)
    {
        if (l>=r)
        {
            return;
        }
        int mid = partition(a, l, r);
        fast(a, l, mid - 1);
        fast(a, mid + 1, r);
    }
    private static int partition(int[] a, int left, int right) {
        if (left == right) {
            return left;
        }
        int i =left;
        int j=right;
        int temp =i+(int)(Math.random()*(j-i));
        int tt = a[temp];
        a[temp]=a[i];
        a[i]=tt;
        temp = a[i];
        i++;
        while (i<=j)
        {
            if (a[i]>temp)
            {
                tt =a[j];
                a[j]=a[i];
                a[i]=tt;
                j--;
            }else
            {
                i++;
            }
        }
        tt=a[j];
        a[left]=tt;
        a[j]=temp;
        return j;
    }
}

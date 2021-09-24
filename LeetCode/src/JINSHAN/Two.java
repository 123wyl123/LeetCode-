package JINSHAN;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;


public class Two {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.valueOf(reader.readLine());
        String[] s = reader.readLine().split(" ");

        int a[]=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=Integer.valueOf(s[i]);
        }
        int max[]=new int[n];
        int min[]=new int[n];
        TreeSet<Integer> integers = new TreeSet<>();
        for (int i = 0; i <n ; i++) {
            int i1 = a[i];
            Integer lower = integers.lower(i1);
            if (lower==null)
            {
                min[i]=-1;
            }else
            {
                min[i]=lower;
            }
            integers.add(a[i]);
        }
        integers=new TreeSet<>();
        int mm=0;
        for (int i = n-1; i >=0 ; i--) {
            int i1=a[i];
            if (i1>mm)
            {
                mm=i1;
                max[i]=-1;
            }else
            {
                max[i]=mm;
            }
        }
        int maxz =0;
        for (int i = 0; i <n ; i++) {
            if (min[i]==-1||max[i]==-1)
            {
                continue;
            }
            maxz=Math.max(a[i]+min[i]+max[i],maxz);
        }
        System.out.println(maxz);
    }
}

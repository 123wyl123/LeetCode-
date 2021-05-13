package Acwing.ThirtyFive;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Two {
   static   HashSet <Integer> bb=new HashSet<Integer>();
   static HashMap<String, Boolean> stringBooleanHashMap = new HashMap<>();
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int a[][] = new int[m][n];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                dfs(a,k,i,j,0);
            }
        }
        System.out.println(bb.size());


    }
    public static void dfs(int a[][],int k,int i ,int j, int temp)
    {

    if (i<0||i>=a.length||j<0||j>=a[0].length)
    {
        return;
    }
        stringBooleanHashMap.put(""+i+j+k,true);
    temp=temp*10+a[i][j];
        if (k==0)
        {
            bb.add(temp);
            return;
        }
       dfs(a,k-1,i-1,j,temp);
        dfs(a,k-1,i+1,j,temp);
        dfs(a,k-1,i,j+1,temp);
        dfs(a,k-1,i,j-1,temp);
    }
}

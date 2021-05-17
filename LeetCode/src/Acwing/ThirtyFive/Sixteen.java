package Acwing.ThirtyFive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Sixteen {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        String[] s2 = scanner.readLine().split(" ");


        int n = Integer.valueOf(s2[0]);
        int m = Integer.valueOf(s2[1]);

        int a[][]=new int[n][m];
        for (int j = 0; j <n ; j++) {
            String s = scanner.readLine();
            for (int i = 0; i <m ; i++) {
               a[j][i] =s.charAt(i)-'0';
            }
        }
    int shang[][] =new int[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                if (i==0)
                {
                    shang[i][j]=a[i][j];
                }else
                {   if (a[i][j]!=0)
                {
                    shang[i][j]=shang[i-1][j]+a[i][j];
                }else
                {
                    shang[i][j]=0;
                }

                }
            }
        }
        int xia[][]= new int[n][m];
        for (int i = n-1; i >=0 ; i--) {
            for (int j = 0; j <m ; j++) {
                if (i==n-1)
                {
                    xia[i][j]=a[i][j];
                }else
                {   if (a[i][j]!=0)
                {
                    xia[i][j]=a[i][j]+xia[i+1][j];
                }else
                {
                    xia[i][j]=0;
                }
                }
            }
        }
        int zuo[][] = new int[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                if (j==0)
                {
                    zuo[i][j]=a[i][j];
                }else
                {   if (a[i][j]!=0)
                {
                    zuo[i][j]=zuo[i][j-1]+a[i][j];
                }else
                {
                    zuo[i][j]=0;
                }
                }
            }
        }
        int you[][]=new int[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j =m-1 ; j >=0 ; j--) {
                if (j==m-1)
                {
                    you[i][j]=a[i][j];
                }else
                {   if (a[i][j]!=0)
                {
                    you[i][j]=a[i][j]+you[i][j+1];
                }else
                {
                    you[i][j]=0;
                }

                }
            }
        }
        int sshang[] = new int[n];
        int xxhang[] = new int[n];
        int zulie[] = new int[m];
        int youlie[] = new int[m];
        Deque<Integer> aa = new LinkedList<>();
        String s = scanner.readLine();
        Integer integer = Integer.valueOf(s);
        aa.push(-1);
        int max =0;
        for (int j = 0; j <n ; j++) {
        max =0;
            for (int k = 0; k < m; k++) {
                if (aa.peek() == -1) {
                    aa.push(k);
                } else if (shang[j][k] >= shang[j][aa.peek()]) {
                    aa.push(k);
                } else {
                    while (aa.peek() != -1 && shang[j][k] < shang[j][aa.peek()]) {
                        Integer pop = aa.pop();
                        max = Math.max(shang[j][pop] * (k - aa.peek() - 1), max);
                    }
                    aa.push(k);
                }
            }
            while (aa.peek() != -1) {
                Integer pop = aa.pop();
                max = Math.max(shang[j][pop] * (m - aa.peek() - 1), max);
            }if (j==0)
            {
                sshang[j]=max;
            }else
            {
                sshang[j]=Math.max(sshang[j-1],max);
            }

        }
            for (int j =n-1 ; j >=0 ; j--) {
                max=0;
                for (int k = 0; k <m ; k++) {
                    if (aa.peek()==-1)
                    {
                        aa.push(k);
                    }else if (xia[j][k]>=xia[j][aa.peek()])
                    {
                        aa.push(k);
                    }else
                    {
                        while (aa.peek()!=-1&&xia[j][k]<xia[j][aa.peek()])
                        {
                            Integer pop = aa.pop();
                            max =Math.max(xia[j][pop]*(k-aa.peek()-1),max);

                        }
                        aa.push(k);
                    }
                }
                while (aa.peek()!=-1)
                {
                    Integer pop = aa.pop();
                    max =Math.max(xia[j][pop]*(m-aa.peek()-1),max);
                }
                if (j==n-1)
                {
                    xxhang[j]=max;
                }else
                {
                    xxhang[j]=Math.max(xxhang[j+1],max);
                }
            }
            for (int j = 0; j <m ; j++) {
                max =0;
                for (int k = 0; k < n; k++) {
                    if (aa.peek() == -1) {
                        aa.push(k);
                    } else if (zuo[k][j] >= zuo[aa.peek()][j]) {
                        aa.push(k);
                    } else {
                        while (aa.peek() != -1 && zuo[k][j] < zuo[aa.peek()][j]) {
                            Integer pop = aa.pop();
                            max = Math.max(max, zuo[pop][j] * (k - aa.peek() - 1));
                        }
                        aa.push(k);
                    }

                }
                while (aa.peek() != -1) {
                    Integer pop = aa.pop();
                    max = Math.max(zuo[pop][j] * (n - aa.peek() - 1), max);
                }
                if (j==0)
                {
                    zulie[j]=max;
                }else
                {
                    zulie[j]=Math.max(max,zulie[j-1]);
                }

            }
        for (int j = m-1; j >=0 ; j--) {
            max =0;
            for (int k = 0; k <n ; k++) {
                if (aa.peek()==-1)
                {
                    aa.push(k);
                }else if (you[k][j]>=you[aa.peek()][j])
                {
                    aa.push(k);
                }else
                {
                    while (aa.peek()!=-1&&you[k][j]<you[aa.peek()][j])
                    {
                        Integer pop = aa.pop();
                        max=Math.max(max,you[pop][j]*(k-aa.peek()-1));
                    }
                    aa.push(k);
                }
            }
            while (aa.peek()!=-1)
            {
                Integer pop = aa.pop();
                max =Math.max(max,you[pop][j]*(n-aa.peek()-1));
            }
            if (j==m-1)
            {
                youlie[j]=max;
            }else
            {
                youlie[j]=Math.max(max,youlie[j+1]);
            }
        }
        while (integer>0)
    {   integer--;
        String[] s3 = scanner.readLine().split(" ");

        int i = Integer.valueOf(s3[0]);
        int i1 = Integer.valueOf(s3[1]);
        max =0;
        if (i-1>=0)
        {
            max =Math.max(max,sshang[i-1]);
        }
        if (i+1<n)
        {
            max =Math.max(max,xxhang[i+1]);
        }
        if (i1-1>=0)
        {
            max =Math.max(max,zulie[i1-1]);
        }
        if (i1+1<m)
        {
            max=Math.max(max,youlie[i1+1]);
        }
        System.out.println(max);
    }

    }

}

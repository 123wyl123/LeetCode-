package ali;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Two {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int zhi[]=new int[100005];
        int rank[]=new int[100005];
        for (int i = 0; i <zhi.length ; i++) {
            zhi[i]=i;
        }
        int T =Integer.valueOf(bufferedReader.readLine());
        while (T>0)
        {
            T--;
            String[] s = bufferedReader.readLine().split(" ");
            int n= Integer.valueOf(s[0]);
            if (n==1)
            {
                int a= Integer.valueOf(s[1]);
                int b=Integer.valueOf(s[2]);
                int left=  find(zhi,a);
                int right=  find(zhi,b);
                if (rank[left]>rank[right])
                {
                    zhi[right]=left;

                }else if (rank[left]<rank[right])
                {
                    zhi[left]=right;
                }else
                {
                    zhi[right]=left;
                    rank[left]++;
                }
            }else
            {
                int a= Integer.valueOf(s[1]);
                int b=Integer.valueOf(s[2]);
                int c = Integer.valueOf(s[3]);
                int m1= a%c;
                int m2=b%c;
                if (find(zhi,m1)==find(zhi,m2))
                {
                    System.out.println("YES");
                }else
                {
                    System.out.println("NO");
                }
            }

        }
    }
    public static int find (int zhi[],int l)
    {
        if (zhi[l]!=l)
        {
            zhi[l]=find(zhi,zhi[l]);
        }
        return zhi[l];
    }
}

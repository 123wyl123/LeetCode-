package TwoZeroSix;

public class Two {
    public int unhappyFriends(int n, int[][] preferences, int[][] pairs) {
        int sum =0;
        int bb[] = new int[n];
        for (int i = 0; i <pairs.length ; i++) {

            for (int j = i+1; j <pairs.length ; j++) {
                int a1 =0,b1=0,c1=0,d1=0;
            int x=    pairs[i][0] ;
            int  y= pairs[i][1];
            int u = pairs[j][0];
            int v = pairs[j][1];
            int min =Integer.MAX_VALUE;
            int temp =0;
            int a[] = new int[preferences[0].length+1];
            int b[] = new int[preferences[0].length+1];
            int c[] = new int[preferences[0].length+1];
            int d[] = new int[preferences[0].length+1];
                for (int k = 0; k <preferences[i].length ; k++) {
                    if (preferences[x][k]==u){
                    a[u] = k;
                    }else if(preferences[x][k]==v)
                    {    a[v] = k;
                    }else  if (preferences[x][k]==y)
                    {
                        a[y] = k;
                    }
                }
                for (int k = 0; k <preferences[i].length ; k++) {
                    if (preferences[y][k]==u){
                        b[u] = k;
                    }else if(preferences[y][k]==v)
                    {    b[v] = k;
                    }else  if (preferences[y][k]==x)
                    {
                        b[x] = k;
                    }
                }
                for (int k = 0; k <preferences[i].length ; k++) {
                    if (preferences[u][k]==x){
                        c[x] = k;
                    }else if(preferences[u][k]==v)
                    {    c[v] = k;
                    }else  if (preferences[u][k]==y)
                    {
                        c[y] = k;
                    }
                }
                for (int k = 0; k <preferences[i].length ; k++) {
                    if (preferences[v][k]==x){
                       d[x] = k;
                    }else if(preferences[v][k]==u)
                    {    d[u] = k;
                    }else  if (preferences[v][k]==y)
                    {
                       d[y] = k;
                    }
                }
                if (a[u]<a[y])
                {
                    if (c[x]<c[v])
                    {
                        bb[x]=1;
                    }
                }
                if (a[v]<a[y])
                {
                    if (d[x]<d[u])
                    {
                        bb[x]=1;
                    }
                }
                if (b[u]<b[x])
                {
                    if (c[y]<c[v])
                    {
                        bb[y]=1;
                    }
                }
                if (b[v]<b[x])
                {
                    if (d[y]<d[u])
                    {
                        bb[y]=1;
                    }
                }
                if (c[x]<c[v])
                {
                    if (a[u]<a[y])
                    {
                        bb[u]=1;
                    }
                }
                if (c[y]<c[v])
                {
                    if (b[u]<b[x])
                    {
                        bb[u]=1;
                    }
                }
                if (d[x]<d[u])
                {
                    if (a[v]<a[y])
                    {
                        bb[v]=1;
                    }
                }
                if (d[y]<d[u])
                {
                    if (b[v]<b[x])
                    {
                        bb[v]=1;
                    }
                }

            }
        }
        for (int i : bb) {
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int a[][] ={{1, 2, 3}, {3, 2, 0}, {3, 1, 0}, {1, 2, 0}};
        int[][]  pairs = {{0, 1}, {2, 3}};
        new Two().unhappyFriends(4,a,pairs);
    }
}


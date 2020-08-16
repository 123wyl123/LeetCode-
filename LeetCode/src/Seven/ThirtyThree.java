package Seven;

public class ThirtyThree {
    int a ;
    int n;
    int m;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        a= image[sr][sc];

        n = image.length;
        m = image[0].length;
        dps(image,sr,sc,newColor);
        image[sr][sc] = newColor;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {
                if(image[i][j]==-1)
                {
                    image[i][j]=newColor;
                }
            }
        }
        return image;
    }
    public void  dps(int[][]d,int sr,int sc ,int newColor)
    {
        if(sr<0||sr>=n||sc<0||sc>=m||d[sr][sc]!=a)
        {
            return;
        }
        d[sr][sc]=-1;
        dps(d,sr+1,sc,newColor);
        dps(d,sr,sc+1,newColor);
        dps(d,sr-1,sc,newColor);
        dps(d,sr,sc-1,newColor);
        return;
    }

    public static void main(String[] args) {
 int a[][]     =  {{0,0,0},{0,1,0}};
        new ThirtyThree().floodFill(a,1,0,2);
    }
}

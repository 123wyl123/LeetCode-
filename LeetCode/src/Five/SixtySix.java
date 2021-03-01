package Five;

public class SixtySix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int l = nums.length;
        int w = nums[0].length;
        if(w*l!=r*c)
        {
            return nums;
        }
        int a[][]=new int[r][c];
        int r1=0;
        int c1=0;
        for(int i=0;i<l;i++)
            for(int j=0;j<w;j++)
            {
                a[r1][c1]=nums[i][j];
                c1++;
                if(c1==c)
                {
                    c1=0;
                    r1++;
                }
            }
        return a;
    }
}

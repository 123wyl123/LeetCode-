package Zero;

public class SeventyFour {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i <matrix.length ; i++) {
            int l = 0;
            int r = matrix[0].length-1;
            if (target>matrix[i][r])
            {
                continue;
            }else if (target<matrix[i][l])
            {
                return false;
            }else
            {
                while (l<=r)
                {
                    int mid = (l+r)/2;
                    if (matrix[i][mid]>target)
                    {
                     r  = mid-1;
                    }else if (matrix[i][mid]<target)
                    {
                        l = mid+1;
                    }else
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int a[][] = new int[][]{{1}};
        new SeventyFour().searchMatrix(a,1);
    }
}

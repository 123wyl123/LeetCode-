package Seven;

public class SixtySix {
    public boolean isToeplitzMatrix(int[][] matrix) {

        for(int i=0;i<matrix.length;i++)
        {   int temp = matrix[i][0];
            int k=i;
            for(int j =0;j<matrix[0].length;j++)
            {
                if(k+j<matrix.length)
                {
                    if(matrix[k+j][j]==temp)
                    {

                    }else
                    {
                        return false;
                    }
                }
            }
        }
        for(int i=0;i<matrix[0].length;i++)
        {
            int temp =matrix[0][i];
            int k=i;
            for(int j=0;j<matrix.length;j++)
            {
                if(k+j<matrix[0].length)
                {
                    if(temp==matrix[j][j+k])
                    {

                    }else
                    {
                        return false;
                    }
                }
            }
        }
        return true ;
    }

}

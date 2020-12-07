package Eight;

public class SixtyOne {
    public int matrixScore(int[][] A) {
        
        for (int i = 0; i <A.length ; i++) {
                if (A[i][0]==0)
                {
                    for (int j = 0; j <A[0].length ; j++) {
                        A[i][j] =1-A[i][j];
                    }
                }
        }
        for (int i = 1; i <A[0].length ; i++) {
            int sum =0;
            for (int j = 0; j <A.length ; j++) {
                if (A[i][j]==0)
                {
                    sum++;
                }else
                {
                    sum--;
                }
            }
            if (sum>0)
            {
                for (int j = 0; j <A.length ; j++) {
                    A[j][i] = 1-A[j][i];
                }
            }
        }
        int summ=0;

        for (int i = 0; i <A.length ; i++) {
            int sum1=0;
            for (int j = 0; j <A[0].length ; j++) {
                  sum1=sum1*2+A[i][j];
            }
            summ+=sum1;
        }
        return summ;
    }
}

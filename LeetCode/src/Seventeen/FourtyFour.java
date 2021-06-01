package Seventeen;

public class FourtyFour {
    public boolean[] canEat(int[] candiesCount, int[][] queries) {
        int sum[] =new int[candiesCount.length];
        sum[0]=candiesCount[0];
        for (int i = 1; i <candiesCount.length ; i++) {
            sum[i]=sum[i-1]+candiesCount[i];
        }
        boolean result []= new boolean[queries.length];
        for (int i = 0; i <queries.length ; i++) {
            int i1 = queries[i][0];
            int i2 = queries[i][1];
            int i3 = queries[i][1];
            int i4 = sum[i1];
            if (i1==0)
            {
                if (i2<i4)
                {
                    result[i]=true;
                }else
                {
                    result[i]=false;
                }

            }else
            {
                if (i2*i3<sum[i1-1])
                {
                    result[i]=false;
                }else if (i2>=sum[i1])
                {
                 result[i]=false;
                }else
                {
                    result[i]=true;
                }
            }
        }
        return  result;
    }

    public static void main(String[] args) {
        int a[]={5,2,6,4,1};
        int b[][]={{3,1,2},{4,10,3},{3,10,100},{4,100,30},{1,3,1}};

        new FourtyFour().canEat(a,b);
    }

}

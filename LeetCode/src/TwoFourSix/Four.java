package TwoFourSix;

public class Four {
    public int[] minDifference(int[] nums, int[][] queries) {
        int a[][]=new int[100001][101];
        a[1][nums[0]]++;
        for (int i = 2; i <=nums.length ; i++) {
            for (int j = 1; j <=100 ; j++) {
                a[i][j]=a[i-1][j];
            }
            ++a[i][nums[i-1]];
        } 
        int b[]=new int[queries.length];
        for (int i = 0; i <queries.length ; i++) {
            int start=queries[i][0];
            int end = queries[i][1];
            int temp =Integer.MAX_VALUE;
            int pre =-1;
            for (int j = 1; j <=100 ; j++) {
                if (a[start][j]==a[end+1][j])
                {
                    continue;
                }else
                {   if (pre==-1)
                {
                    pre = j;
                }else
                {
                    temp=Math.min(temp,j-pre);
                    pre=j;

                }
                }
                if (temp==Integer.MAX_VALUE)
                {
                    b[i]=-1;
                }else
                {
                    b[i]=temp;
                }
            }
        }
        return b;
    }

    public static void main(String[] args) {
        int a[]={1,3,4,8};
        int b[][]={{0,1},{1,2},{2,3},{0,3}};
        new Four().minDifference(a,b);
    }

}

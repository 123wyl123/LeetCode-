package TwoFourFour;

public class One {
    public boolean findRotation(int[][] mat, int[][] target) {
        boolean flag = true;
        for (int i = 0; i <mat.length ; i++) {
            for (int j = 0; j <mat[0].length; j++) {
                if (mat[i][j]!=target[i][j])
                {
                    flag=false;
                    break;
                }
            }
        }
        if (flag)
        {
            return true;
        }
        flag = true;
        for (int i = 0; i <mat.length ; i++) {
            for (int j = 0; j <mat[0].length ; j++) {
                if (target[i][j]!=mat[mat.length-j-1][i])
                {
                    flag=false;
                    break;
                }
            }
        }
        if (flag)
        {
            return true;
        }
        flag=true;
        for (int i = 0; i <mat.length ; i++) {
            for (int j = 0; j <mat[0].length ; j++) {
                if (target[i][j]!=mat[mat.length-1-i][mat.length-1-j])
                {
                    flag=false;
                }
            }
        }
        if (flag)
        {
            return true;
        }
        flag=true;
        for (int i = 0; i <mat.length ; i++) {
            for (int j = 0; j <mat[0].length ; j++) {
                if (target[i][j]!=mat[j][mat.length-i-1])
                {
                    flag=false;
                }
            }
        }
        if (flag)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int a[][]={{0,0},{0,1}};
        int b[][]={{0,0},{1,0}};
    }
}

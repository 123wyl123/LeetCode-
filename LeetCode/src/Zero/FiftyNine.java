package Zero;

public class FiftyNine {
    public int[][] generateMatrix(int n) {
        int a[][] = new int[n][n];
        int temp =1;
        for (int i = 0; i <(n+1)/2 ; i++) {
            for (int j = i; j <n-i ; j++) {
                a[i][j]=temp;
                temp++;
            }
            for (int j = i+1; j <n-i ; j++) {
                a[j][n-i-1]=temp;
                temp++;
            }
            for (int j = n-i-2; j >i ; j--) {
                a[n-i-1][j]=temp;
                temp++;
            }
            for (int j = n-i-1; j >i ; j--) {
                a[j][i] = temp;
                temp++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        new FiftyNine().generateMatrix(3);
    }
}

package Thirteen;

public class Ten {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int a[] = new int[arr.length+1];
        for (int i = 1; i <=arr.length ; i++) {
            a[i] =  a[i-1]^arr[i-1];
        }
        int b[]= new int[queries.length];
        for (int i = 0; i<b.length ; i++) {
            int i1 = queries[i][0];
            int i2 = queries[i][1];
            b[i] = a[i2+1]^a[i1];
        }
        return b;
    }
}

package Fourteen;

public class Nine {
    public int[] processQueries(int[] queries, int m) {
        int a[] = new int[m];
        for (int i = 0; i <m ; i++) {
            a[i] = i+1;
        }
        int aa[] = new int[queries.length];
        for (int i = 0; i <queries.length ; i++) {
            int query = queries[i];
            for (int j = 0; j <m ; j++) {
                if (a[j]==query)
                {   aa[i] = j;
                    for (int k = j; k >0 ; k--) {
                        int temp = a[k-1];
                        a[k-1] = a[k];
                        a[k] = temp;
                    }
                    break;
                }else
                {
                    continue;
                }
            }
        }
        return aa;
    }

    public static void main(String[] args) {
        int aabv[] ={3,1,2,1};
        new Nine().processQueries(aabv,
        5);
    }
}

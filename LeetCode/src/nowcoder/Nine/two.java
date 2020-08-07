package nowcoder.Nine;

public class two {
    public int solve (int n, int m, int[] a) {
        // write code here
        int num=0;
        int l=0;
        int max =0;
        for (int i = 0; i <n ; i++) {

            if(a[i]==0)
            {
                num++;
            }
            while (num>m) {
                if (a[l] == 0)
                {
                    num--;
                }
                l++;
            }
            max = Math.max(max,i-l+1);
        }
        return max;
    }

    public static void main(String[] args) {
        int a[] ={1,0,0,1,1,1};
        new  two().solve(6,1, a);
    }
}

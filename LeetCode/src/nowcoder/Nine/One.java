package nowcoder.Nine;

public class One {
    public int solve (int n, int k) {
        // write code here

        k = k%n;
     if(n==1||k==0)
     {
         return 0;
     }
     if(n==2)
         return 1;
     if(k==1||k==2||k==n-1||k==n-2)
         return 2;
     return 3;
    }
}



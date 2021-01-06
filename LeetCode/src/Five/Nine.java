package Five;

public class Nine {
    public int fib(int n) {
        int pre =0;
        int cur=1;
        if (n==0)
        {
            return 0;
        }
        if (n==1)
        {
            return 1;
        }
        int k=1;
        while (k<n)
        {
            k++;
            int temp = pre+cur;
            pre =cur;
            cur = temp;
        }
        return cur;
    }
}

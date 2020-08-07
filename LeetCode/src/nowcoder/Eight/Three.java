package nowcoder.Eight;

public class Three {
    public int solve(int n, int[] b) {
        // write code here
        if(n<=2)
        {
            return 0;
        }
        int minCount = Integer.MAX_VALUE;
        boolean has = false;
        for (int i = -1; i <=1 ; i++) {
            for (int j = -1; j <=1 ; j++) {
                int num1 = b[0]+i;
                int num2=  b[1]+j;
                int diff = num2 -num1;
                int cout = Math.abs(i)+Math.abs(j);
                int last = num2;
                int k=2;
                for (; k <n ; k++) {
                    if (Math.abs(b[k] - last - diff) <= 1)
                    {
                        if(b[k]-last-diff!=0)
                        {
                            cout++;
                        }
                        last=last+diff;
                    }else
                    {
                        break;
                    }
                }
                if(k==n)
                {
                    has =true;
                    minCount=Math.min(minCount,cout);
                }
            }
        }
        return has?minCount:-1;
    }
}

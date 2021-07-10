package FiftySix;

public class One {
    public int countTriples(int n) {
        int temp=0;
        for (int i = 1; i <n ; i++) {
            for (int j = 1; j <n ; j++) {
                int a=i*i+j*j;
                int pow = (int)Math.pow(a, 0.5);
                if(pow*pow==a&&pow<=n)
                {
                    temp++;
                }
            }
        }
        return temp;
    }
}

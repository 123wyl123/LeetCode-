package Three;

public class Thirteen {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int length = primes.length;
        int io[] = new int[length];
        int chou[] = new int[n];
        chou[0] =1;
        for (int i = 1; i <n ; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j <primes.length ; j++) {
                min = Math.min(min,chou[io[j]]*primes[j]);
            }
            chou[i] = min;
            for (int j = 0; j <primes.length ; j++) {
                if( chou[io[j]]*primes[j]==min)
                {
                    io[j]++;

                }
            }
        }
        return chou[n-1];
    }

    public static void main(String[] args) {
        int a[] ={2,7,13,19};
        new Thirteen().nthSuperUglyNumber(12,a);

//[1,2,4,7,8,13,14,16,19,26,28,32] 。
    }
}

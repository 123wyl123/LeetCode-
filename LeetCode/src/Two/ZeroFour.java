package Two;

public class ZeroFour {
    public int countPrimes(int n) {

        boolean a[] = new boolean[n];
        for (int i = 2; i <n ; i++) {
            a[i] = true;
        }
        for (int i = 2; i <n ; i++) {
            if (!a[i])
            {
                continue;
            }
            for (int j = i*i; j <n ; j+=i) {
                a[i] = false;
            }
        }
        int count =0;
        for (int i = 2; i <n ; i++) {
            if (a[i])
            {
                count++;
            }
        }
        return count;
    }



}

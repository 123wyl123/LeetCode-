package Twelve;

public class One {
    public int nthUglyNumber(int n, int a, int b, int c) {
        if (n < 1 || a < 1 || b < 1 || c < 1) throw new IllegalArgumentException("invalid param");

        // 两两组合的最小公倍数
        long lcmAB = lcm(a, b);
        long lcmAC = lcm(a, c);
        long lcmBC = lcm(b, c);
        // 三个数的最小公倍数
        long lcm = lcm(lcmAB, c);

        // lcm之内的数字数目，即一个周期内的元素数
        long m = lcm / a + lcm / b + lcm / c - lcm / lcmAB - lcm / lcmAC - lcm / lcmBC + 1;

        long epoch = n / m;
        long r = n % m;
        long result = epoch * lcm;
        if (r > 0) {

            long left = 1, right = lcm;
            while (left < right) {
                long mid = left + (right - left) / 2;
                long count = mid / a + mid / b + mid / c - mid / lcmAB - mid / lcmAC - mid / lcmBC + mid / lcm;
                if (count >= r) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            // 最后left就是要查找的值
            result += left;
        }

        return (int) result;


    }

    private long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    // 最大公因数
    private long gcd(long x, long y) {
        if (x == 0) return y;
        return gcd(y % x, x);
    }


    public static void main(String[] args) {
        new One().nthUglyNumber(4, 2, 3, 4);
    }

}

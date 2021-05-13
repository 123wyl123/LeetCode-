package Acwing.twelfthBlueBridge;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long res = 1;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                int s = 0;
                while (n % i == 0) {
                    s++;
                    n /= i;
                }
                if (s % 2 == 1) {
                    res = res * i;
                }
            }
        }
        if (n > 1) {
            res = res * n;

        }
        System.out.println(res);
    }
}
//    一个整数 a 是一个完全平方数，是指它是某一个整数的平方，即存在一个整数 b，使得 a=b2。
//
//        给定一个正整数 n，请找到最小的正整数 x，使得它们的乘积是一个完全平方数。
//
//        输入格式
//        输入一行包含一个正整数 n。
//
//        输出格式
//        输出找到的最小的正整数 x。

//就是将这个数分解，凑平方，
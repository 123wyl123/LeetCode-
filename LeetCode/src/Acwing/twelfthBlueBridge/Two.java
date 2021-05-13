package Acwing.twelfthBlueBridge;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int k=0;
        for (int j = 1; j <i ; j++) {
            if (j*j%i>(i+1)/2)
            {
                k++;
            }
        }
        System.out.println(k);
    }
}

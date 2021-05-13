package Acwing.twelfthBlueBridge;

import java.util.Scanner;

//ACWING 3496
public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tem=0;
        for (int i = 0; i <5 ; i++) {
            int i1 = scanner.nextInt();

            if(i1/1000==i1%100/10&&i1%1000/100==(i1%10-1))
            {
                tem++;
            }
        }
        System.out.println(tem);
    }

}

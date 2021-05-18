package Acwing.ThirtyFour;


import java.io.IOException;
import java.util.Scanner;

public class EightyOne {
    public static void main(String[] args) throws IOException {


            Scanner in = new Scanner(System.in);
            int jiecheng[] = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800};//因为只用算阶乘的和就用01背包的做法
            while (in.hasNext()) {
                int n = in.nextInt();
                if (n < 0) break;//如果出现小于0的就停止输入
                int dp[] = new int[n + 1];//建立一维dp数组
                for (int i = 0; i <= 10; i++)//因为阶乘到10的6次方也就需要10个，注意题目还有0的阶乘！！！这是我刚开始
                //没想到的
                {
                    for (int j = n; j >= jiecheng[i]; j--)//一维数组就得逆序，因为不像二维dp[i][j]单独独立出来的，会
                    //受到前面j-jiechehg[i]的改动而改动，所以逆序能让dp[j]不收前面dp[j-jiecheng[i]]的影响而改变
                    {
                        dp[j] = Math.max(dp[j], dp[j - jiecheng[i]] + jiecheng[i]);
                    }
                }
                if (n != 0)//出现0就是NO，因为0的阶乘也至少为1对吧！
                {
                    if (dp[n] == n)//因为我是通过求当前值能被阶乘瓜分的最大值来判断的，所以最大值等于它本身那么就可以
                    {
                        System.out.println("YES");
                    } else//否则就是不行
                    {
                        System.out.println("NO");
                    }
                } else {
                    System.out.println("NO");
                }
            }
        }
    }



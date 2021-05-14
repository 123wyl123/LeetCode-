package Acwing.ThirtyFive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Ten {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        int[] data1=new int[n];
        int[] data2=new int[n];
        String[] a1=bufferedReader.readLine().split(" ");
        String[] a2=bufferedReader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            data1[i]=Integer.valueOf(a1[i]);
        }
        for (int i = 0; i < n; i++) {
            data2[i]=Integer.valueOf(a2[i]);
        }
        int[] map=new int[1000001];
        Arrays.fill(map,-1);
        for (int i = 0; i < data1.length; i++) {
            map[data1[i]]=i;
        }
        ArrayList<Integer> ss=new ArrayList<>();
        for (int i = 0; i < data1.length; i++) {
            if(map[data2[i]]!=-1)
                ss.add(map[data2[i]]);
        }
        int[] num=new int[ss.size()];
        for (int i = 0; i < num.length; i++) {
            num[i]=ss.get(i);
        }

        System.out.println(lengthOfLIS(num));
    }


    public static int lengthOfLIS(int[] nums) {
        int len = 0, n = nums.length;
        if (n == 0) {
            return 0;
        }
        int[] d = new int[n + 1];
        d[len] = nums[0];
        for (int i = 1; i < n; ++i) {
                int l = 0, r = len, pos = 0;
                while (l <r) {
                    int mid = (l + r+1) >> 1;
                    if (d[mid] < nums[i]) {
                        pos = mid;
                        l = mid ;
                    } else {
                        r = mid - 1;
                    }
                }
                if (d[pos]<nums[i])
                {
                    d[pos+1]=nums[i];
                    len =Math.max(len,pos+1);
                }else
                {
                d[pos]=nums[i];
                }

                //这个IF判断是为了区分修改长度为1和其他，也可以在0坐标赋值-1，之后取值都是pos+1
        }
        return len+1;
    }
    }


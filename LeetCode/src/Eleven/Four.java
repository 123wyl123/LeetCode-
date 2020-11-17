package Eleven;

import java.util.LinkedList;
import java.util.List;

public class Four {
    LinkedList<Integer> integers ;
    public List<Integer> pathInZigZagTree(int label) {

       integers = new LinkedList<>();
//        if (label==1)
//        {   integers.addFirst(1);
//            return integers;
//        }
        int a = 0;
        int sum =0;
        int aa[] = new int [1000];
        while (sum<label)
        {
            a++;
            sum+=Math.pow(2,a-1);
            aa[a] = sum;
        }
        if (a%2==0)
        {
            integers.addFirst(label);
            label=label/2;
            search(aa,label,false,a-1);
        }else
        {
            integers.addFirst(label);
            label=label/2;
            search(aa,label,true,a-1);
        }

        return integers;
    }
    void search(int a[] ,int m,boolean flag,int cen)
    {
            if (m==1)
            {
                integers.addFirst(1);
                return;
            }
            int temp = a[cen]+1;
            int temp1 = a[cen-1];
            int kk=temp+temp1-m;
            integers.addFirst(kk);
            search(a,kk/2,flag,cen-1);

    }

    public static void main(String[] args) {
        new Four().pathInZigZagTree(1);
    }
}

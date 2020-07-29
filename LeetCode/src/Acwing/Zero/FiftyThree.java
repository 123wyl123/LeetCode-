package Acwing.Zero;

import java.util.List;

public class FiftyThree {
    List<Integer> list;
    public List<Integer> getLeastNumbers_Solution(int [] input, int k) {
        int n = input.length;
        for (int i = n/2-1; i >=0 ; i--) {
            heapify(input,n,i);
        }
        for (int i = 1; i <=k; i++) {
            int temp = input[0];
            list.add(temp);
            input[0] = input[n-i];
            input[n-i] = input[0];

            heapify(input,n-i,0);
        }

     return list;
    }


    public void heapify(int[] input,int n,int k)
    {
        int min = k;
        int l = 2*k+1;
        int r = 2*k+2;
        if(l<n&&input[min]>input[l])
        {
            min = l;
        }
        if(r<n&&input[min]>input[r])
        {
            min = r;
        }
        if(min!=k)
        {
            int temp = input[min] ;
            input[min] = input[k];
            input[k] = temp;
            heapify(input,n,min);
        }
    }
}

//输入n个整数，找出其中最小的k个数。

package Three;

import java.util.LinkedList;
import java.util.List;

public class Fifteen {
    int a[]  ;
    public List<Integer> countSmaller(int[] nums) {

        int length = nums.length;
        if (length==0)
        {
            return null;
        }
        Node2 ni[] = new Node2[length];
        for (int i = 0; i <length ; i++) {
            ni[i] = new Node2(nums[i],i);
        }
         a  = new int [length];
        GuiBing(0,length-1,ni);
        LinkedList<Integer> integers = new LinkedList<>();
        for (int i : a) {
            integers.addLast(i);
        }
        return integers;
    }
    public Node2[] GuiBing(int l , int r , Node2[] nums)
    {   if (l>=r)
    {
        return new Node2 []{nums[l]};
    }
        int mid = (l+r)/2;
        Node2 left[] =GuiBing(l,mid,nums);
        Node2 right[] =GuiBing(mid+1,r,nums);
        Node2 temp []= new Node2[r-l+1];
        int i=0;
        int j=0;
        int k=0;
        int pre =0;
        while (i<left.length&&j<right.length)
        {
            if (left[i].a<right[j].a)
            {
                temp[k++] = left[i];
                a[left[i].b] +=pre;
                i++;

            }else if (left[i].a>right[j].a)
            {
                temp[k++] = right[j];
                j++;
                pre ++;
            }else
            {
                temp[k++] = left[i];
                a[left[i].b] +=pre;
                i++;
            }
        }
        if (i==left.length)
        {
            while (j<right.length)
            {
                temp[k++] = right[j++];
            }
        }
        if (j==right.length)
        {
            while (i<left.length)
            {
                temp[k++] = left[i];
                a[left[i].b]+=j;
                i++;
            }
        }
        return temp;
    }


    class Node2
    {
        int a;
        int b ;
        Node2(int a, int b)
        {
            this.a = a;
            this.b = b;
        }
    }

    public static void main(String[] args) {
        int a[]={26,78,27,100,33,67,90,23,66,5,38,7,35,23,52,22,83,51,98,69,81,32,78,28,94,13,2,97,3,76,99,51,9,21,84,66,65,36,100,41};
        List<Integer> list = new Fifteen().countSmaller(a);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}


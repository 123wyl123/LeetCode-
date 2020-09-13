package Two;

import java.util.LinkedList;
import java.util.List;

public class SixTeen {
    List<List<Integer>> a;
    int temp;
    public List<List<Integer>> combinationSum3(int k, int n) {
        temp = n;
        a = new LinkedList<>();
        c(1,k,0,new LinkedList<Integer>());
        return a;
    }
    public void c(int l,int n,int total,LinkedList<Integer> ll)
    {
        if (ll.size()==n)
        {
            if (total==temp)
            {
                a.add(new LinkedList<>(ll));
                return;
            }
        return;
        }
        for (int i = l; i <10 ; i++) {
            if (total+i>temp)
            {
                return;
            }else
            {   total+=i;
                ll.add(i);
                c(i+1,n,total,ll);
                ll.removeLast();
                total-=i;
            }
        }

    }

    public static void main(String[] args) {
        new SixTeen().combinationSum3(3,7);
    }
}

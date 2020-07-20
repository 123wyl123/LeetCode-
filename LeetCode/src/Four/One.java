package Four;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class One {
    int nums;
    ArrayList<Integer> a;
    public List<String> readBinaryWatch(int num) {
        ArrayList<String > b= new ArrayList<>();
        nums=num;
        a = new ArrayList<>();
        int [] m = new int[10];
        df(num,0,m);
    Integer[] strings = new Integer[a.size()];
        a.toArray(strings);
        Arrays.sort(strings);
        for (Integer string : strings) {
            if(string<10)
            {
                b.add("0:0"+string);
            } else if(string<100)
            {
                b.add("0:"+string);
            } else
            {   if(string%100<10)
            {
                b.add(string/100+":0"+string%100);
            }else
            {
                b.add(string/100+":"+string%100);
            }

            }
        }
        return b;

    }
    public void df(int n,int l,int[] m)
    {
        if(n==0)
        {   int h=0;
            int mi=0;

            for (int i = 0; i <6 ; i++) {
                mi+=m[i]*Math.pow(2,i);
            }
            for (int i = 6; i <m.length ; i++) {
                h+=m[i]*Math.pow(2,i-6);
            }
            if(h>11)
            {
                return;
            }
            if(mi>59)
            {
                return;
            }
            if(h==0)
            {   if(mi<10)
            {
                a.add(mi);
                return;
            }else
            {
                a.add(mi);
                return;
            }

            }
            if(mi==0)
            {
                a.add(h*100);
                return;
            }else if(mi<10)
            {
                a.add(h*100+mi);
                return;
            }else
            {
                a.add(h*100+mi);
                return;
            }

        }
        for (int i =l; i <m.length ; i++) {
            m[i]=1;
            df(n-1,i+1,m);
            m[i] =0;
        }
    }

    public static void main(String[] args) {
        new One().readBinaryWatch(2);
    }
}

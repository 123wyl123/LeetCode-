package Twelve;

public class TwentyOne {
    public int balancedStringSplit(String s) {
        char a[]= s.toCharArray();

        int aa=0;
        int bb=0;
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]=='R')
            {
                aa++;
            }else if(a[i]=='L')
            {
                bb++;
            }
            if(aa==bb)
            {
                sum++;
                aa=0;
                bb=0;
            }

        }
        return sum;
    }
}
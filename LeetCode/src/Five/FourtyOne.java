package Five;

public class FourtyOne {
    public String reverseStr(String s, int k) {
        char a[]=s.toCharArray();
        int l=0;
        int len = s.length();
        while(l<len)
        {
            int r= Math.min(len-1,l+k-1);
            int temp=r;
            while(l<r)
            {
                char zhongjianzhi = a[l]    ;
                a[l]=a[r];
                a[r]=zhongjianzhi;
                l++;
                r--;
            }
            l=temp+k+1;
        }
        return new String(a);
    }
}
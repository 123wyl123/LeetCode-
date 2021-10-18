package Four;

public class SeventySix {
    public int findComplement(int num) {
        int temp=0;
        int i=0;
        while(num!=0)
        {
            int cur=num&1;
            temp=temp+((1-cur)<<i);
            i++;
            num=num/2;
        }
        return temp;
    }
}
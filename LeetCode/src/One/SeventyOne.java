package One;

public class SeventyOne {
    public int titleToNumber(String columnTitle) {
        char a[]=columnTitle.toCharArray();
        int sum=0;
        int c=0;
        for(int i = a.length-1;i>=0;i--)
        {
            sum=sum+(int)Math.pow(26, c)*(1+a[i]-'A');
            c++;
        }
        return sum;
    }
}
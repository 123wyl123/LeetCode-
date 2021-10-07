package Four;

public class ThirtyFour {
    public int countSegments(String s) {
        int num=0;
        int sum=0;
        char b[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(b[i]!=' ')
            {   num++;
                continue;
            }else
            {
                if(num!=0)
                {
                    sum++;
                    num=0;
                }

            }
        }
        if(num!=0)
        {
            sum++;
        }
        return sum;
    }
}
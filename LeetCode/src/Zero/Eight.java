package Zero;

public class Eight {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0)
        {
            return 0;
        }

        boolean a=false;
        int i =0;

        if(s.charAt(i)=='-')
        {
            a=true;
            i++;
        }else if(s.charAt(i)=='+')
        {
            a=false;
            i++;
        }
        while(i<s.length()&&s.charAt(i)=='0')
        {
            i++;
        }






        long cur =0;
        while(i<s.length())
        {    if(s.charAt(i)>='0'&&s.charAt(i)<='9')
        {cur=cur*10+s.charAt(i++)-'0';}
        else{
            if(a)
            {
                return -(int )cur;
            }else{
                return (int )cur;
            }

        }
            if(a&&cur<Integer.MIN_VALUE||cur>Integer.MAX_VALUE)
            {
                if(a)
                {
                    return Integer.MIN_VALUE;
                }else{
                    return Integer.MAX_VALUE;
                }
            }
        }
        if(a)
        {
            return -(int )cur;
        }else{
            return (int )cur;
        }
    }
}



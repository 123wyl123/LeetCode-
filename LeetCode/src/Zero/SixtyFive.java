package Zero;

public class SixtyFive {
    public boolean isNumber(String s) {
        char[] chars = s.toCharArray();
        boolean flag =true;
        boolean isdig = true;
        int i=0;
        if (chars[i]=='+'||chars[i]=='-')
        {
            i++;
        }
        for ( i =i ;i <chars.length ; i++) {
            if (chars[i]=='.'&&flag)
            {
                flag=false;
            }else if (chars[i]=='.'&&!flag)
            {
                return false;
            }else if(chars[i]=='e'||chars[i]=='E')
            {
                if (isdig)
                {
                    return false;
                }
                return isNum(chars,i+1);
            }else if (chars[i]=='+'||chars[i]=='-')
            {
                return false;
            }else if(chars[i]<'0'||chars[i]>'9')
            {
                return false;
            }else
            {
                isdig=false;
            }
        }
        if (isdig)
        {
            return false;
        }
        return true;
    }
    boolean isNum(char[] s,int n)
    {   if (n==s.length)
    {
        return false;
    }
        if (s[n]=='+'||s[n]=='-')
        {
            n++;
        }
        if (n==s.length)
        {
            return false;
        }
        while (n<s.length)
        {
            if (s[n]<'0'||s[n]>'9')
            {
                return false;
            }
            n++;
        }
        return true;
    }

}



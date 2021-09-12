package Six;

public class SeventyEight {
    public boolean checkValidString(String s) {
        if(s.length()==0)
        {
            return true;
        }
        int a=0;
        int b=0;
        int c=0;
        char cha1r[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(cha1r[i]=='(')
            {
                a++;
            }else if(cha1r[i]=='*')
            {
                b++;
            }else
            {
                c++;
            }
            if(c>a+b)
            {
                return false;
            }
        }
        a=0;
        b=0;
        c=0;

        for(int i=s.length()-1;i>=0;i--)
        {
            if(cha1r[i]=='(')
            {
                a++;
            }else if(cha1r[i]=='*')
            {
                b++;
            }else
            {
                c++;
            }
            if(a>c+b)
            {
                return false;
            }

        }
        return true;
    }
}
package Zero;

public class LeTen {
    public boolean isMatch(String s, String p) {
        if(p==".*")
        {
            return true;
        }
        int j=0;
        for (int i = 0; i <p.length() ; i++) {
            if(p.charAt(i)==s.charAt(j))
            {

                j++;
            }
            else if(p.charAt(i)=='.')
            {   if(p.charAt(i+1)=='*')
            {
                return true;
            }
                j++;
            }
            else if(p.charAt(i)=='*')
            {
                while (s.charAt(j)==p.charAt(i-1))
                {
                    j++;
                    if(j==p.length())
                    {
                        return true;
                    }
                }
            }

        }
        if(j==s.length())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

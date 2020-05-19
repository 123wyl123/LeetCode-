package One;

public class LeNine {
    public boolean isPalindrome(int x) {
        int temp=0;
        if(x<0)
        {
        return  false;
        }
        else if(x==0)
        {
            return true;
        }
        else
        {   int a;
            int l =x;
            while (x!=0)
            {

                a=x%10;
                x=x/10;
                temp=temp*10+a;
            }
            if(temp==l)
            {
                return  true;
            }
            else
            {
                return  false;
            }
        }
    }
}

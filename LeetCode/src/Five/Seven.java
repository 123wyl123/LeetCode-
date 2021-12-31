package Five;

public class Seven {
    public boolean checkPerfectNumber(int num) {
        if(num==1)
        {
            return false;
        }
        int result =1;
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                result+=i;
                if(num/i!=i)
                {
                    result+=(num)/i;
                }
            }
        }
        System.out.println(result);
        return result==num;
    }
}

package TwoFourSix;

public class Two {
    public int numberOfRounds(String startTime, String finishTime) {
        String[] split = startTime.split(":");
        String[] s = finishTime.split(":");
        if (Integer.valueOf(split[0])>Integer.valueOf(s[0]))
        {
           int temp= Integer.valueOf(s[0])+24-Integer.valueOf(split[0]);
           return (temp-1)*4+num(Integer.valueOf(split[1]),60)+num(0,Integer.valueOf(Integer.valueOf(s[1])));
        }else if (Integer.valueOf(split[0])==Integer.valueOf(s[0])&&Integer.valueOf(split[1])>Integer.valueOf(s[1]))
        {
            int temp= Integer.valueOf(s[0])+24-Integer.valueOf(split[0]);
            return (temp-1)*4+num(Integer.valueOf(split[1]),60)+num(0,Integer.valueOf(Integer.valueOf(s[1])));
        }else
        {
            int temp = Integer.valueOf(s[0])-Integer.valueOf(split[0]);
           if (temp==0)
           {
              return num(Integer.valueOf(split[1]),Integer.valueOf(s[1]));
           }else
           {
               return num(0,Integer.valueOf(s[1]))+(temp-1)*4+num(Integer.valueOf(split[1]),60);
           }

        }

    }
    public int num(int a, int b)
    {   int temp=0;
        for (int i = 0; i <=60 ; i+=15) {
            if (a==i)
            {
                if (b>=i+15)
                {
                    temp++;
                }
            }else if (a<i)
            {
                if (b>=i+15)
                {
                    temp++;
                }
            }
        }
        return temp;
    }


}

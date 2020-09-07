package TwoZeroFive;

public class One {
    public String modifyString(String s) {
        String a = "";
        if(s.charAt(0)=='?')
        {
            if(s.charAt(1)=='?')
            {
                a+='a';
            }else
            {
               if(s.charAt(1)=='a')
               {
                   a+='b';
               }else if(s.charAt(1)=='z')
               {
                   a+='a';
               }else
               {
                   a+=(char) (s.charAt(1)+1);
               }
            }
        }else
        {
            a+=s.charAt(0);
        }
        for (int i = 1; i <s.length() -1; i++) {
            if(s.charAt(i)=='?')
            {
                char c = s.charAt(i - 1);
                char c1 = s.charAt(i + 1);
                if(c=='?')
                {
                    c=a.charAt(i-1);
                }

                while (c+1==c1&&c<='z')
                {
                   c = (char) (c+1);
                }
                if(c=='z')
                {
                    a+='a';
                }else
                {
                    a+=(char) (c+1);
                }
            }else
            {
                a+=s.charAt(i);
            }
        }
        if(s.charAt(s.length()-1)=='?')
        {

                if(a.charAt(s.length()-2)=='a')
                {
                    a+='b';
                }else if(s.charAt(s.length()-2)=='z')
                {
                    a+='a';
                }else
                {
                    a+=(char) (s.charAt(s.length()-2)+1);
                }

        }else
        {
            a+=s.charAt(s.length()-1);
        }
        return a;
    }


}

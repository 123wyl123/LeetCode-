package Zero;

public class Thirteen {
    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
    int k =0;
        for (int i = 0; i <s.length(); i++) {
            if (chars[i]=='I')
            {
                if (i+1<s.length()&&chars[i+1]=='V')
                {
                    k+=4;
                    i++;
                }else if (i+1<s.length()&&chars[i+1]=='X')
                {
                    k+=9;
                    i++;
                }else
                {
                    k++;

                }
            }else if (chars[i]=='V') {
                k += 5;
            }else if (chars[i]=='X')
            {
                if (i+1<s.length()&&chars[i+1]=='L')
                {
                    k+=40;
                    i++;
                }else if (i+1<s.length()&&chars[i+1]=='C')
                {
                    k+=90;
                    i++;
                }else
                {
                    k+=10;

                }
            }else if (chars[i]=='L')
            {
                k+=50;
            }else if (chars[i]=='C')
            {
                if (i+1<s.length()&&chars[i+1]=='D')
                {
                    k+=400;
                    i++;
                }else if (i+1<s.length()&&chars[i+1]=='M')
                {
                    k+=900;
                    i++;
                }else
                {
                    k+=100;

                }
            }else if (chars[i]=='D')
            {
                k+=500;
            }else
            {
                k+=1000;
            }


        }
        return k;
    }
}

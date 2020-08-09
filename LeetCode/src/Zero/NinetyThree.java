package Zero;

import java.util.LinkedList;
import java.util.List;

public class NinetyThree {
    String [] b ;
    List<String> aa;
    public List<String> restoreIpAddresses(String s) {
        int length = s.length();
        b = new String[4];
        aa = new LinkedList<>();
        res(s,0,0);
        return aa;
    }
    public void res(String s,int n ,int l)
    {
        if(l==4)
        {  int kk=0;
            if(n<s.length())
            {
                return;
            }
            for (int i = 0; i <4 ; i++) {
                kk+=b[i].length();
                if(Integer.parseInt(b[i])>255)
                {
                    return;
                }
            }
            if(kk==s.length())
            {   String m="";
                for (int i = 0; i <3 ; i++) {
                    m+=b[i]+".";
                }
                m+=b[3];
                aa.add(m);
                return;
            }else
            {
                return;
            }
        }
        String  s1 = "";
        for (int i = n; i <s.length() ; i++) {

            s1+=s.charAt(i);
            b[l] =s1;

            if(Integer.parseInt(s1)>255)
            {
                return;
            }
            res(s,i+1,l+1);
            if(s1.equals("0"))
            {
                return;
            }

        }
    }

    public static void main(String[] args) {
      String aaa=  "010010";
      new NinetyThree().restoreIpAddresses(aaa);
    }

}


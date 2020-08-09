package TwoZeroOne;

public class One {
    public String makeGood(String s) {
        String a = "";
        int length = 0;
        if(s.length()==1)
        {
            return s;
        }
        while(s.length()!=length){

            a = "";
            length = s.length();
            int i;
        for (i = 0; i <s.length()-1 ; ) {
          if( Math.abs(s.charAt(i)-s.charAt(i+1))==32)
            {
                i+=2;
            }else
          { a+=s.charAt(i);
              i++;
          }
        }
     if(i==s.length())
     {
         s=a;
     }else
     {
         a+=s.charAt(s.length()-1);
         s=a;
     }

    }
        return s;
    }

    public static void main(String[] args) {
      String a =  "SAYTTveEVttyaswmMwnNCMmcnNWmMWhIgZyWnFirRIfNwYzGiHhH";
      new One().makeGood(a);
    }
}

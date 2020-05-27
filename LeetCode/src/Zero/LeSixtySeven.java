package Zero;

public class LeSixtySeven {
    public String addBinary(String a, String b) {
        if(a.length()==0)
        {
            return b;
        }
        if(b.length()==0)
        {
            return a;
        }
        int c ;
        int temp = 0;
       if(a.length()>=b.length())
       {
           c=b.length();
       }
       else
       {
           c = a.length();
       }
       String m ="";
       int j =0;
      int f=1;
      int a1 = a.length();
      int b1 = b.length();
       for (int i =c ;i>0;i--)
       {
           temp = j+Integer.parseInt(String.valueOf(a.charAt(--a1)))+Integer.parseInt(String.valueOf(b.charAt(--b1)));
           j=0;
           if(temp>=2)
           {
               temp = temp -2;
               j=1;
           }
            m = temp+m;
       }

       if(a.length()>b.length())
       {    for(int i=a.length()-c;i>0;i--)

        {
            temp = j+Integer.parseInt(String.valueOf(a.charAt(--a1)));
            j=0;
            if(temp>=2)
            {
                temp = temp -2;
                j=1;
            }
       m=temp+m;
        }

       }
       else if (a.length()<b.length())
       {
           for(int i=b.length()-c;i>0;i--)

           {
               temp = j+Integer.parseInt(String.valueOf(b.charAt(--b1)));
               j=0;
               if(temp>=2)
               {
                   temp = temp -2;
                   j=1;
               }
               m=temp+m;
           }

       }
        if(j==1)
        {
            return 1+m;
        }

    return  m;
    }
    public String addBinary1(String a, String b) {
        int n = a.length(), m = b.length();
        if (n < m) return addBinary(b, a);
        int L = Math.max(n, m);

        StringBuilder sb = new StringBuilder();
        int carry = 0, j = m - 1;
        for(int i = L - 1; i > -1; --i) {
            if (a.charAt(i) == '1') ++carry;
            if (j > -1 && b.charAt(j--) == '1') ++carry;

            if (carry % 2 == 1) sb.append('1');
            else sb.append('0');

            carry /= 2;
        }
        if (carry == 1) sb.append('1');
        sb.reverse();

        return sb.toString();
    }


    public static void main(String[] args) {
       String  a = "101111";
       String b = "10";
       LeSixtySeven m = new LeSixtySeven();
        String m1 = m.addBinary1(a,b);
        System.out.println(m1);
    }

}

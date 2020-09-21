package Zero;

public class NinetyOne {

    public int numDecodings(String s) {
        if (s.charAt(0)=='0')
        {
            return 0;
        }
        char[] chars = s.toCharArray();

        int count = 0;
        count = decode(chars,chars.length-1,0);
        return count;
    }
     int decode(char[] chars,int index,int count)
     {
         if (index<=0)
         {
             return 1;
         }
         if (chars[index]>'0')
         {
             count = decode(chars,index-1,count);
         }


             if (chars[index-1]=='1'||chars[index-1]=='2'&&chars[index]<='6')
             {
                count+= decode(chars,index-2,count);
             }

         return count;
     }
    public int numDecodings1(String s) {
        if (s.charAt(0)=='0')
        {
            return 0;
        }
        int a[] = new int[s.length()+1];
        a[0]=1;
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)!='0')
            {
                a[i+1] = a[i];
            }
            if (i-1>=0&&(s.charAt(i-1)=='1'||s.charAt(i-1)=='2'&&s.charAt(i)<='6'))
            {
                a[i+1]+=a[i-1];
            }
        }
        return a[s.length()];
    }

    public static void main(String[] args) {
        new NinetyOne().numDecodings1("17");

    }
}

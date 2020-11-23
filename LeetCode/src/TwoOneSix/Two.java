package TwoOneSix;

public class Two {
    public String getSmallestString(int n, int k) {
        StringBuffer stringBuffer = new StringBuffer();
        int sum =0;
        if ((n-1)+26<=k)
        {
            while (sum+26<k&&(n-1)+26+sum<=k)
            {   sum+=26;
                stringBuffer.append('z');
                n--;
            }
        }

      stringBuffer.append( (char)(k- sum-(n-1)-1+'a'));
       n--;
        for (int i = 0; i <n ; i++) {
            stringBuffer.append('a');
        }
      return  stringBuffer.reverse().toString();
    }

    public static void main(String[] args) {
        new Two().getSmallestString(85,2159);
    }
}

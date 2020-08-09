package TwoZeroOne;

public class Two {
    public char findKthBit(int n, int k) {

        String a[] = new String[n+2];
        a[0]="0";
        a[1] = "011";
        a[2] = "0111001";
        if(n<=3)
        {
            return a[n-1].charAt(k-1);
        }
        for (int i = 3; i <n ; i++) {
            a[i]=a[i-1]+"1";
        StringBuilder string =new StringBuilder();
            for (int j = 0; j <a[i-1].length() ; j++) {

              if(a[i-1].charAt(j)=='0')
              {
                  string.append('1');
              }else
              {
                 string.append('0');
              }
            }

            StringBuilder reverse = string.reverse();
            a[i]+=reverse;
        }

    return a[n-1].charAt(k-1);
    }
}

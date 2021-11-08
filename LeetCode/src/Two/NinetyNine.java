package Two;

public class NinetyNine {
    public String getHint(String secret, String guess) {
        int a[]=new int[10];
        int b[]=new int[10];
        int A=0;
        int B=0;
        for(int i =0;i<secret.length();i++)
        {
            if(secret.charAt(i)==guess.charAt(i))
            {
                A++;
            }else
            {
                a[(int)(secret.charAt(i)-'0')]++;
                b[(int)(guess.charAt(i)-'0')]++;
            }
        }
        for(int i=0;i<10;i++)
        {
            B+=Math.min(a[i],b[i]);
        }
        StringBuffer res = new StringBuffer();
        res.append(A);
        res.append('A');
        res.append(B);
        res.append('B');
        return res.toString();
    }
}
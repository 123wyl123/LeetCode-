package Four;

public class EightyTwo {
    public String licenseKeyFormatting(String s, int k) {
        StringBuffer string = new StringBuffer();
        char a[]=s.toCharArray();
        int temp=0;
        for(int i=a.length-1;i>=0;i--)
        {
            if(a[i]=='-')
            {
                continue;
            }else
            {
                if(temp<k)
                {
                    temp++;
                    if(a[i]>='a'&&a[i]<='z')
                    {
                        string.append((char)(a[i]-'a'+'A'));
                    }else
                    {
                        string.append(a[i]);
                    }
                }else
                {
                    string.append('-');
                    temp=1;
                    if(a[i]>='a'&&a[i]<='z')
                    {
                        string.append((char)(a[i]-'a'+'A'));
                    }else
                    {
                        string.append(a[i]);
                    }
                }
            }
        }
        return string.reverse().toString();
    }
}


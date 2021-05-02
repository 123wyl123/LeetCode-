package TwoThreeNine;

public class Two {
    boolean flag;
    public boolean splitString(String s) {
        flag = false;
        dfs(s.toCharArray(),s.length(),0,0);
        return flag;
    }
    void dfs(char[] a, int n, int l,int pre)
    {
        if (flag)
    {
        return;
    }
            int temp =0;
        for (int i = l; i <n ; i++) {
            if (l!=0)
            {   temp = temp*10+a[i]-'0';
                if (pre-temp==1)
                {
                dfs(a,n,i+1,temp);
                }else if (pre-temp<1)
                {
                    return;
                }else
                {
                  continue;
                }
            }else
            {

                    temp=temp*10+a[i]-'0';
                    dfs(a,n,i+1,temp);

            }
        }
        if (pre-temp==1&&l!=n)
        {
            flag = true;
        }
    }

    public static void main(String[] args) {
        new Two().splitString("001");
    }
}

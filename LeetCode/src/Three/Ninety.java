package Three;

public class Ninety {
    public int lastRemaining(int n) {
        int a1=1,an=n;
        int k=0,cnt=n,step = 1;
        while(cnt>1)
        {
            if(k%2==0)
            {
                a1 = a1 + step;
                an= (cnt%2==0)?an:an-step;
            }else
            {
                a1=(cnt%2==0)?a1:a1+step;
                an=an-step;
            }
            k++;
            cnt=cnt/2;
            step=step*2;
        }
        return a1;

    }
}


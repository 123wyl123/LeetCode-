package TwoSixOne;

public class Two {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int a[]=new int[n];
        long sum=0;
        for (int i = 0; i <rolls.length ; i++) {
            sum=sum+rolls[i];
        }
        long max = (n+rolls.length)*mean;
        sum=max-sum;
        if (sum<0)
        {
            a=new int[0];
            return a;
        }
        int yushu =(int)(sum%n);
        int geshu=(int)(sum/n);
        if ((geshu<6&&geshu>0)||(geshu==6&&yushu==0))
        {
        for (int i = 0; i <yushu ; i++) {
            a[i]=1;
        }
        for (int i = 0; i <n ; i++) {
            a[i]+=geshu;
        }
            return a;
        }else
        {   a=new int[0];
            return a;
        }

    }
}
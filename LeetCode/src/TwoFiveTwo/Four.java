package TwoFiveTwo;

public class Four {
    long mo = 1000000007;
    public int countSpecialSubsequences(int[] nums) {



        long[][] f = new long[nums.length][3];
        f[0][0] = nums[0] == 0 ? 1 : 0;
        f[0][1] = f[0][2] = f[1][2] = 0;
        for (int i = 1; i < nums.length; ++i) {

                if (nums[i]==0)
                {
                    f[i][0]=(f[i-1][0]+1l)%mo;
                    f[i][1]=f[i-1][1]%mo;
                    f[i][2]=f[i-1][2]%mo;
                }else if (nums[i]==1)
                {
                    f[i][1]=((normalPower(2,f[i-1][0])-1l)+f[i-1][1]*2)%mo;;
                    f[i][0]=f[i-1][0]%mo;
                    f[i][2]=f[i-1][2]%mo;
                }else
                {
                    f[i][0]=f[i-1][0]%mo;
                    f[i][1]=f[i-1][1]%mo;
                    f[i][2]=(f[i-1][2]*2+f[i-1][1])%mo;
                }


        }
        return (int) (f[nums.length - 1][2]%mo);

    }

  long normalPower(long base,long power){
        long result=1;
        while(power>0){
            if(power%2==0){
                //幂为偶数 直接减半 底数平方
                power/=2;
                base=base*base%mo;
            }else{
                //幂为奇数 会多出来一个数哦 记得存下来
                power/=2;
                result=base*result%mo;
                base=base*base%mo;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int a[]={0,1,2,2};
        new Four().countSpecialSubsequences(a);
    }
}
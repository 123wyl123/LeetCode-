package TwoFiveTwo;

public class One {
    public boolean isThree(int n) {
        int temp=0;
        for (int i = 1; i <=n ; i++) {
            if (n%i==0)
            {
                temp++;
            }

        }
        return temp==3?true:false;
    }
}

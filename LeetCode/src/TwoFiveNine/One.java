package TwoFiveNine;

public class One {
    public int finalValueAfterOperations(String[] operations) {
        int sum=0;
        for (String operation : operations) {
            if (operation.equals("--X"))
            {
            sum--;
            }else if (operation.equals("X--"))
            {
                sum--;
            }else
            {
                sum++;
            }
        }
        return sum;
    }
}

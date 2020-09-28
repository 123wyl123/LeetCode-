package TwoZeroEigth;

public class One {
    public int minOperations(String[] logs) {
        int length = logs.length;
        int k =0;
        for (int i = 0; i <length ; i++) {
            if (logs[i].equals("./"))
            {
                continue;
            }else if (logs[i].equals("../"))
            {
                if (k==0)
                {
                    continue;
                }else
                {
                    k--;
                }
            }else
            {
                k++;
            }
        }
        return k;
    }
}


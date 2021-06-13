package BiweeklyFiftyFour;

public class Two {
    public int chalkReplacer(int[] chalk, int k) {
        long sum =0;

        for (int i = 0; i <chalk.length ; i++) {
            sum+=chalk[i];
            if (sum>k)
            {
                return i;
            }
        }
        long k1=(long)k%sum;
        sum=0;
        for (int i = 0; i <chalk.length ; i++) {
            sum+=chalk[i];
            if (sum>k1)
            {
                return i;
            }
        }
        return 0;
    }
}


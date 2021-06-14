package Three;

public class SeventyFour {
    public int guessNumber(int n) {
        long l =1;
        long r = n;
        while (l<r)
        {
            long mid = (l+r+1)/2;
            if (guess((int)mid)==1)
            {
                l=mid;
            }else if (guess((int)mid)==-1)
            {
                r= mid-1;
            }else
            {
                return (int)mid;
            }
        }
        return (int)l;
    }

    int guess(int num)
    {
    return 1;
    }

}

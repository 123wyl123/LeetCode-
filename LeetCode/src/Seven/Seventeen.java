package Seven;

public class Seventeen {
    public boolean isOneBitCharacter(int[] bits) {
        int l=0;
        int length = bits.length;
        boolean flag = false;
        while (l<length)
        {
            if (bits[l]==1)
            {
                l++;
            }else if (bits[l]==0)
            {
                if (l==length-1)
                {
                    flag=true;
                }else
                {

                }
            }
            l++;
        }
        return flag;
    }
}
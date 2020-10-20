package One;

public class SixtySix {
    public int[] plusOne(int[] digits) {
        int a[]  = new int[digits.length+1];
        int temp = 1;
        for (int i = digits.length-1; i >=0 ; i--) {
            if (digits[i]+temp>9)
            {
                digits[i] =0;
                a[i+1] =0;
                temp=1;
            }else
            {   digits[i] = digits[i]+temp;
                a[i+1] = digits[i]+temp;
                temp =0;
            }
        }
        if (digits[0]==0)
        {
            a[0]=1;
            return a;
        }else
        {
            return digits;
        }
    }
}

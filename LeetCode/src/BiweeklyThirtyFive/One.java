package BiweeklyThirtyFive;

public class One {
    public int sumOddLengthSubarrays(int[] arr) {
        int a[] = new int[arr.length];
        a[0] = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            a[i] = a[i-1]+arr[i];
        }
        int k =3;
        int sum =0;
        int te=1;
        sum = a[arr.length-1];
        while (k<=arr.length)
        {
            for (int i = 0; i+2*te <arr.length ; i++) {
                if (i==0)
                {
                    sum+= a[i+2*te]-0;
                }
                else
                {  sum+=  a[i+2*te] - a[i-1];

                }


            }
            k=3+2*te;
            te++;
        }
        return sum;
    }

    public static void main(String[] args) {
      int a[] =  {6,9,14,5,3,8,7,12,13,1};
        new One().sumOddLengthSubarrays(a);
    }
}

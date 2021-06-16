package Eight;

public class FiftyTwo {
    public int peakIndexInMountainArray(int[] arr) {
        int i=0;
        for ( i = 1; i <arr.length ; i++) {
            if (arr[i]>arr[i-1])
            {
                continue;
            }else if (arr[i]==arr[i-1])
            {
                return -1;
            }else
            {
                break;
            }
        }
        int j=0;
        for ( j = i; j <arr.length-1 ; j++) {
            if (arr[j+1]<arr[j])
            {
                continue;
            }else
            {
                break;
            }
        }
        if (j==arr.length-1)
        {
            return i-1;
        }else
        {
            return -1;
        }

    }
}
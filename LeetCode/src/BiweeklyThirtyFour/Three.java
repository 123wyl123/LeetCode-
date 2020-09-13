package BiweeklyThirtyFour;

public class Three {
    public int findLengthOfShortestSubarray(int[] arr) {
        int length = arr.length;
        int start = 0;
        int end   = 0;
        for (int i = 0; i < length-1; i++) {
            if (arr[i] <= arr[i + 1])
            {
                continue;
            }else
            {
                start = i;
                break;
            }
        }
        for (int i = length-1; i >0 ; i--) {
            if(arr[i]>=arr[i-1])
            {
                continue;
            }else
            {
                end = i;
                break;
            }
        }
        int newstart = start;
        int newend = end;
        while (start>=0&&arr[start]>arr[end])
        {
            start--;
        }
        int temp = end-start-1;
        while (end<length&&arr[newstart]>arr[end])
        {
            end++;
        }
        temp = Math.min(temp,end-newstart-1);
        return temp<0?0:temp;
    }



}

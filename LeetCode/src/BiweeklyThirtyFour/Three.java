package BiweeklyThirtyFour;

public class Three {
    public int findLengthOfShortestSubarray(int[] arr) {
if(arr.length<=1)
{
    return 0;
}
int end =-1;
int start = -1;
        for (int i = arr.length-1; i >0 ; i--) {
            if(arr[i]<arr[i-1])
            {
                end = i;
                break;
            }
        }
        if(end==-1)
        {
            return 0;
        }
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i]>arr[i+1])
            {
                start=i;
                break;
            }
        }
        int newstart =start;
        int newend =end;
        for (; newstart >=0 ; newstart--) {
            if(arr[newstart]<=arr[end])
            {
                break;
            }
        }
        if(newstart==-1)
        {
            return end;
        }
        for (; newend <=arr.length-1 ; newend++) {
            if(arr[newend]>=arr[start])
            {
                break;
            }
        }
        if(newend==arr.length)
        {
            return arr.length-start-1;
        }
        return Math.min(end-newstart-1,newend-start-1);
    }


    public static void main(String[] args) {
      int a[]=  {6,11,20,20,7,22,22,22,6,4,9};
        new Three().findLengthOfShortestSubarray(a);
    }
}

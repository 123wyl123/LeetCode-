package Sword;

public class SixtyNine {
    public int peakIndexInMountainArray(int[] arr) {
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1]&&arr[i]>arr[i+1])
            {
                return i;
            }
        }
        return -1;
    }
}
package Nine;

public class Twelve {
    public int[] sortArray(int[] nums) {
        if (nums == null || nums.length < 2) {
            return nums;
        }
        process(nums, 0, nums.length - 1);
    return nums;
    }
   void process(int[] arr, int L, int R) {
        if (L>=R)
        {
            return;
        }
       swap(arr, L + (int) (Math.random() * (R - L + 1)), R);
       int[] equalArea = netherlandsFlag(arr, L, R);
       process(arr, L, equalArea[0] - 1);
       process(arr, equalArea[1] + 1, R);
    }
    int[] netherlandsFlag(int[] arr, int L, int R) {
        if (L>R)
        {
            return new int[]{-1,-1};
        }
        if (L==R)
        {
            return new int[]{L,R};
        }
        int less =L-1;
        int more =R;
        int index = L;
        while (index<more)
        {
            if (arr[index]==arr[R])
            {
                index++;
            }else if (arr[index]<arr[R])
            {
                swap(arr,index++,++less);
            }else {
                swap(arr, index, --more);
            }
        }
        swap(arr, more, R);
        return new int[]{less + 1, more};
    }

    void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
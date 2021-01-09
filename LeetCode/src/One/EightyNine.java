package One;

public class EightyNine {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        if (length<k)
        {
            return;
        }
        k=k%length;
        for (int i = 0; i <length/2 ; i++) {
            int temp = nums[length-1-i];
            nums[length-1-i]=nums[i];
            nums[i] = temp;
        }
        for (int i = 0; i <k/2 ; i++) {
            int temp =nums[k-1-i];
            nums[k-1-i] = nums[i];
            nums[i] = temp;
        }
        for (int i = k; i <(length+k)/2 ; i++) {
            int temp = nums[length+k-i-1];
            nums[length+k-i-1]=nums[i];
            nums[i] =temp;
        }

    }


}

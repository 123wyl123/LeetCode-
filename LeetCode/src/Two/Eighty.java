package Two;

import java.util.Arrays;

public class Eighty {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int a[] = new int[length];
        int index =0;
        int i=0;
        while (index<length) {
            a[index++] = nums[i];
            if (index<length)
            {
                a[index++] = nums[length - 1 - i];
            }

            i++;
        }
        for (int j = 0; j <nums.length ; j++) {
            nums[j] = a[j];
        }
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};
        new Eighty().wiggleSort(a);
    }
}

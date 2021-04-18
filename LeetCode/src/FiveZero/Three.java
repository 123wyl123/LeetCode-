package FiveZero;

public class Three {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int a[] = new int[nums.length];
        int temp =0;
        for (int i = 0; i <nums.length ; i++) {
            temp=temp^nums[i];
            double pow = Math.pow(2, maximumBit);
            int i1 = ~temp&((int)pow-1);
            a[nums.length-1-i]=i1;

        }
        return a;
    }

    public static void main(String[] args) {
        int a[]={0,1,1,3};
        new Three().getMaximumXor(a,2);
    }
}

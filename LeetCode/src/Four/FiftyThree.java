package Four;

public class FiftyThree {
    public int minMoves(int[] nums) {
        int sum= 0;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            min = Math.min(num,min);
                   sum+=num;
        }
        return sum-nums.length*min;
    }
}

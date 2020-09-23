package Four;

public class NinetyFour {
    int sum;
    int sum1;

    public int findTargetSumWays(int[] nums, int S) {
        sum = 0;
        sum1 = S;
        dps(nums, 0, 0);
        return sum;
    }

    void dps(int[] nums, int n, int temp) {
        if (n == nums.length) {
            if (temp == sum1) {
                sum++;
            }
            return;
        }
        for (int i = n; i < nums.length; i++) {
            temp -= nums[i];
            dps(nums, i + 1, temp);
            temp += nums[i];
            temp += nums[i];
        }
        if (temp == sum1) {
            sum++;
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 1, 1, 1, 1};
        new NinetyFour().findTargetSumWays(a, 3);
    }
}

package Zero;

import java.util.Deque;
import java.util.LinkedList;

public class FourtyTwo {
    public int trap(int[] height) {
        int ans = 0, current = 0;
        Deque<Integer> stack = new LinkedList<Integer>();
        while (current < height.length) {
            while (!stack.isEmpty() && height[current] > height[stack.peek()]) {
                int top = stack.pop();
                if (stack.isEmpty())
                    break;
                int distance = current - stack.peek() - 1;
                int bounded_height = Math.min(height[current], height[stack.peek()]) - height[top];
                ans += distance * bounded_height;
            }
            stack.push(current++);
        }
        return ans;
    }

    public int trap1(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }
        int N = height.length;
        int water = 0;
        int L = 1;
        int leftMax = height[0];
        int R = N - 2;
        int rightMax = height[N - 1];
        while (L <= R) {
            if (leftMax <= rightMax) {
                water += Math.max(leftMax - height[L], 0);
                leftMax = Math.max(leftMax, height[L++]);
            } else {
                water += Math.max(rightMax - height[R], 0);
                rightMax = Math.max(rightMax, height[R--]);
            }
        }
        return water;
    }

    public static void main(String[] args) {
        int a[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        new FourtyTwo().trap(a);
    }
}

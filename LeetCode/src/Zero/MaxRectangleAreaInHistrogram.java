package Zero;

import java.util.Stack;

public class MaxRectangleAreaInHistrogram {
    public int MaxRectangleArea(int[] A) {
        Stack<Integer> s = new Stack<Integer>();
        if (A == null || A.length == 0)
            return 0;
        // Initialize max area
        int maxArea = 0;
        int i = 0;
        // run through all bars of given histogram
        while (i < A.length) {
            // If current bar is higher than the bar of the stack peek, push it to stack.
            if (s.empty() || A[s.peek()] <= A[i])
                s.push(i++);
            else {
                // if current bar is lower than the stack peek, calculate area of rectangle with stack top as the smallest bar.
                // 'i' is 'right index' for the top and element before top in stack is 'left index'
                int top = s.pop();
                // calculate the area with A[top] stack as smallest bar and update maxArea if needed
                maxArea = Math.max(maxArea, A[top] * (s.empty() ? i : i - s.peek() - 1));
            }
        }
        // Now pop the remaining bars from stack and calculate area with every popped bar as the smallest bar.
        while (!s.isEmpty()) {
            int top = s.pop();
            maxArea = Math.max(maxArea, A[top] * (s.empty() ? i : i - s.peek() - 1));
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int a[] = {3, 2, 5, 6, 1, 4, 4};
        MaxRectangleAreaInHistrogram b = new MaxRectangleAreaInHistrogram();
        b.MaxRectangleArea(a);
    }

    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }
        int i;
        int temp;
        Stack<Integer> a = new Stack<>();
        int maxA = 0;
        for (i = 0; i < heights.length; i++) {
            if (a.isEmpty() || heights[a.peek()] <= heights[i]) {
                a.push(i++);
            } else {
                temp = a.pop();
                if (a.isEmpty()) {
                    maxA = Math.max(maxA, heights[temp] * i);
                }
                maxA = Math.max(maxA, heights[temp] * (i - 1 - a.peek()));
            }
        }
        while (!a.isEmpty()) {
            int top = a.pop();
            maxA = Math.max(maxA, heights[top] * (a.empty() ? i : i - a.peek() - 1));
        }
        return maxA;
    }


}
//或者用分治法
//找出最小的一条矩形
//1.最小矩形乘以长度
//2.最小矩形右边递归
//3.最小矩形左边递归
//本质上还是找到以当前height为高度的最大矩形 即在左边和右边分别找到小于当前元素的第一个元素，
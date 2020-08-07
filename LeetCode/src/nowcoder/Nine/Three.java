package nowcoder.Nine;

import java.util.ArrayList;
import java.util.List;

public class Three {
    List<Integer> ans;

    public void dfs(int l1, int r1, int l2, int r2, int[] pre, int[] suf) {
        if (l1 > r1) return;
        if (l2 > r2) return;
        if (l1 == r1) {
            ans.add(pre[l1]);
            return;
        }
        int root = pre[l1];
        int flag = l2;
        while (suf[flag] != pre[l1 + 1]) flag++;
        int len = flag - l2 + 1;
        dfs(l1 + 1, l1 + 1 + len - 1, l2, flag, pre, suf);
        ans.add(root);
        dfs(l1 + len + 1, r1, flag + 1, r2 - 1, pre, suf);

    }

    public int[] solve(int n, int[] pre, int[] suf) {
        // write code here
        ans = new ArrayList<>();
        dfs(0, n - 1, 0, n - 1, pre, suf);
        int[] res = new int[n];
        for (int i = 0; i < n; i++) res[i] = ans.get(i);
        return res;
    }

    public static void main(String[] args) {
        int []a = {3,2,1,4,5};
        int []b={1,5,4,2,3};
        new Three().solve(5,a,b);
    }
}

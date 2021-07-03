package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThirtyFour {

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] s = br.readLine().split(" ");
            long l = Long.valueOf(s[0]);
            long r = Long.valueOf(s[1]);
            List<Long> list = new ArrayList<>();
            for (int i = 1; i <= 10; i++) {
                dfs(list, 0, i, 0);
            }
            Collections.sort(list);
            int ll = 0;
            int rr = list.size() - 1;
            while (ll < rr) {
                int mid = (ll + rr) >> 1;
                if (list.get(mid) >= l)
                    rr = mid;
                else
                    ll = mid + 1;
            }
            long start = list.get(ll);
            int idx = ll;
            long ans = 0;
            while (l <= r) {
                ans += (Math.min(r, start) - l + 1) * start;
                idx++;
                l = start + 1;
                start = list.get(idx);
            }
            System.out.println(ans);
        }

        private static void dfs(List<Long> list, int idx, int n, long cur) {
            if (idx == n) {
                list.add(cur);
                return;
            }
            dfs(list, idx + 1, n, cur * 10 + 4);
            dfs(list, idx + 1, n, cur * 10 + 7);
        }

}


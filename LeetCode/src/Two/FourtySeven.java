package Two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourtySeven {
    public List<String> findStrobogrammatic(int n) {
        List<String> te = helper(n, n);
        return te;
    }

    public List<String> helper(int n, int m) {
        if (n < 0 || m < 0 || n > m) {
            return null;
        }
        if (n == 0) return new ArrayList<String>(Arrays.asList(""));
        if (n == 1) return new ArrayList<String>(Arrays.asList("0", "1", "8"));
        List<String> a = helper(n - 2, m);
        List<String> res = new ArrayList<String>();
        for (int i = 0; i < a.size(); i++) {
            String s = a.get(i);
            if (n != m) res.add("0" + s + "0");
            res.add("1" + s + "1");
            res.add("6" + s + "9");
            res.add("8" + s + "8");
            res.add("9" + s + "6");
        }
        return res;
    }
}

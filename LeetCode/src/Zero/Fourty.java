package Zero;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Fourty {


    int temp;
    HashSet<List<Integer>> aa;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        temp = target;
        List<List<Integer>> a = new LinkedList<>();
        aa = new HashSet<>();
        Arrays.sort(candidates);
        c(candidates, 0, 0, new LinkedList<Integer>());
        for (List<Integer> integers : aa) {
            a.add(new LinkedList<>(integers));
        }

        return a;
    }

    public void c(int[] candidates, int n, int target, LinkedList<Integer> integers) {
        if (target == temp) {
            aa.add(new LinkedList<>(integers));
            return;
        }
        for (int i = n; i < candidates.length; i++) {
            target += candidates[i];
            if (i > n && candidates[i] == candidates[i - 1]) {
                target -= candidates[i];
                continue;
            }
            if (target > temp) {
                target -= candidates[i];
            } else {
                integers.add(candidates[i]);
                c(candidates, i + 1, target, integers);
                integers.removeLast();
                target -= candidates[i];
            }
        }
    }
}
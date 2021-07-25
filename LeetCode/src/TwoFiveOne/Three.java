package TwoFiveOne;

import java.util.LinkedList;

public class Three {
    int max = 0, m, n;

    public int maxCompatibilitySum(int[][] students, int[][] mentors) {
        m = students.length;
        n = students[0].length;
        boolean[] visited = new boolean[m];
        back(0, students, mentors, visited, 0);
        return max;
    }

    private void back(int studentID, int[][] students, int[][] mentors, boolean[] visited, int sum) {
        if (studentID == m) {
            max = Math.max(max, sum);
            return;
        }
        for (int i = studentID; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[j]) continue;
                visited[j] = true;
                int val = 0;
                for (int k = 0; k < n; k++) {
                    if (students[i][k] == mentors[j][k]) val++;
                }
                back(i + 1, students, mentors, visited, sum + val);
                visited[j] = false;
            }
        }
    }


}
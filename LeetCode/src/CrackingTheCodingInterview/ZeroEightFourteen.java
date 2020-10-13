package CrackingTheCodingInterview;

public class ZeroEightFourteen {
    public int countEval(String s, int result) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        int t[][] = new int[length][length];
        int f[][] = new int[length][length];
        for (int i = 0; i < length; i += 2) {
            t[i][i] = chars[i] == '1' ? 1 : 0;
            f[i][i] = chars[i] == '0' ? 1 : 0;
        }
        for (int i = length - 3; i >= 0; i -= 2) {
            for (int j = i + 2; j < length; j += 2) {
                for (int k = i + 1; k < length; k += 2) {
                    switch (chars[k]) {
                        case '&':
                            t[i][j] += t[i][k - 1] * t[k + 1][j];
                            f[i][j] += f[i][k - 1] * f[k + 1][j];
                            f[i][j] += f[i][k - 1] * t[k + 1][j];
                            f[i][j] += t[i][k - 1] * f[k + 1][j];
                            break;
                        case '|':
                            t[i][j] += t[i][k - 1] * t[k + 1][j];
                            t[i][j] += t[i][k - 1] * f[k + 1][j];
                            t[i][j] += f[i][k - 1] * t[k + 1][j];
                            f[i][j] += f[i][k - 1] * f[k + 1][j];
                            break;
                        case '^':
                            t[i][j] += t[i][k - 1] * f[k + 1][j];
                            t[i][j] += f[i][k - 1] * t[k + 1][j];
                            f[i][j] += f[i][k - 1] * f[k + 1][j];
                            f[i][j] += t[i][k - 1] * t[k + 1][j];
                    }

                }
            }
        }
        return result == 1 ? t[0][length - 1] : f[0][length - 1];
    }

}

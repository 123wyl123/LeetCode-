package Eight;

import java.util.ArrayList;
import java.util.List;

public class Sixteen {
    public List<String> ambiguousCoordinates(String S) {
        List<String> ans = new ArrayList();
        for (int i = 2; i < S.length()-1; ++i)
            for (String left: make(S, 1, i))
                for (String right: make(S, i, S.length()-1))
                    ans.add("(" + left + ", " + right + ")");
        return ans;
    }

    public List<String> make(String S, int i, int j) {
        // Make on S.substring(i, j)
        List<String> ans = new ArrayList();
        for (int d = 1; d <= j-i; ++d) {
            String left = S.substring(i, i+d);
            String right = S.substring(i+d, j);
            if ((!left.startsWith("0") || left.equals("0"))
                    && !right.endsWith("0"))
                ans.add(left + (d < j-i ? "." : "") + right);
        }
        return ans;
    }
    public List<String> ambiguousCoordinates1(String S) {
        List<String> result = new ArrayList<>();
        search(S, 0, new StringBuilder(), result, true);
        return result;
    }

    private void search(String s, int i, StringBuilder builder, List<String> result, boolean first) {
        int length = builder.length();
        if (first) {
            i++;
            builder.append("(");
            if (s.charAt(i) == '0') {
                builder.append('0');
                search(s, i + 1, builder, result, false);
                builder.append('.');
                i++;
                for (; i < s.length() - 2; i++) {
                    builder.append(s.charAt(i));
                    if (s.charAt(i) != '0') {
                        search(s, i + 1, builder, result, false);
                    }
                }
            } else {
                for (; i < s.length() - 2;) {
                    builder.append(s.charAt(i));
                    search(s, i + 1, builder, result, false);
                    i++;
                    if (i < s.length() - 2) {
                        int temp = builder.length();
                        builder.append('.');
                        for (int j = i; j < s.length() - 2; j++) {
                            builder.append(s.charAt(j));
                            if (s.charAt(j) != '0') {
                                search(s, j + 1, builder, result, false);
                            }
                        }
                        builder.setLength(temp);
                    }
                }
            }
        } else {
            builder.append(", ");
            if (s.charAt(i) == '0') {
                if (i == s.length() - 2) {
                    result.add(builder.append(s.substring(i)).toString());
                } else {
                    builder.append("0.");
                    i++;
                    if (i < s.length() - 1 && s.charAt(s.length() - 2) != '0') {
                        builder.append(s.substring(i));
                        result.add(builder.toString());
                    }
                }
            } else {
                int temp = builder.length();
                builder.append(s.substring(i));
                result.add(builder.toString());
                builder.setLength(temp);
                if (s.charAt(s.length() - 2) != '0') {
                    int start = i;
                    i++;
                    for (int j = i; j < s.length() - 1; j++) {
                        builder.append(s.substring(start, j)).append('.').append(s.substring(j));
                        result.add(builder.toString());
                        builder.setLength(temp);
                    }
                }
            }
        }
        builder.setLength(length);
    }
}


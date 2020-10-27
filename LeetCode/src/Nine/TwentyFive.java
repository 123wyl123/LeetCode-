package Nine;

public class TwentyFive {
    public boolean isLongPressedName(String name, String typed) {
        int l = 0;
        int r = 0;

        while (l < name.length() && r < typed.length()) {
            if (name.charAt(l) == typed.charAt(r)) {
                l++;
                r++;
            } else {
                if (r > 0 && typed.charAt(r) == typed.charAt(r - 1)) {
                    r++;

                } else {
                    return false;
                }
            }
        }
        if (name.length() != l || typed.length() != r) {
            if (name.length() != l) {
                return false;
            }
            while (typed.charAt(r) == typed.charAt(r - 1)) {
                r++;
                if (r == typed.length()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        new TwentyFive().isLongPressedName("pyplrz",
                "ppyypllr");
    }
}

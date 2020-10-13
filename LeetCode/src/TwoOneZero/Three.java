package TwoOneZero;

public class Three {
    public boolean checkPalindromeFormation(String a, String b) {
        int l = 0;
        int r = b.length();
        while (l < r) {
            if (a.charAt(l) == b.charAt(r)) {
                l++;
                r--;
            } else {
                break;
            }
        }
        if (l <= r) {
            return true;
        }
        int l1 = l;
        int r1 = r;
        while (l < r) {
            if (a.charAt(l) == a.charAt(r)) {
                l++;
                r--;
            } else {
                break;
            }
        }
        if (l == r) {
            return true;
        }
        l = l1;
        r = r1;
        while (l < r) {
            if (b.charAt(l) == b.charAt(r)) {
                l++;
                r--;
            } else {
                break;
            }
        }
        if (l == r) {
            return true;
        }
        l = 0;
        r = a.length();
        while (l < r) {
            if (b.charAt(l) == a.charAt(r)) {
                l++;
                r--;
            } else {
                break;
            }
        }
        if (l == r) {
            return true;
        }
        l1 = l;
        r1 = r;
        while (l < r) {
            if (b.charAt(l) == b.charAt(r)) {
                l++;
                r--;
            } else {
                break;
            }
        }
        if (l == r) {
            return true;
        }
        l = l1;
        r = r1;
        while (l < r) {
            if (a.charAt(l) == a.charAt(r)) {
                l++;
                r--;
            } else {
                break;
            }
        }
        if (l == r) {
            return true;
        }
        return false;
    }
}

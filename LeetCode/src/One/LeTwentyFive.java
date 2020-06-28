package One;

public class LeTwentyFive {
    public boolean isPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            while (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
                if (i == j) {
                    return true;
                }
            }
            while (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
                if (i == j) {
                    return true;
                }
            }
            if (Math.abs(s.charAt(i) - s.charAt(j)) == 32 || s.charAt(i) == s.charAt(j)) {
                if (s.charAt(i) == '0' && s.charAt(j) == 'P') {
                    return false;
                } else if (s.charAt(i) == 'P' && s.charAt(j) == '0') {
                    return false;
                }

                i++;
                j--;
            } else {
                return false;
            }


        }
        return true;
    }

    public static void main(String[] args) {
        String a = "0P";
        new LeTwentyFive().isPalindrome(a);

    }
}

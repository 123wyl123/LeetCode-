package Thirteen;

public class TwentyEight {
    public String breakPalindrome(String palindrome) {
        if (palindrome.length() <= 1) {
            return "";

        }
        char[] chars = palindrome.toCharArray();
        boolean flag = false;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != 'a') {

                flag = true;
                if (i == chars.length / 2) {
                    chars[chars.length - 1] = 'b';

                } else {
                    chars[i] = 'a';
                }
                break;
            }
        }

        if (flag) {
            return new String(chars);
        } else {

            chars[chars.length - 1] = 'b';
            return new String(chars);

        }
    }
}

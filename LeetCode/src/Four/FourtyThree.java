package Four;

public class FourtyThree {
    public int compress(char[] chars) {
        if (chars.length <= 1) {
            return chars.length;
        }

        int temp = 0;
        int k = 0;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                k++;

            } else {
                if (k == 0) {
                    chars[temp] = chars[i - 1];
                    temp++;
                } else {
                    k++;
                    int m = 0;
                    int a = 0;
                    String s = "" + k;
                    chars[temp++] = chars[i - 1];

                    for (int j = 0; j < s.length(); j++) {
                        chars[temp++] = s.charAt(j);
                    }
                    k = 0;
                }
            }

        }

        if (k != 0) {
            chars[temp++] = chars[chars.length - 1];
            String s = "" + k;
            for (int j = 0; j < s.length(); j++) {
                chars[temp++] = s.charAt(j);
            }
            k = 0;
        } else {
            chars[temp++] = chars[chars.length - 1];
        }


        return temp;
    }

    public static void main(String[] args) {
        char[] a = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        new FourtyThree().compress(a);
    }
}

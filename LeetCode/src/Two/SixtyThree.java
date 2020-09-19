package Two;

public class SixtyThree {
    public boolean isUgly(int num) {
        if (num < 1) return false;
        while (num % 2 == 0) num /= 2;
        while (num % 3 == 0) num /= 3;
        while (num % 5 == 0) num /= 5;
        return num == 1;
    }

    public static void main(String[] args) {
        new  SixtyThree().isUgly(6);
    }
}

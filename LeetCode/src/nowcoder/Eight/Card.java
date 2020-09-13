package nowcoder.Eight;

public class Card {
    public static int win1(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

                f(arr, 0, arr.length - 1);
                s(arr, 0, arr.length - 1);
      return 1;
    }

    // L....R
    // F  S  L+1..R
    // L..R-1
    public static int f(int[] arr, int L, int R) {
        if (L == R) {
            return arr[L];
        }

        return Math.max(
                arr[L] + s(arr, L + 1, R),
                arr[R] + s(arr, L, R - 1)
        );
    }

    // arr[L..R]
    public static int s(int[] arr, int L, int R) {
        if (L == R) {
            return 0;
        }
        return Math.min(
                f(arr, L + 1, R), // arr[i]
                f(arr, L, R - 1)  // arr[j]
        );
    }

    public static void main(String[] args) {
        int[] arr = { 4,7,9,5,19,29,80,4 };

     win1(arr);
    }
}

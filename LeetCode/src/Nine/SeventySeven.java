package Nine;

public class SeventySeven {
    public int[] sortedSquares(int[] A) {
        int start = 0;
        int end = A.length-1;
        int i = end;
        int[] B = new int[A.length];
        while(i >= 0){
            B[i--] = A[start]*A[start] >= A[end]*A[end]? A[start]*A[start++]:A[end]*A[end--];
        }
        return B;
    }

    public static void main(String[] args) {
        System.out.println(1);
    }
    }

